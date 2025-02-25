package com.flansmod.client;

import com.flansmod.api.IControllable;
import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.client.gui.GuiTeamScores;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.IScope;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.network.PacketTeamInfo.PlayerScoreData;
import com.flansmod.common.teams.Team;
import com.flansmod.common.types.InfoType;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Property;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

@SuppressWarnings("unused")
public class FlansModClient extends FlansMod {
    //Plane / Vehicle control handling
    /**
     * Whether the player has received the vehicle tutorial text
     */
    public static boolean doneTutorial = false;
    /**
     * Whether the player is in mouse control mode
     */
    public static boolean controlModeMouse = true;
    /**
     * A delayer on the mouse control switch
     */
    public static int controlModeSwitchTimer = 20;

    /**
     * The delay between shots / reloading
     */
    public static float shootTimeLeft, shootTimeRight;

    //Recoil variables
    /**
     * Fancy Recoil System
     */
    public static GunType.GunRecoil playerRecoil = new GunType.GunRecoil();
    /**
     * The recoil applied to the player view by shooting
     */
    public static float playerRecoilPitch;
    public static float playerRecoilYaw;
    /**
     * The amount of compensation to apply to the recoil in order to bring it back to normal
     */
    public static float antiRecoilPitch;
    public static float antiRecoilYaw;

    public static int lastBulletReload = 0;
    public static int shotState = -1;

    //Scope variables
    /**
     * A delayer on the scope button to avoid repeat presses
     */
    public static int scopeTime;
    /**
     * The scope that is currently being looked down
     */
    public static IScope currentScope = null;
    /**
     * The transition variable for zooming in / out with a smoother. 0 = unscoped, 1 = scoped
     */
    public static float zoomProgress = 0F, lastZoomProgress = 0F;
    public static float stanceProgress = 0F, lastStanceProgress = 0F;
    /**
     * The zoom level of the last scope used, for transitioning out of being scoped, even after the scope is forgotten
     */
    public static float lastZoomLevel = 1F, lastFOVZoomLevel = 1F;

    //Variables to hold the state of some settings so that after being hacked for scopes, they may be restored
    /**
     * The player's mouse sensitivity setting, as it was before being hacked by my mod
     */
    public static float originalMouseSensitivity = 0.5F;
    /**
     * The player's original FOV
     */
    public static float originalFOV = 90F;
    /**
     * The original third person mode, before being hacked
     */
    public static int originalThirdPerson = 0;

    /**
     * Whether the player is in a plane or not
     */
    public static boolean inPlane = false;

    /**
     * Packet containing teams mod information from the server
     */
    public static PacketTeamInfo teamInfo;
    /**
     * When a round ends, the teams score GUI is locked for this length of time
     */
    public static int teamsScoreGUILock = 0;

    public static AimType aimType;
    public static FlanMouseButton fireButton;
    public static FlanMouseButton aimButton;
    public static float fov;

    public static boolean hitMarker = false;
    public static boolean hitMarkerHeadshot = false;
    public static float hitMarkerPenAmount = 1F;
    public static boolean hitMarkerExplosion = false;
    
    public static boolean combineAmmoOnReload = true;
    public static boolean ammoToUpperInventoryOnReload = false;
    
    
    public void load() {
        log("Loading Flan's mod client side.");
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void renderOffHandGun(RenderPlayerEvent.Specials.Post event) {
        RenderPlayer renderer = event.renderer;
        EntityPlayer player = event.entityPlayer;
        PlayerData data = PlayerHandler.getPlayerData(player, Side.CLIENT);

        ItemStack gunStack;

        //Check current stack is a one handed gun
        if (player instanceof EntityOtherPlayerMP) {
            gunStack = data.offHandGunStack;
        } else {
            ItemStack currentStack = player.getCurrentEquippedItem();
            if (currentStack == null || !(currentStack.getItem() instanceof ItemGun) || !((ItemGun) currentStack.getItem()).type.getOneHanded() || data.offHandGunSlot == 0)
                return;
            gunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
        }

        if (gunStack == null || !(gunStack.getItem() instanceof ItemGun))
            return;

        //Render!
        GL11.glPushMatrix();
        renderer.modelBipedMain.bipedLeftArm.postRender(0.0625F);
        GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);

        float f2 = 1F;

        GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
        GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
        GL11.glScalef(-f2, -f2, f2);

        int k = gunStack.getItem().getColorFromItemStack(gunStack, 0);
        float f11 = (float) (k >> 16 & 255) / 255.0F;
        float f12 = (float) (k >> 8 & 255) / 255.0F;
        float f3 = (float) (k & 255) / 255.0F;
        GL11.glColor4f(f11, f12, f3, 1.0F);
        ClientProxy.gunRenderer.renderOffHandGun(player, gunStack);

        GL11.glPopMatrix();
    }

    //Handle player hiding / name tag removal
    @SubscribeEvent
    public void renderLiving(RenderPlayerEvent.Pre event) {
        PlayerData data = PlayerHandler.getPlayerData(event.entityPlayer, Side.CLIENT);

        //Render debug boxes for player snapshots
        if (FlansMod.DEBUG && data != null) {
            if (data.snapshots[0] != null)
                data.snapshots[0].renderSnapshot();
        }

        RendererLivingEntity.NAME_TAG_RANGE = FlansMod.nameTagRenderRange;
        RendererLivingEntity.NAME_TAG_RANGE_SNEAK = FlansMod.nameTagSneakRenderRange;
        if (event.entity instanceof EntityPlayer && teamInfo != null && teamInfo.gametype != null && !"No Gametype".equals(teamInfo.gametype)) {
            PlayerScoreData rendering = teamInfo.getPlayerScoreData(event.entity.getCommandSenderName());
            PlayerScoreData thePlayer = teamInfo.getPlayerScoreData(minecraft.thePlayer.getCommandSenderName());

            Team renderingTeam = rendering == null ? Team.spectators : rendering.team.team;
            Team thePlayerTeam = thePlayer == null ? Team.spectators : thePlayer.team.team;

            //Do custom skin overrides
            //If we have no stored skin, try to get it
            if (data.skin == null)
                data.skin = ((AbstractClientPlayer) event.entityPlayer).getLocationSkin();
            //Only once we have the stored skin may we override
            if (data.skin != null) {
                ResourceLocation skin = rendering == null || rendering.playerClass == null ? null : FlansModResourceHandler.getTexture(rendering.playerClass);
                ((AbstractClientPlayer) event.entityPlayer).func_152121_a(Type.SKIN, skin == null ? data.skin : skin);
            }

            //Spectators see all
            if (thePlayerTeam == Team.spectators)
                return;
            //Nobody sees spectators
            if (renderingTeam == Team.spectators) {
                event.setCanceled(true);
                return;
            }
            //If we are on the other team, don't render the name tag
            if (renderingTeam != thePlayerTeam) {
                RendererLivingEntity.NAME_TAG_RANGE = 0F;
                RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0F;
                return;
            }
            //If its DM, don't render the name tag
            if (!teamInfo.sortedByTeam) {
                RendererLivingEntity.NAME_TAG_RANGE = 0F;
                RendererLivingEntity.NAME_TAG_RANGE_SNEAK = 0F;
            }
        }
    }

    public static float shootTime(boolean left) {
        return left ? shootTimeLeft : shootTimeRight;
    }

    public static void tick() {
        if (minecraft.thePlayer == null || minecraft.theWorld == null)
            return;

        if (minecraft.thePlayer.ridingEntity instanceof IControllable && minecraft.currentScreen == null)
            minecraft.displayGuiScreen(new GuiDriveableController((IControllable) minecraft.thePlayer.ridingEntity));

        if (teamInfo != null && teamInfo.timeLeft > 0)
            teamInfo.timeLeft--;

        //Teams GUI lock at end of rounds
        if (teamsScoreGUILock > 0) {
            teamsScoreGUILock--;
            if (minecraft.currentScreen == null)
                minecraft.displayGuiScreen(new GuiTeamScores());
        }

        // Guns
        if (shootTimeLeft > 0)
            shootTimeLeft--;
        if (shootTimeRight > 0)
            shootTimeRight--;
        if (scopeTime > 0)
            scopeTime--;
        if(minecraft.thePlayer.getCurrentEquippedItem() != null &&
                minecraft.thePlayer.getCurrentEquippedItem().getItem() instanceof ItemGun &&
                ((ItemGun) minecraft.thePlayer.getCurrentEquippedItem().getItem()).type.useFancyRecoil) {
            EntityPlayerSP p = minecraft.thePlayer;
            float pspeed = Math.min(0.3f, 3f * (float) (p.motionX * minecraft.thePlayer.motionX
                    + minecraft.thePlayer.motionY * minecraft.thePlayer.motionY
                    + minecraft.thePlayer.motionZ * minecraft.thePlayer.motionZ));
            boolean sneaking = minecraft.thePlayer.isSneaking();
            float recoilToAdd = playerRecoil.update(sneaking, currentScope != null, pspeed);
            boolean enableRecoil = true;
            if (p.ridingEntity instanceof EntitySeat && ((EntitySeat) p.ridingEntity).seatInfo != null) {
                EntitySeat s = (EntitySeat) p.ridingEntity;
                float newPlayerPitch = s.playerLooking.getPitch() + recoilToAdd;
                float horizontal = playerRecoil.horizontal;
                float newPlayerYaw = s.playerLooking.getYaw() + horizontal;
                if (newPlayerPitch > -s.seatInfo.minPitch) {
                    newPlayerPitch = -s.seatInfo.minPitch;
                }
                if (newPlayerPitch < -s.seatInfo.maxPitch) {
                    newPlayerPitch = -s.seatInfo.maxPitch;
                }
                s.playerLooking.setAngles(newPlayerYaw, newPlayerPitch, 0);
            } else if(enableRecoil){
                minecraft.thePlayer.rotationPitch += recoilToAdd;

                if (minecraft.thePlayer.rotationPitch < -90) {
                    minecraft.thePlayer.rotationPitch = -90;
                } else if (minecraft.thePlayer.rotationPitch > 90) {
                    minecraft.thePlayer.rotationPitch = 90;
                } else {
                    float horizontal = playerRecoil.horizontal;
                    minecraft.thePlayer.rotationYaw += horizontal;
                }
            }
        } else {
            if (playerRecoilPitch > 0) {
                ItemStack itemBeingUsed = minecraft.thePlayer.getCurrentEquippedItem();
                GunType typeHeld = null;
                if (itemBeingUsed != null && itemBeingUsed.getItem() instanceof ItemGun)
                    typeHeld = ((ItemGun) itemBeingUsed.getItem()).type;

                if (typeHeld != null) {
                    playerRecoilPitch *= typeHeld.getRecoilControl(itemBeingUsed, minecraft.thePlayer.isSprinting(), minecraft.thePlayer.isSneaking());
                } else {
                    // idk why this would happen.
                    playerRecoilPitch *= 0.8F;
                }
            }
            minecraft.thePlayer.rotationPitch -= playerRecoilPitch;
            minecraft.thePlayer.rotationYaw -= playerRecoilYaw;
            antiRecoilPitch += playerRecoilPitch;
            antiRecoilYaw += playerRecoilYaw;

            // No anti-recoil if realistic recoil is on,
            // and no anti-recoil if firing and enable sight downward movement is off
            boolean firingGun = Mouse.isButtonDown(fireButton.getButton()) && minecraft.thePlayer.getHeldItem() != null && minecraft.thePlayer.getHeldItem().getItem() instanceof ItemGun;
            if (!FlansMod.realisticRecoil && ((!firingGun) || FlansMod.enableSightDownwardMovement)) {
                minecraft.thePlayer.rotationPitch += antiRecoilPitch * 0.2F;
            }
            minecraft.thePlayer.rotationYaw += antiRecoilYaw * 0.2F;
            antiRecoilPitch *= 0.8F;
            antiRecoilYaw *= 0.8F;
        }
        //Update gun animations for the gun in hand
        for (GunAnimations g : gunAnimationsRight.values()) {
            g.update();
        }
        for (GunAnimations g : gunAnimationsLeft.values()) {
            g.update();
        }

        for (Object obj : minecraft.theWorld.playerEntities) {
            EntityPlayer player = (EntityPlayer) obj;
            ItemStack currentItem = player.getCurrentEquippedItem();
            if (currentItem != null && currentItem.getItem() instanceof ItemGun) {
                if (player == minecraft.thePlayer && minecraft.gameSettings.thirdPersonView == 0)
                    player.clearItemInUse();
                else {
                    if (currentItem.getItemUseAction() == EnumAction.bow ||
                            currentItem.getItemUseAction() == EnumAction.block) {
                        player.setItemInUse(currentItem, 100);
                    }
                }
            }
        }

        //If the currently held item is not a gun or is the wrong gun, unscope
        Item itemInHand = null;
        ItemStack itemstackInHand = minecraft.thePlayer.inventory.getCurrentItem();
        if (itemstackInHand != null)
            itemInHand = itemstackInHand.getItem();
        if (currentScope != null && (itemInHand == null || !(itemInHand instanceof ItemGun && ((ItemGun) itemInHand).type.getCurrentScope(itemstackInHand) == currentScope))) {
            currentScope = null;
            minecraft.gameSettings.fovSetting = originalFOV;
            minecraft.gameSettings.mouseSensitivity = originalMouseSensitivity;
            minecraft.gameSettings.thirdPersonView = originalThirdPerson;
        }

        //Calculate new zoom variables
        lastZoomProgress = zoomProgress;
        if (currentScope == null) {
            zoomProgress *= 0.66F;
        } else {
            zoomProgress = 1F - (1F - zoomProgress) * 0.66F;
        }
        lastStanceProgress = stanceProgress;
        if (!inPlane) {
            stanceProgress *= 0.66F;
        } else {
            stanceProgress = 1F - (1F - stanceProgress) * 0.66F;
        }
        //FlansMod.log(zoomProgress);
        if (minecraft.thePlayer.ridingEntity instanceof IControllable) {
            inPlane = true;
            try {
                ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, ((IControllable) minecraft.thePlayer.ridingEntity).getPlayerRoll(), "camRoll", "R", "field_78495_O");
            } catch (Exception e) {
                log("I forgot to update obfuscated reflection D:");
                throw new RuntimeException(e);
            }
            if (minecraft.thePlayer.ridingEntity instanceof IControllable) {
                try {
                    ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, ((IControllable) minecraft.thePlayer.ridingEntity).getCameraDistance(), "thirdPersonDistance", "E", "field_78490_B");
                } catch (Exception e) {
                    log("I forgot to update obfuscated reflection D:");
                    throw new RuntimeException(e);
                }
            }
        } else if (inPlane) {
            try {
                ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, 0F, "camRoll", "R", "field_78495_O");
            } catch (Exception e) {
                log("I forgot to update obfuscated reflection D:");
                throw new RuntimeException(e);
            }
            try {
                ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, 4.0F, "thirdPersonDistance", "E", "field_78490_B");
            } catch (Exception e) {
                log("I forgot to update obfuscated reflection D:");
                throw new RuntimeException(e);
            }
            inPlane = false;
        }
        if (controlModeSwitchTimer > 0)
            controlModeSwitchTimer--;
    }

    public static void renderTick(float smoothing) {
        //If the zoom has changed sufficiently, update it via reflection
        if (Math.abs(zoomProgress - lastZoomProgress) > 0.0001F) {
            float actualZoomProgress = lastZoomProgress + (zoomProgress - lastZoomProgress) * smoothing;
            float botchedZoomProgress = zoomProgress > 0.8F ? 1F : 0F;
            double zoomLevel = botchedZoomProgress * lastZoomLevel + (1 - botchedZoomProgress);
            float FOVZoomLevel = actualZoomProgress * lastFOVZoomLevel + (1 - actualZoomProgress);
            if (Math.abs(zoomLevel - 1F) < 0.01F)
                zoomLevel = 1.0D;
            try {
                ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, minecraft.entityRenderer, zoomLevel, "cameraZoom", "af", "field_78503_V");
                minecraft.gameSettings.fovSetting = (((originalFOV * 40 + 70) / FOVZoomLevel) - 70) / 40;
            } catch (Exception e) {
                log("I forgot to update obfuscated reflection D:");
                throw new RuntimeException(e);
            }
        }
    }

    static boolean flipControlMode() {
        if (controlModeSwitchTimer > 0)
            return false;
        controlModeMouse = !controlModeMouse;
        FMLClientHandler.instance().getClient().displayGuiScreen(controlModeMouse ? new GuiDriveableController((IControllable) FMLClientHandler.instance().getClient().thePlayer.ridingEntity) : null);
        controlModeSwitchTimer = 40;
        return true;
    }

    public static void reloadModels(boolean reloadSkins) {
        for (InfoType type : InfoType.infoTypes) {
            type.reloadModel();
        }
        if (reloadSkins)
            proxy.forceReload();
    }

    public static Minecraft minecraft = FMLClientHandler.instance().getClient();

    /**
     * Gets the team class from an ID
     */
    public static Team getTeam(int spawnerTeamID) {
        if (teamInfo == null)
            return null;
        else return teamInfo.getTeam(spawnerTeamID);
    }

    public static boolean isCurrentMap(String map) {
        return !(teamInfo == null || teamInfo.mapShortName == null) && teamInfo.mapShortName.equals(map);
    }

    @SideOnly(Side.CLIENT)
    public static EntityFX getParticle(String s, World w, double x, double y, double z) {
        Minecraft mc = Minecraft.getMinecraft();
        //return mc.renderGlobal.doSpawnParticle(s, x, y, z, 0.01D, 0.01D, 0.01D);
        EntityFX fx = null;
        if (s.equals("hugeexplosion"))
            fx = new EntityHugeExplodeFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("largeexplode"))
            fx = new EntityLargeExplodeFX(mc.renderEngine, w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("fireworksSpark"))
            fx = new EntityFireworkSparkFX(w, x, y, z, 0D, 0D, 0D, mc.effectRenderer);
        else if (s.equals("bubble"))
            fx = new EntityBubbleFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("suspended"))
            fx = new EntitySuspendFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("depthsuspend"))
            fx = new EntityAuraFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("townaura"))
            fx = new EntityAuraFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("crit"))
            fx = new EntityCritFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("magicCrit")) {
            fx = new EntityCritFX(w, x, y, z, 0D, 0D, 0D);
            fx.setRBGColorF(fx.getRedColorF() * 0.3F, fx.getGreenColorF() * 0.8F, fx.getBlueColorF());
            fx.nextTextureIndexX();
        } else if (s.equals("smoke"))
            fx = new EntitySmokeFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("mobSpell")) {
            fx = new EntitySpellParticleFX(w, x, y, z, 0D, 0D, 0D);
            fx.setRBGColorF(0F, 0F, 0F);
        } else if (s.equals("mobSpellAmbient")) {
            fx = new EntitySpellParticleFX(w, x, y, z, 0D, 0D, 0D);
            fx.setAlphaF(0.15F);
            fx.setRBGColorF(0F, 0F, 0F);
        } else if (s.equals("spell"))
            fx = new EntitySpellParticleFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("instantSpell")) {
            fx = new EntitySpellParticleFX(w, x, y, z, 0D, 0D, 0D);
            ((EntitySpellParticleFX) fx).setBaseSpellTextureIndex(144);
        } else if (s.equals("witchMagic")) {
            fx = new EntitySmokeFX(w, x, y, z, 0D, 0D, 0D);
            if (fx instanceof EntitySpellParticleFX) {
                ((EntitySpellParticleFX) fx).setBaseSpellTextureIndex(144);
            }
            float f = w.rand.nextFloat() * 0.5F + 0.35F;
            fx.setRBGColorF(1.0F * f, 0.0F * f, 1.0F * f);
        } else if (s.equals("note"))
            fx = new EntityNoteFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("portal"))
            fx = new EntityPortalFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("enchantmenttable"))
            fx = new EntityEnchantmentTableParticleFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("explode"))
            fx = new EntityExplodeFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("flame"))
            fx = new EntityFlameFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("lava"))
            fx = new EntityLavaFX(w, x, y, z);
        else if (s.equals("footstep"))
            fx = new EntityFootStepFX(mc.renderEngine, w, x, y, z);
        else if (s.equals("splash"))
            fx = new EntitySplashFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("wake"))
            fx = new EntityFishWakeFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("largesmoke"))
            fx = new EntitySmokeFX(w, x, y, z, 0D, 0D, 0D, 2.5F);
        else if (s.equals("cloud"))
            fx = new EntityCloudFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("reddust"))
            fx = new EntityReddustFX(w, x, y, z, 0F, 0F, 0F);
        else if (s.equals("snowballpoof"))
            fx = new EntityBreakingFX(w, x, y, z, Items.snowball);
        else if (s.equals("dripWater"))
            fx = new EntityDropParticleFX(w, x, y, z, Material.water);
        else if (s.equals("dripLava"))
            fx = new EntityDropParticleFX(w, x, y, z, Material.lava);
        else if (s.equals("snowshovel"))
            fx = new EntitySnowShovelFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("slime"))
            fx = new EntityBreakingFX(w, x, y, z, Items.slime_ball);
        else if (s.equals("heart"))
            fx = new EntityHeartFX(w, x, y, z, 0D, 0D, 0D);
        else if (s.equals("angryVillager")) {
            fx = new EntityHeartFX(w, x, y, z, 0D, 0D, 0D);
            fx.setParticleTextureIndex(81);
            fx.setRBGColorF(1.0F, 1.0F, 1.0F);
        } else if (s.equals("happyVillager")) {
            fx = new EntityAuraFX(w, x, y, z, 0D, 0D, 0D);
            fx.setParticleTextureIndex(82);
            fx.setRBGColorF(1.0F, 1.0F, 1.0F);
        } else {
            int k;
            String[] astring;

            if (s.startsWith("iconcrack_")) {
                astring = s.split("_", 3);
                int j = Integer.parseInt(astring[1]);

                if (astring.length > 2) {
                    k = Integer.parseInt(astring[2]);
                    fx = new EntityBreakingFX(w, x, y, z, 0D, 0D, 0D, Item.getItemById(j), k);
                } else fx = new EntityBreakingFX(w, x, y, z, 0D, 0D, 0D, Item.getItemById(j), 0);
            } else {
                Block block;

                if (s.startsWith("blockcrack_")) {
                    astring = s.split("_", 3);
                    block = Block.getBlockById(Integer.parseInt(astring[1]));
                    k = Integer.parseInt(astring[2]);
                    fx = (new EntityDiggingFX(w, x, y, z, 0D, 0D, 0D, block, k)).applyRenderColor(k);
                } else if (s.startsWith("blockdust_")) {
                    astring = s.split("_", 3);
                    block = Block.getBlockById(Integer.parseInt(astring[1]));
                    k = Integer.parseInt(astring[2]);
                    fx = (new EntityBlockDustFX(w, x, y, z, 0D, 0D, 0D, block, k)).applyRenderColor(k);
                }
            }
        }

        if (mc.gameSettings.fancyGraphics)
            fx.renderDistanceWeight = 200D;

        if (fx != null)
            mc.effectRenderer.addEffect(fx);
        return fx;
    }

    public static GunAnimations getGunAnimations(EntityLivingBase living, boolean offHand) {
        GunAnimations animations;
        if (offHand) {
            if (FlansModClient.gunAnimationsLeft.containsKey(living))
                animations = FlansModClient.gunAnimationsLeft.get(living);
            else {
                animations = new GunAnimations();
                FlansModClient.gunAnimationsLeft.put(living, animations);
            }
        } else {
            if (FlansModClient.gunAnimationsRight.containsKey(living))
                animations = FlansModClient.gunAnimationsRight.get(living);
            else {
                animations = new GunAnimations();
                FlansModClient.gunAnimationsRight.put(living, animations);
            }
        }
        return animations;
    }

    public static void setAimType(AimType aimInputType) {
        Property cw = FlansMod.configFile.get("Input Settings", "Aim Type", "toggle", "The type of aiming that you want to use 'toggle' or 'hold'");
        cw.set(aimInputType.toString());
        FlansMod.configFile.save();
        aimType = aimInputType;
    }

    public static void setAimButton(FlanMouseButton buttonInput) {
        Property cw = FlansMod.configFile.get("Input Settings", "Aim Button", "left", "The mouse button used to aim a gun 'left' or 'right'");
        cw.set(buttonInput.toString());
        FlansMod.configFile.save();
        aimButton = buttonInput;
    }
    
    public static void setFireButton(FlanMouseButton buttonInput) {
        Property cw = FlansMod.configFile.get("Input Settings", "Fire Button", "right", "The mouse button used to fire a gun 'left' or 'right'");
        cw.set(buttonInput.toString());
        FlansMod.configFile.save();
        fireButton = buttonInput;
    }
    
    public static void setCombineAmmoOnReload(boolean combineAmmoOnReload) {
        Property cw = FlansMod.configFile.get("Input Settings", "Combine Ammo On Reload", true, "Whether or not to combine unloaded magazines with damaged magazines in the inventory");
        cw.set(combineAmmoOnReload);
        FlansMod.configFile.save();
        FlansModClient.combineAmmoOnReload = combineAmmoOnReload;
    }
    
    public static void setAmmoToUpperInventoryOnReload(boolean ammoToUpperInventoryOnReload) {   	                     
        Property cw = FlansMod.configFile.get("Input Settings", "Ammo To Upper Inventory On Reload", false, "Whether or not to first try to put unloaded ammo in the upper inventory instead of the hotbar");
        cw.set(ammoToUpperInventoryOnReload);
        FlansMod.configFile.save();
        FlansModClient.ammoToUpperInventoryOnReload = ammoToUpperInventoryOnReload;
    }
    
}

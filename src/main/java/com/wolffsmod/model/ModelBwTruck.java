// 
// Decompiled by Procyon v0.5.36
// 

package com.wolffsmod.model;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.client.tmt.Coord2D;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelVehicle;

public class ModelBwTruck extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelBwTruck() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[97])[0] = new ModelRendererTurbo((ModelBase)this, 410, 450, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 90, 450, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 180, 450, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 380, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 180, 490, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 230, 490, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 250, 490, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 300, 490, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 300, 450, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 80, 380, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 80, 400, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 80, 380, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 80, 400, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 140, 380, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 235, 380, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 320, 380, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 320, 410, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 380, 410, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 0, 450, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 0, 465, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 50, 450, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 0, 475, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 0, 490, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 235, 428, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 180, 428, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 0, 340, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 260, 340, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 0, 340, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 260, 340, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 70, 340, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 60, 350, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 70, 360, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 70, 340, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 60, 350, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 70, 360, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 100, 340, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 100, 355, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 145, 340, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 145, 360, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 100, 340, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 100, 355, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 145, 340, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 145, 360, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 170, 330, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 80, 440, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 100, 435, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 90, 440, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 115, 435, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 0, 300, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 50, 295, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase)this, 100, 290, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo((ModelBase)this, 150, 285, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo((ModelBase)this, 240, 305, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo((ModelBase)this, 0, 250, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo((ModelBase)this, 30, 250, this.textureX, this.textureY);
        this.bodyModel[55] = new ModelRendererTurbo((ModelBase)this, 0, 280, this.textureX, this.textureY);
        this.bodyModel[56] = new ModelRendererTurbo((ModelBase)this, 10, 280, this.textureX, this.textureY);
        this.bodyModel[57] = new ModelRendererTurbo((ModelBase)this, 65, 250, this.textureX, this.textureY);
        this.bodyModel[58] = new ModelRendererTurbo((ModelBase)this, 65, 265, this.textureX, this.textureY);
        this.bodyModel[59] = new ModelRendererTurbo((ModelBase)this, 110, 250, this.textureX, this.textureY);
        this.bodyModel[60] = new ModelRendererTurbo((ModelBase)this, 145, 250, this.textureX, this.textureY);
        this.bodyModel[61] = new ModelRendererTurbo((ModelBase)this, 110, 270, this.textureX, this.textureY);
        this.bodyModel[62] = new ModelRendererTurbo((ModelBase)this, 145, 270, this.textureX, this.textureY);
        this.bodyModel[63] = new ModelRendererTurbo((ModelBase)this, 180, 250, this.textureX, this.textureY);
        this.bodyModel[64] = new ModelRendererTurbo((ModelBase)this, 190, 250, this.textureX, this.textureY);
        this.bodyModel[65] = new ModelRendererTurbo((ModelBase)this, 190, 255, this.textureX, this.textureY);
        this.bodyModel[66] = new ModelRendererTurbo((ModelBase)this, 180, 270, this.textureX, this.textureY);
        this.bodyModel[67] = new ModelRendererTurbo((ModelBase)this, 190, 270, this.textureX, this.textureY);
        this.bodyModel[68] = new ModelRendererTurbo((ModelBase)this, 190, 275, this.textureX, this.textureY);
        this.bodyModel[69] = new ModelRendererTurbo((ModelBase)this, 0, 195, this.textureX, this.textureY);
        this.bodyModel[70] = new ModelRendererTurbo((ModelBase)this, 80, 195, this.textureX, this.textureY);
        this.bodyModel[71] = new ModelRendererTurbo((ModelBase)this, 300, 195, this.textureX, this.textureY);
        this.bodyModel[72] = new ModelRendererTurbo((ModelBase)this, 300, 215, this.textureX, this.textureY);
        this.bodyModel[73] = new ModelRendererTurbo((ModelBase)this, 240, 250, this.textureX, this.textureY);
        this.bodyModel[74] = new ModelRendererTurbo((ModelBase)this, 250, 250, this.textureX, this.textureY);
        this.bodyModel[75] = new ModelRendererTurbo((ModelBase)this, 270, 250, this.textureX, this.textureY);
        this.bodyModel[76] = new ModelRendererTurbo((ModelBase)this, 255, 250, this.textureX, this.textureY);
        this.bodyModel[77] = new ModelRendererTurbo((ModelBase)this, 0, 160, this.textureX, this.textureY);
        this.bodyModel[78] = new ModelRendererTurbo((ModelBase)this, 140, 160, this.textureX, this.textureY);
        this.bodyModel[79] = new ModelRendererTurbo((ModelBase)this, 300, 160, this.textureX, this.textureY);
        this.bodyModel[80] = new ModelRendererTurbo((ModelBase)this, 140, 175, this.textureX, this.textureY);
        this.bodyModel[81] = new ModelRendererTurbo((ModelBase)this, 0, 140, this.textureX, this.textureY);
        this.bodyModel[82] = new ModelRendererTurbo((ModelBase)this, 0, 100, this.textureX, this.textureY);
        this.bodyModel[83] = new ModelRendererTurbo((ModelBase)this, 25, 100, this.textureX, this.textureY);
        this.bodyModel[84] = new ModelRendererTurbo((ModelBase)this, 65, 100, this.textureX, this.textureY);
        this.bodyModel[85] = new ModelRendererTurbo((ModelBase)this, 90, 100, this.textureX, this.textureY);
        this.bodyModel[86] = new ModelRendererTurbo((ModelBase)this, 100, 100, this.textureX, this.textureY);
        this.bodyModel[87] = new ModelRendererTurbo((ModelBase)this, 125, 100, this.textureX, this.textureY);
        this.bodyModel[88] = new ModelRendererTurbo((ModelBase)this, 125, 125, this.textureX, this.textureY);
        this.bodyModel[89] = new ModelRendererTurbo((ModelBase)this, 150, 100, this.textureX, this.textureY);
        this.bodyModel[90] = new ModelRendererTurbo((ModelBase)this, 0, 80, this.textureX, this.textureY);
        this.bodyModel[91] = new ModelRendererTurbo((ModelBase)this, 125, 80, this.textureX, this.textureY);
        this.bodyModel[92] = new ModelRendererTurbo((ModelBase)this, 0, 55, this.textureX, this.textureY);
        this.bodyModel[93] = new ModelRendererTurbo((ModelBase)this, 150, 55, this.textureX, this.textureY);
        this.bodyModel[94] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[95] = new ModelRendererTurbo((ModelBase)this, 0, 20, this.textureX, this.textureY);
        this.bodyModel[96] = new ModelRendererTurbo((ModelBase)this, 60, 0, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 6, 5, 38, 0.0f);
        this.bodyModel[0].setRotationPoint(40.0f, -4.0f, -19.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 5, 22, 36, 0.0f);
        this.bodyModel[1].setRotationPoint(40.0f, -22.0f, -18.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 22, 2, 36, 0.0f);
        this.bodyModel[2].setRotationPoint(18.0f, -11.0f, -18.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 1, 28, 36, 0.0f);
        this.bodyModel[3].setRotationPoint(17.0f, -37.0f, -18.0f);
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 22, 11, 1, 0.0f);
        this.bodyModel[4].setRotationPoint(18.0f, -22.0f, 17.0f);
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 7, 15, 1, 0.0f);
        this.bodyModel[5].setRotationPoint(18.0f, -37.0f, 17.0f);
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 22, 11, 1, 0.0f);
        this.bodyModel[6].setRotationPoint(18.0f, -22.0f, -18.0f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 7, 15, 1, 0.0f);
        this.bodyModel[7].setRotationPoint(18.0f, -37.0f, -18.0f);
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 17, 2, 36, 0.0f);
        this.bodyModel[8].setRotationPoint(17.0f, -39.0f, -18.0f);
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 14, 1, 14, 0.0f);
        this.bodyModel[9].setRotationPoint(23.0f, -12.0f, 2.0f);
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 2, 18, 14, 0.0f);
        this.bodyModel[10].setRotationPoint(20.0f, -28.0f, 2.0f);
        this.bodyModel[10].rotateAngleZ = 0.1745329f;
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 14, 1, 14, 0.0f);
        this.bodyModel[11].setRotationPoint(23.0f, -12.0f, -15.0f);
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 2, 18, 14, 0.0f);
        this.bodyModel[12].setRotationPoint(20.0f, -28.0f, -15.0f);
        this.bodyModel[12].rotateAngleZ = 0.1745329f;
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 10, 9, 36, 0.0f);
        this.bodyModel[13].setRotationPoint(30.0f, -9.0f, -18.0f);
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 13, 8, 28, 0.0f);
        this.bodyModel[14].setRotationPoint(17.0f, -9.0f, -14.0f);
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 44, 6, 16, 0.0f);
        this.bodyModel[15].setRotationPoint(-27.0f, -7.0f, -8.0f);
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 6, 6, 18, 0.0f);
        this.bodyModel[16].setRotationPoint(-33.0f, -7.0f, -9.0f);
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 19, 6, 16, 0.0f);
        this.bodyModel[17].setRotationPoint(-52.0f, -7.0f, -8.0f);
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 10, 2, 10, 0.0f);
        this.bodyModel[18].setRotationPoint(20.0f, -40.0f, -14.0f);
        this.bodyModel[19].addBox(0.0f, 0.0f, 0.0f, 11, 4, 1, 0.0f);
        this.bodyModel[19].setRotationPoint(20.0f, -42.0f, -4.0f);
        this.bodyModel[20].addBox(0.0f, 0.0f, 0.0f, 1, 4, 10, 0.0f);
        this.bodyModel[20].setRotationPoint(30.0f, -42.0f, -14.0f);
        this.bodyModel[21].addBox(0.0f, 0.0f, 0.0f, 11, 4, 1, 0.0f);
        this.bodyModel[21].setRotationPoint(20.0f, -42.0f, -15.0f);
        this.bodyModel[22].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(5.0, 0.0, 5, 0), new Coord2D(11.0, 0.0, 11, 0), new Coord2D(16.0, 5.0, 16, 5), new Coord2D(16.0, 11.0, 16, 11), new Coord2D(11.0, 16.0, 11, 16), new Coord2D(5.0, 16.0, 5, 16), new Coord2D(0.0, 11.0, 0, 11), new Coord2D(0.0, 5.0, 0, 5) }), 6.0f, 16, 16, 56, 6, 0, new float[] { 8.0f, 6.0f, 8.0f, 6.0f, 8.0f, 6.0f, 8.0f, 6.0f });
        this.bodyModel[22].setRotationPoint(11.0f, -20.0f, -2.0f);
        this.bodyModel[22].rotateAngleY = 1.5707964f;
        this.bodyModel[23].addBox(0.0f, 0.0f, 0.0f, 6, 1, 19, 0.0f);
        this.bodyModel[23].setRotationPoint(11.0f, -10.0f, -18.0f);
        this.bodyModel[23].rotateAngleX = 0.7853982f;
        this.bodyModel[24].addBox(0.0f, 0.0f, 0.0f, 6, 1, 16, 0.0f);
        this.bodyModel[24].setRotationPoint(11.0f, -10.0f, -18.0f);
        this.bodyModel[25].addBox(0.0f, 0.0f, 0.0f, 2, 2, 28, 0.0f);
        this.bodyModel[25].setRotationPoint(19.0f, 1.0f, -14.0f);
        this.bodyModel[26].addBox(0.0f, 0.0f, 0.0f, 8, 3, 16, 0.0f);
        this.bodyModel[26].setRotationPoint(16.0f, -1.0f, -8.0f);
        this.bodyModel[27].addBox(0.0f, 0.0f, 0.0f, 2, 2, 28, 0.0f);
        this.bodyModel[27].setRotationPoint(-32.0f, 1.0f, -14.0f);
        this.bodyModel[28].addBox(0.0f, 0.0f, 0.0f, 8, 3, 16, 0.0f);
        this.bodyModel[28].setRotationPoint(-35.0f, -1.0f, -8.0f);
        this.bodyModel[29].addBox(0.0f, 0.0f, 0.0f, 6, 1, 6, 0.0f);
        this.bodyModel[29].setRotationPoint(26.0f, -8.0f, 14.0f);
        this.bodyModel[29].rotateAngleZ = -0.8552113f;
        this.bodyModel[30].addBox(0.0f, 0.0f, 0.0f, 12, 1, 6, 0.0f);
        this.bodyModel[30].setRotationPoint(14.0f, -8.0f, 14.0f);
        this.bodyModel[31].addBox(0.0f, 0.0f, 0.0f, 1, 6, 6, 0.0f);
        this.bodyModel[31].setRotationPoint(14.0f, -8.0f, 14.0f);
        this.bodyModel[31].rotateAngleZ = -0.715585f;
        this.bodyModel[32].addBox(0.0f, 0.0f, 0.0f, 6, 1, 6, 0.0f);
        this.bodyModel[32].setRotationPoint(26.0f, -8.0f, -20.0f);
        this.bodyModel[32].rotateAngleZ = -0.8552113f;
        this.bodyModel[33].addBox(0.0f, 0.0f, 0.0f, 12, 1, 6, 0.0f);
        this.bodyModel[33].setRotationPoint(14.0f, -8.0f, -20.0f);
        this.bodyModel[34].addBox(0.0f, 0.0f, 0.0f, 1, 6, 6, 0.0f);
        this.bodyModel[34].setRotationPoint(14.0f, -8.0f, -20.0f);
        this.bodyModel[34].rotateAngleZ = -0.715585f;
        this.bodyModel[35].addBox(0.0f, 0.0f, 0.0f, 6, 1, 11, 0.0f);
        this.bodyModel[35].setRotationPoint(-25.0f, -8.0f, 9.0f);
        this.bodyModel[35].rotateAngleZ = -0.8552113f;
        this.bodyModel[36].addBox(0.0f, 0.0f, 0.0f, 12, 1, 9, 0.0f);
        this.bodyModel[36].setRotationPoint(-37.0f, -8.0f, 11.0f);
        this.bodyModel[37].addBox(0.0f, 0.0f, 0.0f, 1, 6, 10, 0.0f);
        this.bodyModel[37].setRotationPoint(-37.0f, -8.0f, 10.0f);
        this.bodyModel[37].rotateAngleZ = -0.715585f;
        this.bodyModel[38].addBox(0.0f, 0.0f, 0.0f, 8, 7, 1, 0.0f);
        this.bodyModel[38].setRotationPoint(-34.0f, -8.0f, 9.0f);
        this.bodyModel[39].addBox(0.0f, 0.0f, 0.0f, 6, 1, 11, 0.0f);
        this.bodyModel[39].setRotationPoint(-25.0f, -8.0f, -20.0f);
        this.bodyModel[39].rotateAngleZ = -0.8552113f;
        this.bodyModel[40].addBox(0.0f, 0.0f, 0.0f, 12, 1, 10, 0.0f);
        this.bodyModel[40].setRotationPoint(-37.0f, -8.0f, -20.0f);
        this.bodyModel[41].addBox(0.0f, 0.0f, 0.0f, 1, 6, 11, 0.0f);
        this.bodyModel[41].setRotationPoint(-37.0f, -8.0f, -20.0f);
        this.bodyModel[41].rotateAngleZ = -0.715585f;
        this.bodyModel[42].addBox(0.0f, 0.0f, 0.0f, 8, 7, 1, 0.0f);
        this.bodyModel[42].setRotationPoint(-34.0f, -8.0f, -10.0f);
        this.bodyModel[43].addBox(0.0f, 0.0f, 0.0f, 4, 5, 38, 0.0f);
        this.bodyModel[43].setRotationPoint(-54.0f, -5.0f, -19.0f);
        this.bodyModel[44].addBox(0.0f, 0.0f, 0.0f, 1, 2, 3, 0.0f);
        this.bodyModel[44].setRotationPoint(39.0f, -29.0f, 18.0f);
        this.bodyModel[45].addBox(0.0f, 0.0f, 0.0f, 1, 10, 4, 0.0f);
        this.bodyModel[45].setRotationPoint(38.0f, -33.0f, 19.0f);
        this.bodyModel[46].addBox(0.0f, 0.0f, 0.0f, 1, 2, 3, 0.0f);
        this.bodyModel[46].setRotationPoint(39.0f, -29.0f, -21.0f);
        this.bodyModel[47].addBox(0.0f, 0.0f, 0.0f, 1, 10, 4, 0.0f);
        this.bodyModel[47].setRotationPoint(38.0f, -33.0f, -23.0f);
        this.bodyModel[48].addBox(0.0f, 0.0f, 0.0f, 4, 2, 36, 0.0f);
        this.bodyModel[48].setRotationPoint(-52.0f, -9.0f, -18.0f);
        this.bodyModel[49].addBox(0.0f, 0.0f, 0.0f, 4, 2, 36, 0.0f);
        this.bodyModel[49].setRotationPoint(-43.0f, -9.0f, -18.0f);
        this.bodyModel[50].addBox(0.0f, 0.0f, 0.0f, 4, 2, 36, 0.0f);
        this.bodyModel[50].setRotationPoint(-23.0f, -9.0f, -18.0f);
        this.bodyModel[51].addBox(0.0f, 0.0f, 0.0f, 4, 2, 36, 0.0f);
        this.bodyModel[51].setRotationPoint(6.0f, -9.0f, -18.0f);
        this.bodyModel[52].addBox(0.0f, 0.0f, 0.0f, 65, 2, 16, 0.0f);
        this.bodyModel[52].setRotationPoint(-48.0f, -9.0f, -8.0f);
        this.bodyModel[53].addBox(0.0f, 0.0f, 0.0f, 5, 12, 16, 0.0f);
        this.bodyModel[53].setRotationPoint(11.0f, -21.0f, 3.0f);
        this.bodyModel[54].addBox(0.0f, 0.0f, 0.0f, 5, 3, 11, 0.0f);
        this.bodyModel[54].setRotationPoint(11.0f, -24.0f, 3.0f);
        this.bodyModel[55].addBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.bodyModel[55].setRotationPoint(13.0f, -24.0f, 15.0f);
        this.bodyModel[56].addBox(0.0f, 0.0f, 0.0f, 5, 4, 12, 0.0f);
        this.bodyModel[56].setRotationPoint(11.0f, -28.0f, 5.0f);
        this.bodyModel[57].addBox(0.0f, 0.0f, 0.0f, 14, 6, 5, 0.0f);
        this.bodyModel[57].setRotationPoint(-5.0f, -7.0f, 13.0f);
        this.bodyModel[58].addBox(0.0f, 0.0f, 0.0f, 14, 6, 5, 0.0f);
        this.bodyModel[58].setRotationPoint(-5.0f, -7.0f, -18.0f);
        this.bodyModel[59].addBox(0.0f, 0.0f, 0.0f, 11, 8, 5, 0.0f);
        this.bodyModel[59].setRotationPoint(-21.0f, -7.0f, -18.0f);
        this.bodyModel[60].addBox(0.0f, 0.0f, 0.0f, 9, 8, 5, 0.0f);
        this.bodyModel[60].setRotationPoint(-50.0f, -7.0f, -18.0f);
        this.bodyModel[61].addBox(0.0f, 0.0f, 0.0f, 11, 8, 5, 0.0f);
        this.bodyModel[61].setRotationPoint(-21.0f, -7.0f, 13.0f);
        this.bodyModel[62].addBox(0.0f, 0.0f, 0.0f, 9, 8, 5, 0.0f);
        this.bodyModel[62].setRotationPoint(-50.0f, -7.0f, 13.0f);
        this.bodyModel[63].addBox(0.0f, 0.0f, 0.0f, 1, 8, 2, 0.0f);
        this.bodyModel[63].setRotationPoint(9.0f, -7.0f, 16.0f);
        this.bodyModel[64].addBox(0.0f, 0.0f, 0.0f, 20, 2, 1, 0.0f);
        this.bodyModel[64].setRotationPoint(-10.0f, -5.0f, 17.5f);
        this.bodyModel[65].addBox(0.0f, 0.0f, 0.0f, 20, 2, 1, 0.0f);
        this.bodyModel[65].setRotationPoint(-10.0f, 0.0f, 17.5f);
        this.bodyModel[66].addBox(0.0f, 0.0f, 0.0f, 1, 8, 2, 0.0f);
        this.bodyModel[66].setRotationPoint(9.0f, -7.0f, -18.0f);
        this.bodyModel[67].addBox(0.0f, 0.0f, 0.0f, 20, 2, 1, 0.0f);
        this.bodyModel[67].setRotationPoint(-10.0f, -5.0f, -18.5f);
        this.bodyModel[68].addBox(0.0f, 0.0f, 0.0f, 20, 2, 1, 0.0f);
        this.bodyModel[68].setRotationPoint(-10.0f, 0.0f, -18.5f);
        this.bodyModel[69].addBox(0.0f, 0.0f, 0.0f, 2, 13, 36, 0.0f);
        this.bodyModel[69].setRotationPoint(8.0f, -23.0f, -18.0f);
        this.bodyModel[70].addBox(0.0f, 0.0f, 0.0f, 66, 1, 40, 0.0f);
        this.bodyModel[70].setRotationPoint(-56.0f, -10.0f, -20.0f);
        this.bodyModel[71].addBox(0.0f, 0.0f, 0.0f, 66, 13, 2, 0.0f);
        this.bodyModel[71].setRotationPoint(-56.0f, -23.0f, 18.0f);
        this.bodyModel[72].addBox(0.0f, 0.0f, 0.0f, 66, 13, 2, 0.0f);
        this.bodyModel[72].setRotationPoint(-56.0f, -23.0f, -20.0f);
        this.bodyModel[73].addBox(0.0f, 0.0f, 0.0f, 1, 4, 3, 0.0f);
        this.bodyModel[73].setRotationPoint(-55.0f, -6.0f, -1.5f);
        this.bodyModel[74].addBox(0.0f, 0.0f, 0.0f, 1, 8, 6, 0.0f);
        this.bodyModel[74].setRotationPoint(-56.0f, -9.0f, 10.0f);
        this.bodyModel[75].addBox(0.0f, 0.0f, 0.0f, 1, 8, 6, 0.0f);
        this.bodyModel[75].setRotationPoint(-56.0f, -9.0f, -16.0f);
        this.bodyModel[76].addBox(0.0f, 0.0f, 0.0f, 1, 13, 38, 0.0f);
        this.bodyModel[76].setRotationPoint(-57.0f, -23.0f, -19.0f);
        this.bodyModel[77].addBox(0.0f, 0.0f, 0.0f, 66, 17, 1, 0.0f);
        this.bodyModel[77].setRotationPoint(-56.0f, -40.0f, 18.5f);
        this.bodyModel[78].addBox(0.0f, 0.0f, 0.0f, 66, 1, 10, 0.0f);
        this.bodyModel[78].setRotationPoint(-56.0f, -41.0f, 8.5f);
        this.bodyModel[79].addBox(0.0f, 0.0f, 0.0f, 66, 1, 17, 0.0f);
        this.bodyModel[79].setRotationPoint(-56.0f, -42.0f, -8.5f);
        this.bodyModel[80].addBox(0.0f, 0.0f, 0.0f, 66, 1, 10, 0.0f);
        this.bodyModel[80].setRotationPoint(-56.0f, -41.0f, -18.5f);
        this.bodyModel[81].addBox(0.0f, 0.0f, 0.0f, 66, 17, 1, 0.0f);
        this.bodyModel[81].setRotationPoint(-56.0f, -40.0f, -19.5f);
        this.bodyModel[82].addBox(0.0f, 0.0f, 0.0f, 1, 17, 10, 0.0f);
        this.bodyModel[82].setRotationPoint(9.0f, -40.0f, 8.5f);
        this.bodyModel[83].addBox(0.0f, 0.0f, 0.0f, 1, 18, 17, 0.0f);
        this.bodyModel[83].setRotationPoint(9.0f, -41.0f, -8.5f);
        this.bodyModel[84].addBox(0.0f, 0.0f, 0.0f, 1, 17, 10, 0.0f);
        this.bodyModel[84].setRotationPoint(9.0f, -40.0f, -18.5f);
        this.bodyModel[85].addBox(0.0f, 0.0f, 0.0f, 1, 14, 2, 0.0f);
        this.bodyModel[85].setRotationPoint(-56.0f, -37.0f, 16.5f);
        this.bodyModel[86].addBox(0.0f, 0.0f, 0.0f, 1, 3, 17, 0.0f);
        this.bodyModel[86].setRotationPoint(-56.0f, -41.0f, -8.5f);
        this.bodyModel[87].addBox(0.0f, 0.0f, 0.0f, 1, 3, 10, 0.0f);
        this.bodyModel[87].setRotationPoint(-56.0f, -40.0f, 8.5f);
        this.bodyModel[88].addBox(0.0f, 0.0f, 0.0f, 1, 3, 10, 0.0f);
        this.bodyModel[88].setRotationPoint(-56.0f, -40.0f, -18.5f);
        this.bodyModel[89].addBox(0.0f, 0.0f, 0.0f, 1, 14, 2, 0.0f);
        this.bodyModel[89].setRotationPoint(-56.0f, -37.0f, -18.5f);
        this.bodyModel[90].addBox(0.0f, 0.0f, 0.0f, 60, 6, 1, 0.0f);
        this.bodyModel[90].setRotationPoint(-54.0f, -16.0f, 7.0f);
        this.bodyModel[91].addBox(0.0f, 0.0f, 0.0f, 60, 6, 1, 0.0f);
        this.bodyModel[91].setRotationPoint(-54.0f, -16.0f, -8.0f);
        this.bodyModel[92].addBox(0.0f, 0.0f, 0.0f, 60, 1, 20, 0.0f);
        this.bodyModel[92].setRotationPoint(-54.0f, -17.0f, -10.0f);
        this.bodyModel[93].addTrapezoid(0.0f, 0.0f, 0.0f, 60, 10, 4, 0.0f, -1.0f, 4);
        this.bodyModel[93].setRotationPoint(-54.0f, -27.0f, -2.0f);
        this.bodyModel[94].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(5.0, 0.0, 5, 0), new Coord2D(11.0, 15.0, 11, 15), new Coord2D(11.0, 17.0, 11, 17), new Coord2D(8.0, 17.0, 8, 17), new Coord2D(5.0, 14.0, 5, 14) }), 1.0f, 11, 17, 47, 1, 0, new float[] { 15.0f, 5.0f, 3.0f, 2.0f, 17.0f, 5.0f });
        this.bodyModel[94].setRotationPoint(45.0f, -22.0f, -17.0f);
        this.bodyModel[95].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(5.0, 0.0, 5, 0), new Coord2D(11.0, 15.0, 11, 15), new Coord2D(11.0, 17.0, 11, 17), new Coord2D(8.0, 17.0, 8, 17), new Coord2D(5.0, 14.0, 5, 14) }), 1.0f, 11, 17, 47, 1, 0, new float[] { 15.0f, 5.0f, 3.0f, 2.0f, 17.0f, 5.0f });
        this.bodyModel[95].setRotationPoint(45.0f, -22.0f, 18.0f);
        this.bodyModel[96].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(6.0, 1.0, 6, 1), new Coord2D(6.0, 3.0, 6, 3), new Coord2D(3.0, 3.0, 3, 3) }), 34.0f, 6, 3, 17, 34, 0, new float[] { 5.0f, 3.0f, 2.0f, 7.0f });
        this.bodyModel[96].setRotationPoint(40.0f, -36.0f, 17.0f);
        (this.leftFrontWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 0, 490, this.textureX, this.textureY);
        this.leftFrontWheelModel[0].addShape3D(8.0f, -8.0f, -3.0f, new Shape2D(new Coord2D[] { new Coord2D(5.0, 0.0, 5, 0), new Coord2D(11.0, 0.0, 11, 0), new Coord2D(16.0, 5.0, 16, 5), new Coord2D(16.0, 11.0, 16, 11), new Coord2D(11.0, 16.0, 11, 16), new Coord2D(5.0, 16.0, 5, 16), new Coord2D(0.0, 11.0, 0, 11), new Coord2D(0.0, 5.0, 0, 5) }), 6.0f, 16, 16, 56, 6, 0, new float[] { 8.0f, 6.0f, 8.0f, 6.0f, 8.0f, 6.0f, 8.0f, 6.0f });
        this.leftFrontWheelModel[0].setRotationPoint(20.0f, 2.0f, 17.0f);
        (this.rightFrontWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 0, 490, this.textureX, this.textureY);
        this.rightFrontWheelModel[0].addShape3D(8.0f, -8.0f, -3.0f, new Shape2D(new Coord2D[] { new Coord2D(5.0, 0.0, 5, 0), new Coord2D(11.0, 0.0, 11, 0), new Coord2D(16.0, 5.0, 16, 5), new Coord2D(16.0, 11.0, 16, 11), new Coord2D(11.0, 16.0, 11, 16), new Coord2D(5.0, 16.0, 5, 16), new Coord2D(0.0, 11.0, 0, 11), new Coord2D(0.0, 5.0, 0, 5) }), 6.0f, 16, 16, 56, 6, 0, new float[] { 8.0f, 6.0f, 8.0f, 6.0f, 8.0f, 6.0f, 8.0f, 6.0f });
        this.rightFrontWheelModel[0].setRotationPoint(20.0f, 2.0f, -17.0f);
        (this.leftBackWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 0, 490, this.textureX, this.textureY);
        this.leftBackWheelModel[0].addShape3D(8.0f, -8.0f, -3.0f, new Shape2D(new Coord2D[] { new Coord2D(5.0, 0.0, 5, 0), new Coord2D(11.0, 0.0, 11, 0), new Coord2D(16.0, 5.0, 16, 5), new Coord2D(16.0, 11.0, 16, 11), new Coord2D(11.0, 16.0, 11, 16), new Coord2D(5.0, 16.0, 5, 16), new Coord2D(0.0, 11.0, 0, 11), new Coord2D(0.0, 5.0, 0, 5) }), 6.0f, 16, 16, 56, 6, 0, new float[] { 8.0f, 6.0f, 8.0f, 6.0f, 8.0f, 6.0f, 8.0f, 6.0f });
        this.leftBackWheelModel[0].setRotationPoint(-31.0f, 2.0f, 17.0f);
        (this.rightBackWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 0, 490, this.textureX, this.textureY);
        this.rightBackWheelModel[0].addShape3D(8.0f, -8.0f, -3.0f, new Shape2D(new Coord2D[] { new Coord2D(5.0, 0.0, 5, 0), new Coord2D(11.0, 0.0, 11, 0), new Coord2D(16.0, 5.0, 16, 5), new Coord2D(16.0, 11.0, 16, 11), new Coord2D(11.0, 16.0, 11, 16), new Coord2D(5.0, 16.0, 5, 16), new Coord2D(0.0, 11.0, 0, 11), new Coord2D(0.0, 5.0, 0, 5) }), 6.0f, 16, 16, 56, 6, 0, new float[] { 8.0f, 6.0f, 8.0f, 6.0f, 8.0f, 6.0f, 8.0f, 6.0f });
        this.rightBackWheelModel[0].setRotationPoint(-31.0f, 2.0f, -17.0f);
        this.steeringWheelModel = new ModelRendererTurbo[1];
        (this.steeringWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 100, 0, this.textureX, this.textureY)).addBox(0.0f, -4.0f, -4.0f, 1, 8, 8, 0.0f);
        this.steeringWheelModel[0].setRotationPoint(39.0f, -21.0f, 9.0f);
        this.steeringWheelModel[0].rotateAngleZ = -0.1919862f;
        this.translateAll(-16, 0, 0);
        this.flipAll();
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < this.bodyModel.length; ++i) {
            this.bodyModel[i].render(f5);
        }
        for (int i = 0; i < this.turretModel.length; ++i) {
            this.turretModel[i].render(f5);
        }
        for (int i = 0; i < this.barrelModel.length; ++i) {
            this.barrelModel[i].render(f5);
        }
        for (int i = 0; i < this.leftFrontWheelModel.length; ++i) {
            this.leftFrontWheelModel[i].render(f5);
        }
        for (int i = 0; i < this.rightFrontWheelModel.length; ++i) {
            this.rightFrontWheelModel[i].render(f5);
        }
        for (int i = 0; i < this.leftBackWheelModel.length; ++i) {
            this.leftBackWheelModel[i].render(f5);
        }
        for (int i = 0; i < this.rightBackWheelModel.length; ++i) {
            this.rightBackWheelModel[i].render(f5);
        }
        for (int i = 0; i < this.steeringWheelModel.length; ++i) {
            this.steeringWheelModel[i].render(f5);
        }
    }
}

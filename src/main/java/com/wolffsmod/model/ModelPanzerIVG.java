//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: WW2_Vehicle_PanzerIV_1
// Model Creator: 
// Created on: 05.01.2016 - 10:07:04
// Last changed on: 05.01.2016 - 10:07:04

package com.wolffsmod.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

import net.minecraft.entity.Entity;

public class ModelPanzerIVG extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;
	
	//ModelRendererTurbo[][] MGFrontModel;

	public ModelPanzerIVG() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[137];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang11L
		bodyModel[1] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang12LTrap
		bodyModel[2] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang13LTrap
		bodyModel[3] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang14LTrap
		bodyModel[4] = new ModelRendererTurbo(this, 30, 440, textureX, textureY); // Import Aufhang15LTrap
		bodyModel[5] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang21L
		bodyModel[6] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang22LTrap
		bodyModel[7] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang23LTrap
		bodyModel[8] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang24LTrap
		bodyModel[9] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang31L
		bodyModel[10] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang32LTrap
		bodyModel[11] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang33LTrap
		bodyModel[12] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang34LTrap
		bodyModel[13] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang41L
		bodyModel[14] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang42LTrap
		bodyModel[15] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang43LTrap
		bodyModel[16] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang44LTrap
		bodyModel[17] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang11R
		bodyModel[18] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang12RTrap
		bodyModel[19] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang13RTrap
		bodyModel[20] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang14RTrap
		bodyModel[21] = new ModelRendererTurbo(this, 30, 440, textureX, textureY); // Import Aufhang15RTrap
		bodyModel[22] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang21R
		bodyModel[23] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang22RTrap
		bodyModel[24] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang23RTrap
		bodyModel[25] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang24RTrap
		bodyModel[26] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang31R
		bodyModel[27] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang32RTrap
		bodyModel[28] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang33RTrap
		bodyModel[29] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang34RTrap
		bodyModel[30] = new ModelRendererTurbo(this, 0, 460, textureX, textureY); // Import Aufhang41R
		bodyModel[31] = new ModelRendererTurbo(this, 0, 450, textureX, textureY); // Import Aufhang42RTrap
		bodyModel[32] = new ModelRendererTurbo(this, 0, 440, textureX, textureY); // Import Aufhang43RTrap
		bodyModel[33] = new ModelRendererTurbo(this, 20, 440, textureX, textureY); // Import Aufhang44RTrap
		bodyModel[34] = new ModelRendererTurbo(this, 181, 451, textureX, textureY); // Import AchseV
		bodyModel[35] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse1L
		bodyModel[36] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse2L
		bodyModel[37] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse3L
		bodyModel[38] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse4L
		bodyModel[39] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse5L
		bodyModel[40] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse6L
		bodyModel[41] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse7L
		bodyModel[42] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse8L
		bodyModel[43] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse9L
		bodyModel[44] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse10L
		bodyModel[45] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse11L
		bodyModel[46] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse12L
		bodyModel[47] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse13L
		bodyModel[48] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse1R
		bodyModel[49] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse2R
		bodyModel[50] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse3R
		bodyModel[51] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse4R
		bodyModel[52] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse5R
		bodyModel[53] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse6R
		bodyModel[54] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse7R
		bodyModel[55] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse8R
		bodyModel[56] = new ModelRendererTurbo(this, 40, 445, textureX, textureY); // Import Achse9R
		bodyModel[57] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse10R
		bodyModel[58] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse11R
		bodyModel[59] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse12R
		bodyModel[60] = new ModelRendererTurbo(this, 65, 445, textureX, textureY); // Import Achse13R
		bodyModel[61] = new ModelRendererTurbo(this, 246, 498, textureX, textureY); // Import BlechL
		bodyModel[62] = new ModelRendererTurbo(this, 246, 485, textureX, textureY); // Import BlechR
		bodyModel[63] = new ModelRendererTurbo(this, 80, 455, textureX, textureY); // Import RL1
		bodyModel[64] = new ModelRendererTurbo(this, 96, 460, textureX, textureY); // Import RL2
		bodyModel[65] = new ModelRendererTurbo(this, 142, 455, textureX, textureY); // Import RL3
		bodyModel[66] = new ModelRendererTurbo(this, 96, 452, textureX, textureY); // Import RL4
		bodyModel[67] = new ModelRendererTurbo(this, 112, 452, textureX, textureY); // Import RL5
		bodyModel[68] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import RL6
		bodyModel[69] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import RL7
		bodyModel[70] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import RL8
		bodyModel[71] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import RL9
		bodyModel[72] = new ModelRendererTurbo(this, 160, 460, textureX, textureY); // Import Axt1
		bodyModel[73] = new ModelRendererTurbo(this, 184, 460, textureX, textureY); // Import Axt2
		bodyModel[74] = new ModelRendererTurbo(this, 198, 460, textureX, textureY); // Import Axt3
		bodyModel[75] = new ModelRendererTurbo(this, 206, 460, textureX, textureY); // Import Axt4
		bodyModel[76] = new ModelRendererTurbo(this, 130, 450, textureX, textureY); // Import Stange1
		bodyModel[77] = new ModelRendererTurbo(this, 140, 450, textureX, textureY); // Import Stange2
		bodyModel[78] = new ModelRendererTurbo(this, 148, 450, textureX, textureY); // Import Stange3
		bodyModel[79] = new ModelRendererTurbo(this, 156, 450, textureX, textureY); // Import Stange4
		bodyModel[80] = new ModelRendererTurbo(this, 153, 456, textureX, textureY); // Import Stange5
		bodyModel[81] = new ModelRendererTurbo(this, 80, 440, textureX, textureY); // Import Kurbel1
		bodyModel[82] = new ModelRendererTurbo(this, 80, 444, textureX, textureY); // Import Kurbel2
		bodyModel[83] = new ModelRendererTurbo(this, 100, 440, textureX, textureY); // Import Kurbel3
		bodyModel[84] = new ModelRendererTurbo(this, 100, 444, textureX, textureY); // Import Kurbel4
		bodyModel[85] = new ModelRendererTurbo(this, 108, 444, textureX, textureY); // Import Kurbel5
		bodyModel[86] = new ModelRendererTurbo(this, 320, 425, textureX, textureY); // Import Tank1Shape
		bodyModel[87] = new ModelRendererTurbo(this, 247, 450, textureX, textureY); // Import Tank2
		bodyModel[88] = new ModelRendererTurbo(this, 290, 435, textureX, textureY); // Import Tank3
		bodyModel[89] = new ModelRendererTurbo(this, 290, 445, textureX, textureY); // Import Tank4
		bodyModel[90] = new ModelRendererTurbo(this, 217, 500, textureX, textureY); // Import RadlagerL
		bodyModel[91] = new ModelRendererTurbo(this, 217, 487, textureX, textureY); // Import RadlagerR
		bodyModel[92] = new ModelRendererTurbo(this, 218, 472, textureX, textureY); // Import MG2
		bodyModel[93] = new ModelRendererTurbo(this, 218, 450, textureX, textureY); // Import MG3
		bodyModel[94] = new ModelRendererTurbo(this, 311, 466, textureX, textureY); // Import Sicht
		bodyModel[95] = new ModelRendererTurbo(this, 340, 471, textureX, textureY); // Import Luke1
		bodyModel[96] = new ModelRendererTurbo(this, 372, 468, textureX, textureY); // Import Luke2
		bodyModel[97] = new ModelRendererTurbo(this, 0, 405, textureX, textureY); // Import Kranz
		bodyModel[98] = new ModelRendererTurbo(this, 0, 342, textureX, textureY); // Import Body1
		bodyModel[99] = new ModelRendererTurbo(this, 129, 397, textureX, textureY); // Import Body2
		bodyModel[100] = new ModelRendererTurbo(this, 406, 430, textureX, textureY); // Import BodyShapeL
		bodyModel[101] = new ModelRendererTurbo(this, 406, 430, textureX, textureY); // Import BodyShapeR
		bodyModel[102] = new ModelRendererTurbo(this, 0, 385, textureX, textureY); // Import Schaufel1
		bodyModel[103] = new ModelRendererTurbo(this, 6, 385, textureX, textureY); // Import Schaufel2
		bodyModel[104] = new ModelRendererTurbo(this, 0, 378, textureX, textureY); // Import Schaufel3
		bodyModel[105] = new ModelRendererTurbo(this, 12, 378, textureX, textureY); // Import Schaufel4
		bodyModel[106] = new ModelRendererTurbo(this, 0, 372, textureX, textureY); // Import Aufbau1
		bodyModel[107] = new ModelRendererTurbo(this, 22, 372, textureX, textureY); // Import Aufbau2
		bodyModel[108] = new ModelRendererTurbo(this, 22, 378, textureX, textureY); // Import Aufbau3
		bodyModel[109] = new ModelRendererTurbo(this, 0, 361, textureX, textureY); // Import Kett1
		bodyModel[110] = new ModelRendererTurbo(this, 0, 348, textureX, textureY); // Import Kett2
		bodyModel[111] = new ModelRendererTurbo(this, 8, 348, textureX, textureY); // Import Kett3
		bodyModel[112] = new ModelRendererTurbo(this, 16, 348, textureX, textureY); // Import Kett4
		bodyModel[113] = new ModelRendererTurbo(this, 25, 347, textureX, textureY); // Import Lampe1
		bodyModel[114] = new ModelRendererTurbo(this, 25, 355, textureX, textureY); // Import Lampe2
		bodyModel[115] = new ModelRendererTurbo(this, 117, 342, textureX, textureY); // Import Motor1
		bodyModel[116] = new ModelRendererTurbo(this, 117, 355, textureX, textureY); // Import Motor2
		bodyModel[117] = new ModelRendererTurbo(this, 117, 367, textureX, textureY); // Import Schlepp1
		bodyModel[118] = new ModelRendererTurbo(this, 137, 367, textureX, textureY); // Import Schlepp2
		bodyModel[119] = new ModelRendererTurbo(this, 145, 367, textureX, textureY); // Import Schlepp3
		bodyModel[120] = new ModelRendererTurbo(this, 117, 372, textureX, textureY); // Import Schlepp4
		bodyModel[121] = new ModelRendererTurbo(this, 137, 372, textureX, textureY); // Import Schlepp5
		bodyModel[122] = new ModelRendererTurbo(this, 145, 372, textureX, textureY); // Import Schlepp6
		bodyModel[123] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import 
		bodyModel[124] = new ModelRendererTurbo(this, 245, 240, textureX, textureY); // Import 
		bodyModel[125] = new ModelRendererTurbo(this, 245, 250, textureX, textureY); // Import 
		bodyModel[126] = new ModelRendererTurbo(this, 260, 292, textureX, textureY); // Import 
		bodyModel[127] = new ModelRendererTurbo(this, 314, 261, textureX, textureY); // Import 
		bodyModel[128] = new ModelRendererTurbo(this, 363, 261, textureX, textureY); // Import 
		bodyModel[129] = new ModelRendererTurbo(this, 382, 261, textureX, textureY); // Import 
		bodyModel[130] = new ModelRendererTurbo(this, 382, 280, textureX, textureY); // Import 
		bodyModel[131] = new ModelRendererTurbo(this, 401, 261, textureX, textureY); // Import 
		bodyModel[132] = new ModelRendererTurbo(this, 401, 280, textureX, textureY); // Import 
		bodyModel[133] = new ModelRendererTurbo(this, 414, 261, textureX, textureY); // Import 
		bodyModel[134] = new ModelRendererTurbo(this, 414, 280, textureX, textureY); // Import 
		bodyModel[135] = new ModelRendererTurbo(this, 425, 0, textureX, textureY); // Import Barrel
		
		bodyModel[136] = new ModelRendererTurbo(this, 425, 0, this.textureX, this.textureY);
	    
		bodyModel[136].addBox(-2.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);
	    bodyModel[136].setRotationPoint(42.5F, -19.5F, -11.5F);

		bodyModel[0].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang11L
		bodyModel[0].setRotationPoint(-35F, 4F, -23.5F);

		bodyModel[1].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang12LTrap
		bodyModel[1].setRotationPoint(-35F, 1F, -23.5F);

		bodyModel[2].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, -0.7F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang13LTrap
		bodyModel[2].setRotationPoint(-31F, -3F, -22.5F);

		bodyModel[3].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_FRONT); // Import Aufhang14LTrap
		bodyModel[3].setRotationPoint(-23F, -3F, -22.5F);

		bodyModel[4].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_FRONT); // Import Aufhang15LTrap
		bodyModel[4].setRotationPoint(-33F, -3F, -22.5F);

		bodyModel[5].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang21L
		bodyModel[5].setRotationPoint(-13F, 4F, -23.5F);

		bodyModel[6].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang22LTrap
		bodyModel[6].setRotationPoint(-13F, 1F, -23.5F);

		bodyModel[7].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, -0.7F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang23LTrap
		bodyModel[7].setRotationPoint(-9F, -3F, -22.5F);

		bodyModel[8].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_FRONT); // Import Aufhang24LTrap
		bodyModel[8].setRotationPoint(-1F, -3F, -22.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang31L
		bodyModel[9].setRotationPoint(9F, 4F, -23.5F);

		bodyModel[10].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang32LTrap
		bodyModel[10].setRotationPoint(9F, 1F, -23.5F);

		bodyModel[11].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, -0.7F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang33LTrap
		bodyModel[11].setRotationPoint(13F, -3F, -22.5F);

		bodyModel[12].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_FRONT); // Import Aufhang34LTrap
		bodyModel[12].setRotationPoint(21F, -3F, -22.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang41L
		bodyModel[13].setRotationPoint(31F, 4F, -23.5F);

		bodyModel[14].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang42LTrap
		bodyModel[14].setRotationPoint(31F, 1F, -23.5F);

		bodyModel[15].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, -0.7F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang43LTrap
		bodyModel[15].setRotationPoint(35F, -3F, -22.5F);

		bodyModel[16].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_FRONT); // Import Aufhang44LTrap
		bodyModel[16].setRotationPoint(43F, -3F, -22.5F);

		bodyModel[17].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang11R
		bodyModel[17].setRotationPoint(-35F, 4F, 20.5F);

		bodyModel[18].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang12RTrap
		bodyModel[18].setRotationPoint(-35F, 1F, 20.5F);

		bodyModel[19].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, 0F, -0.7F, ModelRendererTurbo.MR_TOP); // Import Aufhang13RTrap
		bodyModel[19].setRotationPoint(-31F, -3F, 20.5F);

		bodyModel[20].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_BACK); // Import Aufhang14RTrap
		bodyModel[20].setRotationPoint(-23F, -3F, 20.5F);

		bodyModel[21].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_BACK); // Import Aufhang15RTrap
		bodyModel[21].setRotationPoint(-33F, -3F, 20.5F);

		bodyModel[22].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang21R
		bodyModel[22].setRotationPoint(-13F, 4F, 20.5F);

		bodyModel[23].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang22RTrap
		bodyModel[23].setRotationPoint(-13F, 1F, 20.5F);

		bodyModel[24].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, 0F, -0.7F, ModelRendererTurbo.MR_TOP); // Import Aufhang23RTrap
		bodyModel[24].setRotationPoint(-9F, -3F, 20.5F);

		bodyModel[25].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_BACK); // Import Aufhang24RTrap
		bodyModel[25].setRotationPoint(-1F, -3F, 20.5F);

		bodyModel[26].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang31R
		bodyModel[26].setRotationPoint(9F, 4F, 20.5F);

		bodyModel[27].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang32RTrap
		bodyModel[27].setRotationPoint(9F, 1F, 20.5F);

		bodyModel[28].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, 0F, -0.7F, ModelRendererTurbo.MR_TOP); // Import Aufhang33RTrap
		bodyModel[28].setRotationPoint(13F, -3F, 20.5F);

		bodyModel[29].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_BACK); // Import Aufhang34RTrap
		bodyModel[29].setRotationPoint(21F, -3F, 20.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 15, 2, 3, 0F); // Import Aufhang41R
		bodyModel[30].setRotationPoint(31F, 4F, 20.5F);

		bodyModel[31].addFlexBox(0F, 0F, 0F, 15, 3, 3, 0F, -1.8F, -1.8F, -0.5F, 0F, ModelRendererTurbo.MR_TOP); // Import Aufhang42RTrap
		bodyModel[31].setRotationPoint(31F, 1F, 20.5F);

		bodyModel[32].addFlexBox(0F, 0F, 0F, 7, 5, 2, 0F, -1F, -1F, 0F, -0.7F, ModelRendererTurbo.MR_TOP); // Import Aufhang43RTrap
		bodyModel[32].setRotationPoint(35F, -3F, 20.5F);

		bodyModel[33].addFlexBox(0F, 0F, 0F, 1, 5, 2, 0F, 0F, 0F, -0.3F, -0.3F, ModelRendererTurbo.MR_BACK); // Import Aufhang44RTrap
		bodyModel[33].setRotationPoint(43F, -3F, 20.5F);

		bodyModel[34].addBox(0F, 0F, 0F, 2, 2, 59, 0F); // Import AchseV
		bodyModel[34].setRotationPoint(53.5F, -4.5F, -29.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Import Achse1L
		bodyModel[35].setRotationPoint(-48.5F, -1.5F, -29.5F);

		bodyModel[36].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse2L
		bodyModel[36].setRotationPoint(-34F, 3F, -28.5F);

		bodyModel[37].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse3L
		bodyModel[37].setRotationPoint(-23F, 3F, -28.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse4L
		bodyModel[38].setRotationPoint(-12F, 3F, -28.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse5L
		bodyModel[39].setRotationPoint(-1F, 3F, -28.5F);

		bodyModel[40].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse6L
		bodyModel[40].setRotationPoint(10F, 3F, -28.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse7L
		bodyModel[41].setRotationPoint(21F, 3F, -28.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse8L
		bodyModel[42].setRotationPoint(32F, 3F, -28.5F);

		bodyModel[43].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse9L
		bodyModel[43].setRotationPoint(43F, 3F, -28.5F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse10L
		bodyModel[44].setRotationPoint(32F, -10F, -24F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse11L
		bodyModel[45].setRotationPoint(14F, -10F, -24F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse12L
		bodyModel[46].setRotationPoint(-8F, -10F, -24F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse13L
		bodyModel[47].setRotationPoint(-30F, -10F, -24F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 2, 17, 0F); // Import Achse1R
		bodyModel[48].setRotationPoint(-48.5F, -1.5F, 12.5F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse2R
		bodyModel[49].setRotationPoint(-34F, 3F, 22.5F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse3R
		bodyModel[50].setRotationPoint(-23F, 3F, 22.5F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse4R
		bodyModel[51].setRotationPoint(-12F, 3F, 22.5F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse5R
		bodyModel[52].setRotationPoint(-1F, 3F, 22.5F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse6R
		bodyModel[53].setRotationPoint(10F, 3F, 22.5F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse7R
		bodyModel[54].setRotationPoint(21F, 3F, 22.5F);

		bodyModel[55].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse8R
		bodyModel[55].setRotationPoint(32F, 3F, 22.5F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Achse9R
		bodyModel[56].setRotationPoint(43F, 3F, 22.5F);

		bodyModel[57].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse10R
		bodyModel[57].setRotationPoint(32F, -10F, 20F);

		bodyModel[58].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse11R
		bodyModel[58].setRotationPoint(14F, -10F, 20F);

		bodyModel[59].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse12R
		bodyModel[59].setRotationPoint(-8F, -10F, 20F);

		bodyModel[60].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Achse13R
		bodyModel[60].setRotationPoint(-30F, -10F, 20F);

		bodyModel[61].addBox(0F, 0F, 0F, 110, 1, 10, 0F); // Import BlechL
		bodyModel[61].setRotationPoint(-50F, -15F, -31F);

		bodyModel[62].addBox(0F, 0F, 0F, 110, 1, 10, 0F); // Import BlechR
		bodyModel[62].setRotationPoint(-50F, -15F, 21F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Import RL1
		bodyModel[63].setRotationPoint(13F, -19F, 24.5F);

		bodyModel[64].addBox(0F, 0F, 0F, 21, 4, 1, 0F); // Import RL2
		bodyModel[64].setRotationPoint(-8F, -19F, 29.5F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 4, 6, 0F); // Import RL3
		bodyModel[65].setRotationPoint(-9F, -19F, 24.5F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Import RL4
		bodyModel[66].setRotationPoint(7F, -21F, 25F);

		bodyModel[67].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Import RL5
		bodyModel[67].setRotationPoint(-4F, -21F, 25F);

		bodyModel[68].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import RL6
		bodyModel[68].setRotationPoint(13F, -15F, 29.5F);

		bodyModel[69].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import RL7
		bodyModel[69].setRotationPoint(2F, -15F, 29.5F);

		bodyModel[70].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import RL8
		bodyModel[70].setRotationPoint(13F, -15F, 27F);

		bodyModel[71].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import RL9
		bodyModel[71].setRotationPoint(2F, -15F, 27F);

		bodyModel[72].addBox(0F, 0F, 0F, 10, 1, 1, 0F); // Import Axt1
		bodyModel[72].setRotationPoint(45F, -15.5F, -25F);

		bodyModel[73].addBox(10F, -0.1F, -0.5F, 2, 1, 4, 0F); // Import Axt2
		bodyModel[73].setRotationPoint(45F, -15.5F, -25F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Axt3
		bodyModel[74].setRotationPoint(46F, -16F, -25.5F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Axt4
		bodyModel[75].setRotationPoint(53F, -16F, -25.5F);

		bodyModel[76].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Stange1
		bodyModel[76].setRotationPoint(10F, -16F, -29.5F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Stange2
		bodyModel[77].setRotationPoint(13F, -16F, -29.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Stange3
		bodyModel[78].setRotationPoint(21F, -16F, -29.5F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Stange4
		bodyModel[79].setRotationPoint(24F, -16F, -29.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Import Stange5
		bodyModel[80].setRotationPoint(11F, -15.5F, -29F);

		bodyModel[81].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Import Kurbel1
		bodyModel[81].setRotationPoint(28F, -15.5F, -29F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Import Kurbel2
		bodyModel[82].setRotationPoint(35F, -15.5F, -28.5F);

		bodyModel[83].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Import Kurbel3
		bodyModel[83].setRotationPoint(36F, -15.5F, -23F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Kurbel4
		bodyModel[84].setRotationPoint(30F, -16F, -29.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Import Kurbel5
		bodyModel[85].setRotationPoint(40F, -16F, -23.5F);

		bodyModel[86].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 25, 6, 6, 20, 25, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Tank1Shape
		bodyModel[86].setRotationPoint(-46F, -8F, 8F);

		bodyModel[87].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Import Tank2
		bodyModel[87].setRotationPoint(-53F, -15F, -2F);
		bodyModel[87].rotateAngleX = -0.3665192F;
		bodyModel[87].rotateAngleZ = 0.4712389F;

		bodyModel[88].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Import Tank3
		bodyModel[88].setRotationPoint(-45.5F, -7.5F, 5F);

		bodyModel[89].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(5, 0, 5, 0), new Coord2D(7, 2, 7, 2), new Coord2D(7, 5, 7, 5), new Coord2D(5, 7, 5, 7), new Coord2D(2, 7, 2, 7), new Coord2D(0, 5, 0, 5), new Coord2D(0, 2, 0, 2) }), 1, 7, 7, 24, 1, ModelRendererTurbo.MR_FRONT, new float[] {3 ,3 ,3 ,3 ,3 ,3 ,3 ,3}); // Import Tank4
		bodyModel[89].setRotationPoint(-45.5F, -7.5F, -14F);

		bodyModel[90].addBox(0F, 0F, 0F, 5, 4, 6, 0F); // Import RadlagerL
		bodyModel[90].setRotationPoint(-49.5F, -2.2F, -20F);
		bodyModel[90].rotateAngleZ = 0.1396263F;

		bodyModel[91].addBox(0F, 0F, 0F, 5, 4, 6, 0F); // Import RadlagerR
		bodyModel[91].setRotationPoint(-49.5F, -2.2F, 14F);
		bodyModel[91].rotateAngleZ = 0.1396263F;

		bodyModel[92].addBox(0F, 0F, 0F, 2, 3, 5, 0F); // Import MG2
		bodyModel[92].setRotationPoint(39.5F, -21F, -14F);

		bodyModel[93].addFlexBox(0F, 0F, 0F, 2, 10, 9, 0F, -1F, 0F, -1F, -1F, ModelRendererTurbo.MR_LEFT); // Import MG3
		bodyModel[93].setRotationPoint(39F, -24F, -16F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 5, 12, 0F); // Import Sicht
		bodyModel[94].setRotationPoint(38.5F, -21F, 3F);

		bodyModel[95].addBox(0F, 0F, 0F, 9, 1, 11, 0F); // Import Luke1
		bodyModel[95].setRotationPoint(29F, -25.2F, -18F);

		bodyModel[96].addBox(0F, 0F, 0F, 9, 1, 11, 0F); // Import Luke2
		bodyModel[96].setRotationPoint(29F, -25.2F, 7F);

		bodyModel[97].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(8, 0, 8, 0), new Coord2D(24, 0, 24, 0), new Coord2D(32, 8, 32, 8), new Coord2D(32, 24, 32, 24), new Coord2D(24, 32, 24, 32), new Coord2D(8, 32, 8, 32), new Coord2D(0, 24, 0, 24), new Coord2D(0, 8, 0, 8) }), 1, 32, 32, 112, 1, ModelRendererTurbo.MR_FRONT, new float[] {12 ,16 ,12 ,16 ,12 ,16 ,12 ,16}); // Import Kranz
		bodyModel[97].setRotationPoint(16F, -26F, 16F);
		bodyModel[97].rotateAngleX = 1.57079633F;

		bodyModel[98].addBox(0F, 0F, 0F, 32, 10, 50, 0F); // Import Body1
		bodyModel[98].setRotationPoint(-15F, -25F, -25F);

		bodyModel[99].addBox(0F, 0F, 0F, 33, 10, 40, 0F); // Import Body2
		bodyModel[99].setRotationPoint(-48F, -25F, -20F);

		bodyModel[100].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(5, 4, 5, 4), new Coord2D(5, 10, 5, 10), new Coord2D(0, 10, 0, 10) }), 33, 5, 10, 28, 33, ModelRendererTurbo.MR_FRONT, new float[] {10 ,5 ,6 ,5 ,2}); // Import BodyShapeL
		bodyModel[100].setRotationPoint(-15F, -15F, 20F);
		bodyModel[100].rotateAngleY = -1.57079633F;

		bodyModel[101].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(5, 4, 5, 4), new Coord2D(5, 10, 5, 10), new Coord2D(0, 10, 0, 10) }), 33, 5, 10, 28, 33, ModelRendererTurbo.MR_FRONT, new float[] {10 ,5 ,6 ,5 ,2}); // Import BodyShapeR
		bodyModel[101].setRotationPoint(-48F, -15F, -20F);
		bodyModel[101].rotateAngleY = 1.57079633F;

		bodyModel[102].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Schaufel1
		bodyModel[102].setRotationPoint(-44.5F, -23F, -25.8F);

		bodyModel[103].addBox(0F, 0F, 0F, 14, 1, 1, 0F); // Import Schaufel2
		bodyModel[103].setRotationPoint(-46F, -22.5F, -25.5F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 3, 1, 0F); // Import Schaufel3
		bodyModel[104].setRotationPoint(-33F, -23.5F, -25.7F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Import Schaufel4
		bodyModel[105].setRotationPoint(-29.5F, -24F, -25.8F);

		bodyModel[106].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Import Aufbau1
		bodyModel[106].setRotationPoint(41.5F, -17F, 23F);

		bodyModel[107].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Import Aufbau2
		bodyModel[107].setRotationPoint(43F, -16F, 27F);

		bodyModel[108].addBox(10F, 4F, -1F, 8, 3, 3, 0F); // Import Aufbau3
		bodyModel[108].setRotationPoint(17F, -25F, 25F);
		bodyModel[108].rotateAngleY = -0.2181662F;

		bodyModel[109].addBox(0F, 0F, 0F, 21, 8, 1, 0F); // Import Kett1
		bodyModel[109].setRotationPoint(-14F, -23F, -26F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Import Kett2
		bodyModel[110].setRotationPoint(-13F, -23.5F, -26.5F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Import Kett3
		bodyModel[111].setRotationPoint(-4F, -23.5F, -26.5F);

		bodyModel[112].addBox(0F, 0F, 0F, 1, 9, 2, 0F); // Import Kett4
		bodyModel[112].setRotationPoint(5F, -23.5F, -26.5F);

		bodyModel[113].addTrapezoid(0F, 0F, 0F, 3, 3, 3, 0F, -0.5F, ModelRendererTurbo.MR_RIGHT); // Import Lampe1
		bodyModel[113].setRotationPoint(51F, -20F, 25F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Import Lampe2
		bodyModel[114].setRotationPoint(51.5F, -18F, 26F);

		bodyModel[115].addBox(0F, 0F, 0F, 15, 1, 9, 0F); // Import Motor1
		bodyModel[115].setRotationPoint(-35F, -25.2F, -18F);

		bodyModel[116].addBox(0F, 0F, 0F, 18, 1, 9, 0F); // Import Motor2
		bodyModel[116].setRotationPoint(-41F, -25.2F, 5F);

		bodyModel[117].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Import Schlepp1
		bodyModel[117].setRotationPoint(56.5F, -7F, -18F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Schlepp2
		bodyModel[118].setRotationPoint(63F, -6.5F, -17F);

		bodyModel[119].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Import Schlepp3
		bodyModel[119].setRotationPoint(56.5F, -7F, -15F);

		bodyModel[120].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Import Schlepp4
		bodyModel[120].setRotationPoint(56.5F, -7F, 14F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Schlepp5
		bodyModel[121].setRotationPoint(63F, -6.5F, 15F);

		bodyModel[122].addBox(0F, 0F, 0F, 8, 2, 1, 0F); // Import Schlepp6
		bodyModel[122].setRotationPoint(56.5F, -7F, 17F);

		bodyModel[123].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 13, 0, 13), new Coord2D(2, 4, 2, 4), new Coord2D(8, 0, 8, 0), new Coord2D(99, 0, 99, 0), new Coord2D(107, 1, 107, 1), new Coord2D(110, 13, 110, 13) }), 42, 110, 13, 241, 42, ModelRendererTurbo.MR_FRONT, new float[] {110 ,13 ,9 ,91 ,8 ,10}); // Import 
		bodyModel[123].setRotationPoint(63F, 3F, 21F);

		bodyModel[124].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(127, 0, 127, 0), new Coord2D(117, 7, 117, 7), new Coord2D(7, 7, 7, 7), new Coord2D(4, 6, 4, 6) }), 1, 127, 7, 262, 1, ModelRendererTurbo.MR_FRONT, new float[] {8 ,4 ,110 ,13 ,127}); // Import 
		bodyModel[124].setRotationPoint(67F, -8F, 21F);

		bodyModel[125].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(127, 0, 127, 0), new Coord2D(117, 7, 117, 7), new Coord2D(7, 7, 7, 7), new Coord2D(4, 6, 4, 6) }), 1, 127, 7, 262, 1, ModelRendererTurbo.MR_FRONT, new float[] {8 ,4 ,110 ,13 ,127}); // Import 
		bodyModel[125].setRotationPoint(67F, -8F, -20F);

		bodyModel[126].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(23, 0, 23, 0), new Coord2D(23, 5, 23, 5) }), 40, 23, 5, 52, 40, ModelRendererTurbo.MR_FRONT, new float[] {24 ,5 ,23}); // Import 
		bodyModel[126].setRotationPoint(63F, -10F, 20F);

		bodyModel[127].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 5, 0, 5), new Coord2D(23, 0, 23, 0), new Coord2D(23, 50, 23, 50), new Coord2D(0, 45, 0, 45) }), 10, 23, 50, 138, 10, ModelRendererTurbo.MR_FRONT, new float[] {40 ,24 ,50 ,24}); // Import 
		bodyModel[127].setRotationPoint(40F, -25F, 25F);
		bodyModel[127].rotateAngleX = 1.57079633F;

		bodyModel[128].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(2, 5, 2, 5), new Coord2D(1, 5, 1, 5), new Coord2D(0, 0, 0, 0) }), 40, 2, 5, 14, 40, ModelRendererTurbo.MR_FRONT, new float[] {1 ,6 ,1 ,6}); // Import 
		bodyModel[128].setRotationPoint(-46F, -10F, 20F);

		bodyModel[129].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(4, 5, 4, 5), new Coord2D(4, 6, 4, 6) }), 10, 4, 6, 16, 10, ModelRendererTurbo.MR_FRONT, new float[] {8 ,1 ,6 ,1}); // Import 
		bodyModel[129].setRotationPoint(67F, -8F, 31F);

		bodyModel[130].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(4, 5, 4, 5), new Coord2D(4, 6, 4, 6) }), 10, 4, 6, 16, 10, ModelRendererTurbo.MR_FRONT, new float[] {8 ,1 ,6 ,1}); // Import 
		bodyModel[130].setRotationPoint(67F, -8F, -21F);

		bodyModel[131].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 1, 0, 1), new Coord2D(0, 0, 0, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2) }), 10, 3, 2, 10, 10, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,4 ,1}); // Import 
		bodyModel[131].setRotationPoint(63F, -13F, 31F);

		bodyModel[132].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 1, 0, 1), new Coord2D(0, 0, 0, 0), new Coord2D(3, 1, 3, 1), new Coord2D(3, 2, 3, 2) }), 10, 3, 2, 10, 10, ModelRendererTurbo.MR_FRONT, new float[] {4 ,1 ,4 ,1}); // Import 
		bodyModel[132].setRotationPoint(63F, -13F, -21F);

		bodyModel[133].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(9, 0, 9, 0), new Coord2D(10, 0, 10, 0), new Coord2D(0, 7, 0, 7), new Coord2D(0, 6, 0, 6) }), 10, 10, 7, 26, 10, ModelRendererTurbo.MR_FRONT, new float[] {11 ,1 ,13 ,1}); // Import 
		bodyModel[133].setRotationPoint(-50F, -8F, 31F);

		bodyModel[134].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(9, 0, 9, 0), new Coord2D(10, 0, 10, 0), new Coord2D(0, 7, 0, 7), new Coord2D(0, 6, 0, 6) }), 10, 10, 7, 26, 10, ModelRendererTurbo.MR_FRONT, new float[] {11 ,1 ,13 ,1}); // Import 
		bodyModel[134].setRotationPoint(-50F, -8F, -21F);

		bodyModel[135].addBox(-2F, -0.5F, -0.5F, 7, 1, 1, 0F); // Import Barrel
		bodyModel[135].setRotationPoint(0F, 0F, 0F);


		turretModel = new ModelRendererTurbo[8];
		turretModel[0] = new ModelRendererTurbo(this, 0, 260, textureX, textureY); // Import Turm1
		turretModel[1] = new ModelRendererTurbo(this, 130, 260, textureX, textureY); // Import Turm2
		turretModel[2] = new ModelRendererTurbo(this, 220, 260, textureX, textureY); // Import Turm3
		turretModel[3] = new ModelRendererTurbo(this, 170, 320, textureX, textureY); // Import Turm4
		turretModel[4] = new ModelRendererTurbo(this, 170, 372, textureX, textureY); // Import Turm5
		turretModel[5] = new ModelRendererTurbo(this, 180, 350, textureX, textureY); // Import Turm6
		turretModel[6] = new ModelRendererTurbo(this, 130, 260, textureX, textureY); // Import Turm7
		turretModel[7] = new ModelRendererTurbo(this, 130, 272, textureX, textureY); // Import Turm8

		turretModel[0].addFlexTrapezoid(0F, -39F, -21F, 21, 13, 42, 0F, 0F, -3F, -6F, -6F, -6F, -6F, ModelRendererTurbo.MR_TOP); // Import Turm1
		turretModel[0].setRotationPoint(0F, 0F, 0F);

		turretModel[1].addFlexTrapezoid(0F, -39F, -21F, 21, 13, 42, 0F, 0F, -4F, -6F, -6F, -6F, -6F, ModelRendererTurbo.MR_TOP); // Import Turm2
		turretModel[1].setRotationPoint(0F, 0F, 0F);
		turretModel[1].rotateAngleY = 3.14159265F;

		turretModel[2].addShape3D(0F, -12F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(19, 0, 19, 0), new Coord2D(21, 4, 21, 4), new Coord2D(22, 8, 22, 8), new Coord2D(22, 16, 22, 16), new Coord2D(21, 20, 21, 20), new Coord2D(19, 24, 19, 24), new Coord2D(0, 24, 0, 24) }), 4, 22, 24, 90, 4, ModelRendererTurbo.MR_FRONT, new float[] {24 ,19 ,5 ,5 ,8 ,5 ,5 ,19}); // Import Turm3
		turretModel[2].setRotationPoint(-13F, -38.9F, 0F);
		turretModel[2].rotateAngleX = 1.57079633F;

		turretModel[3].addShape3D(0F, -8F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(21, 0, 21, 0), new Coord2D(22, 4, 22, 4), new Coord2D(22, 12, 22, 12), new Coord2D(21, 16, 21, 16), new Coord2D(0, 16, 0, 16) }), 7, 22, 16, 76, 7, ModelRendererTurbo.MR_FRONT, new float[] {16 ,21 ,5 ,8 ,5 ,21}); // Import Turm4
		turretModel[3].setRotationPoint(-13F, -34.9F, 0F);
		turretModel[3].rotateAngleX = 1.57079633F;

		turretModel[4].addShape3D(0F, -8F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(12, 0, 12, 0), new Coord2D(16, 4, 16, 4), new Coord2D(16, 12, 16, 12), new Coord2D(12, 16, 12, 16), new Coord2D(4, 16, 4, 16), new Coord2D(0, 12, 0, 12), new Coord2D(0, 4, 0, 4) }), 6, 16, 16, 56, 6, ModelRendererTurbo.MR_FRONT, new float[] {6 ,8 ,6 ,8 ,6 ,8 ,6 ,8}); // Import Turm5
		turretModel[4].setRotationPoint(-5F, -43F, 0F);
		turretModel[4].rotateAngleX = 1.57079633F;

		turretModel[5].addShape3D(0F, -7F, 0F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(11, 0, 11, 0), new Coord2D(14, 3, 14, 3), new Coord2D(14, 11, 14, 11), new Coord2D(11, 14, 11, 14), new Coord2D(3, 14, 3, 14), new Coord2D(0, 11, 0, 11), new Coord2D(0, 3, 0, 3) }), 1, 14, 14, 52, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,8 ,5 ,8 ,5 ,8 ,5 ,8}); // Import Turm6
		turretModel[5].setRotationPoint(-6F, -44F, 0F);
		turretModel[5].rotateAngleX = 1.57079633F;

		turretModel[6].addBox(0F, 0F, 0F, 7, 2, 7, 0F); // Import Turm7
		turretModel[6].setRotationPoint(3F, -40F, -11F);

		turretModel[7].addFlexBox(0F, 0F, 0F, 4, 8, 15, 0F, -1F, -1F, -0.2F, -0.2F, ModelRendererTurbo.MR_LEFT); // Import Turm8
		turretModel[7].setRotationPoint(17F, -36F, -9.5F);


		barrelModel = new ModelRendererTurbo[17];
		barrelModel[0] = new ModelRendererTurbo(this, 320, 400, textureX, textureY); // Import Rohr1
		barrelModel[1] = new ModelRendererTurbo(this, 370, 400, textureX, textureY); // Import Rohr2
		barrelModel[2] = new ModelRendererTurbo(this, 370, 400, textureX, textureY); // Import Rohr3
		barrelModel[3] = new ModelRendererTurbo(this, 400, 400, textureX, textureY); // Import Rohr4
		barrelModel[4] = new ModelRendererTurbo(this, 432, 400, textureX, textureY); // Import Rohr5
		barrelModel[5] = new ModelRendererTurbo(this, 447, 400, textureX, textureY); // Import Rohr6
		barrelModel[6] = new ModelRendererTurbo(this, 410, 415, textureX, textureY); // Import Rohr7
		barrelModel[7] = new ModelRendererTurbo(this, 420, 415, textureX, textureY); // Import Rohr8
		barrelModel[8] = new ModelRendererTurbo(this, 433, 415, textureX, textureY); // Import Rohr9
		barrelModel[9] = new ModelRendererTurbo(this, 450, 415, textureX, textureY); // Import Rohr10
		barrelModel[10] = new ModelRendererTurbo(this, 465, 415, textureX, textureY); // Import Rohr11
		barrelModel[11] = new ModelRendererTurbo(this, 483, 415, textureX, textureY); // Import Rohr12
		barrelModel[12] = new ModelRendererTurbo(this, 420, 415, textureX, textureY); // Import Rohr8
		barrelModel[13] = new ModelRendererTurbo(this, 433, 415, textureX, textureY); // Import Rohr9
		barrelModel[14] = new ModelRendererTurbo(this, 450, 415, textureX, textureY); // Import Rohr10
		barrelModel[15] = new ModelRendererTurbo(this, 465, 415, textureX, textureY); // Import Rohr11
		barrelModel[16] = new ModelRendererTurbo(this, 483, 415, textureX, textureY); // Import Rohr12

		barrelModel[0].addBox(-6F, -3F, -5F, 18, 6, 10, 0F); // Import Rohr1
		barrelModel[0].setRotationPoint(20F, -32F, 0F);

		barrelModel[1].addFlexBox(0F, -4F, -10F, 3, 8, 16, 0F, -1F, -1F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Import Rohr2
		barrelModel[1].setRotationPoint(20F, -32F, 0F);

		barrelModel[2].addBox(2F, -0.5F, -8F, 5, 1, 1, 0F); // Import Rohr3
		barrelModel[2].setRotationPoint(20F, -32F, 0F);

		barrelModel[3].addBox(12F, -2.5F, -2.5F, 10, 5, 5, 0F); // Import Rohr4
		barrelModel[3].setRotationPoint(20F, -32F, 0F);

		barrelModel[4].addTrapezoid(22F, -2.5F, -2.5F, 1, 5, 5, 0F, -1F, ModelRendererTurbo.MR_LEFT); // Import Rohr5
		barrelModel[4].setRotationPoint(20F, -32F, 0F);

		barrelModel[5].addTrapezoid(23F, -1.5F, -1.5F, 28, 3, 3, 0F, -0.1F, ModelRendererTurbo.MR_LEFT); // Import Rohr6
		barrelModel[5].setRotationPoint(20F, -32F, 0F);

		barrelModel[6].addTrapezoid(51F, -1.5F, -1.5F, 1, 3, 3, 0F, -0.1F, ModelRendererTurbo.MR_RIGHT); // Import Rohr7
		barrelModel[6].setRotationPoint(20F, -32F, 0F);

		barrelModel[7].addBox(52F, -1.5F, -1.5F, 2, 3, 3, 0F); // Import Rohr8
		barrelModel[7].setRotationPoint(20F, -32F, 0F);

		barrelModel[8].addTrapezoid(54F, -2.5F, -2.5F, 2, 5, 5, 0F, -1F, ModelRendererTurbo.MR_RIGHT); // Import Rohr9
		barrelModel[8].setRotationPoint(20F, -32F, 0F);

		barrelModel[9].addTrapezoid(56F, -2.5F, -2.5F, 1, 5, 5, 0F, -0.5F, ModelRendererTurbo.MR_LEFT); // Import Rohr10
		barrelModel[9].setRotationPoint(20F, -32F, 0F);

		barrelModel[10].addBox(57F, -2F, -2F, 3, 4, 4, 0F); // Import Rohr11
		barrelModel[10].setRotationPoint(20F, -32F, 0F);

		barrelModel[11].addTrapezoid(60F, -2F, -2F, 1, 4, 4, 0F, -0.5F, ModelRendererTurbo.MR_LEFT); // Import Rohr12
		barrelModel[11].setRotationPoint(20F, -32F, 0F);

		barrelModel[12].addBox(52F, -1.5F, -1.5F, 2, 3, 3, 0F); // Import Rohr8
		barrelModel[12].setRotationPoint(20F, -32F, 0F);

		barrelModel[13].addTrapezoid(54F, -2.5F, -2.5F, 2, 5, 5, 0F, -1F, ModelRendererTurbo.MR_RIGHT); // Import Rohr9
		barrelModel[13].setRotationPoint(20F, -32F, 0F);

		barrelModel[14].addTrapezoid(56F, -2.5F, -2.5F, 1, 5, 5, 0F, -0.5F, ModelRendererTurbo.MR_LEFT); // Import Rohr10
		barrelModel[14].setRotationPoint(20F, -32F, 0F);

		barrelModel[15].addBox(57F, -2F, -2F, 3, 4, 4, 0F); // Import Rohr11
		barrelModel[15].setRotationPoint(20F, -32F, 0F);

		barrelModel[16].addTrapezoid(60F, -2F, -2F, 1, 4, 4, 0F, -0.5F, ModelRendererTurbo.MR_LEFT); // Import Rohr12
		barrelModel[16].setRotationPoint(20F, -32F, 0F);


		leftTrackWheelModels = new ModelRendererTurbo[24];
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Rad11L
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Rad12L
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad21L
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad22L
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad31L
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad32L
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad41L
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad42L
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad51L
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad52L
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad61L
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad62L
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad71L
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad72L
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad81L
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad82L
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad91L
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad92L
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 80, 320, textureX, textureY); // Import Rad101L
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 80, 320, textureX, textureY); // Import Rad102L
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad111L
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad121L
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad131L
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad141L

		leftTrackWheelModels[0].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 1, 13, 13, 48, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Rad11L
		leftTrackWheelModels[0].setRotationPoint(-47.5F, -0.5F, -28.5F);

		leftTrackWheelModels[1].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 1, 13, 13, 48, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Rad12L
		leftTrackWheelModels[1].setRotationPoint(-47.5F, -0.5F, -23.5F);

		leftTrackWheelModels[2].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad21L
		leftTrackWheelModels[2].setRotationPoint(-33F, 4F, -27F);

		leftTrackWheelModels[3].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad22L
		leftTrackWheelModels[3].setRotationPoint(-33F, 4F, -24.5F);

		leftTrackWheelModels[4].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad31L
		leftTrackWheelModels[4].setRotationPoint(-22F, 4F, -27F);

		leftTrackWheelModels[5].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad32L
		leftTrackWheelModels[5].setRotationPoint(-22F, 4F, -24.5F);

		leftTrackWheelModels[6].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad41L
		leftTrackWheelModels[6].setRotationPoint(-11F, 4F, -27F);

		leftTrackWheelModels[7].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad42L
		leftTrackWheelModels[7].setRotationPoint(-11F, 4F, -24.5F);

		leftTrackWheelModels[8].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad51L
		leftTrackWheelModels[8].setRotationPoint(0F, 4F, -27F);

		leftTrackWheelModels[9].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad52L
		leftTrackWheelModels[9].setRotationPoint(0F, 4F, -24.5F);

		leftTrackWheelModels[10].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad61L
		leftTrackWheelModels[10].setRotationPoint(11F, 4F, -27F);

		leftTrackWheelModels[11].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad62L
		leftTrackWheelModels[11].setRotationPoint(11F, 4F, -24.5F);

		leftTrackWheelModels[12].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad71L
		leftTrackWheelModels[12].setRotationPoint(22F, 4F, -27F);

		leftTrackWheelModels[13].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad72L
		leftTrackWheelModels[13].setRotationPoint(22F, 4F, -24.5F);

		leftTrackWheelModels[14].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad81L
		leftTrackWheelModels[14].setRotationPoint(33F, 4F, -27F);

		leftTrackWheelModels[15].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad82L
		leftTrackWheelModels[15].setRotationPoint(33F, 4F, -24.5F);

		leftTrackWheelModels[16].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad91L
		leftTrackWheelModels[16].setRotationPoint(44F, 4F, -27F);

		leftTrackWheelModels[17].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad92L
		leftTrackWheelModels[17].setRotationPoint(44F, 4F, -24.5F);

		leftTrackWheelModels[18].addShape3D(7.5F, -7.5F, -0.1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 1, 15, 15, 52, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Rad101L
		leftTrackWheelModels[18].setRotationPoint(54.5F, -3.5F, -28.5F);

		leftTrackWheelModels[19].addShape3D(7.5F, -7.5F, -0.1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 1, 15, 15, 52, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Rad102L
		leftTrackWheelModels[19].setRotationPoint(54.5F, -3.5F, -23.5F);

		leftTrackWheelModels[20].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad111L
		leftTrackWheelModels[20].setRotationPoint(33F, -9F, -26F);
		leftTrackWheelModels[20].rotateAngleY = -3.14159265F;

		leftTrackWheelModels[21].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad121L
		leftTrackWheelModels[21].setRotationPoint(15F, -9F, -26F);
		leftTrackWheelModels[21].rotateAngleY = -3.14159265F;

		leftTrackWheelModels[22].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad131L
		leftTrackWheelModels[22].setRotationPoint(-7F, -9F, -26F);
		leftTrackWheelModels[22].rotateAngleY = -3.14159265F;

		leftTrackWheelModels[23].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad141L
		leftTrackWheelModels[23].setRotationPoint(-29F, -9F, -26F);
		leftTrackWheelModels[23].rotateAngleY = -3.14159265F;


		rightTrackWheelModels = new ModelRendererTurbo[24];
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Rad11R
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Rad12R
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad21R
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad22R
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad31R
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad32R
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad41R
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad42R
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad51R
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad52R
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad61R
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad62R
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad71R
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad72R
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad81R
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad82R
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad91R
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 40, 325, textureX, textureY); // Import Rad92R
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 80, 320, textureX, textureY); // Import Rad101R
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 80, 320, textureX, textureY); // Import Rad102R
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad111R
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad121R
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad131R
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 120, 320, textureX, textureY); // Import Rad141R

		rightTrackWheelModels[0].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 1, 13, 13, 48, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Rad11R
		rightTrackWheelModels[0].setRotationPoint(-47.5F, -0.5F, 28.5F);

		rightTrackWheelModels[1].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 1, 13, 13, 48, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Rad12R
		rightTrackWheelModels[1].setRotationPoint(-47.5F, -0.5F, 23.5F);

		rightTrackWheelModels[2].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad21R
		rightTrackWheelModels[2].setRotationPoint(-33F, 4F, 27F);

		rightTrackWheelModels[3].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad22R
		rightTrackWheelModels[3].setRotationPoint(-33F, 4F, 24.5F);

		rightTrackWheelModels[4].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad31R
		rightTrackWheelModels[4].setRotationPoint(-22F, 4F, 27F);

		rightTrackWheelModels[5].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad32R
		rightTrackWheelModels[5].setRotationPoint(-22F, 4F, 24.5F);

		rightTrackWheelModels[6].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad41R
		rightTrackWheelModels[6].setRotationPoint(-11F, 4F, 27F);

		rightTrackWheelModels[7].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad42R
		rightTrackWheelModels[7].setRotationPoint(-11F, 4F, 24.5F);

		rightTrackWheelModels[8].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad51R
		rightTrackWheelModels[8].setRotationPoint(0F, 4F, 27F);

		rightTrackWheelModels[9].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad52R
		rightTrackWheelModels[9].setRotationPoint(0F, 4F, 24.5F);

		rightTrackWheelModels[10].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad61R
		rightTrackWheelModels[10].setRotationPoint(11F, 4F, 27F);

		rightTrackWheelModels[11].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad62R
		rightTrackWheelModels[11].setRotationPoint(11F, 4F, 24.5F);

		rightTrackWheelModels[12].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad71R
		rightTrackWheelModels[12].setRotationPoint(22F, 4F, 27F);

		rightTrackWheelModels[13].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad72R
		rightTrackWheelModels[13].setRotationPoint(22F, 4F, 24.5F);

		rightTrackWheelModels[14].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad81R
		rightTrackWheelModels[14].setRotationPoint(33F, 4F, 27F);

		rightTrackWheelModels[15].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad82R
		rightTrackWheelModels[15].setRotationPoint(33F, 4F, 24.5F);

		rightTrackWheelModels[16].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad91R
		rightTrackWheelModels[16].setRotationPoint(44F, 4F, 27F);

		rightTrackWheelModels[17].addShape3D(5F, -5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(7, 0, 7, 0), new Coord2D(10, 3, 10, 3), new Coord2D(10, 7, 10, 7), new Coord2D(7, 10, 7, 10), new Coord2D(3, 10, 3, 10), new Coord2D(0, 7, 0, 7), new Coord2D(0, 3, 0, 3) }), 2, 10, 10, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,5 ,4 ,5 ,4 ,5 ,4}); // Import Rad92R
		rightTrackWheelModels[17].setRotationPoint(44F, 4F, 24.5F);

		rightTrackWheelModels[18].addShape3D(7.5F, -7.5F, -0.1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 1, 15, 15, 52, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Rad101R
		rightTrackWheelModels[18].setRotationPoint(54.5F, -3.5F, 28.5F);

		rightTrackWheelModels[19].addShape3D(7.5F, -7.5F, -0.1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 1, 15, 15, 52, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Rad102R
		rightTrackWheelModels[19].setRotationPoint(54.5F, -3.5F, 23.5F);

		rightTrackWheelModels[20].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad111R
		rightTrackWheelModels[20].setRotationPoint(33F, -9F, 26F);
		rightTrackWheelModels[20].rotateAngleY = -3.14159265F;

		rightTrackWheelModels[21].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad121R
		rightTrackWheelModels[21].setRotationPoint(15F, -9F, 26F);
		rightTrackWheelModels[21].rotateAngleY = -3.14159265F;

		rightTrackWheelModels[22].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad131R
		rightTrackWheelModels[22].setRotationPoint(-7F, -9F, 26F);
		rightTrackWheelModels[22].rotateAngleY = -3.14159265F;

		rightTrackWheelModels[23].addShape3D(2F, -2F, -2F, new Shape2D(new Coord2D[] { new Coord2D(1, 0, 1, 0), new Coord2D(3, 0, 3, 0), new Coord2D(4, 1, 4, 1), new Coord2D(4, 3, 4, 3), new Coord2D(3, 4, 3, 4), new Coord2D(1, 4, 1, 4), new Coord2D(0, 3, 0, 3), new Coord2D(0, 1, 0, 1) }), 4, 4, 4, 16, 4, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Import Rad141R
		rightTrackWheelModels[23].setRotationPoint(-29F, -9F, 26F);
		rightTrackWheelModels[23].rotateAngleY = -3.14159265F;


		leftTrackModel = new ModelRendererTurbo[16];
		leftTrackModel[0] = new ModelRendererTurbo(this, 0, 503, textureX, textureY); // Import Kette1L
		leftTrackModel[1] = new ModelRendererTurbo(this, 0, 492, textureX, textureY); // Import Kette2L
		leftTrackModel[2] = new ModelRendererTurbo(this, 0, 478, textureX, textureY); // Import Kette3L
		leftTrackModel[3] = new ModelRendererTurbo(this, 36, 490, textureX, textureY); // Import Kette4L
		leftTrackModel[4] = new ModelRendererTurbo(this, 61, 486, textureX, textureY); // Import Kette5L
		leftTrackModel[5] = new ModelRendererTurbo(this, 81, 489, textureX, textureY); // Import Kette6L
		leftTrackModel[6] = new ModelRendererTurbo(this, 20, 480, textureX, textureY); // Import Kette7L
		leftTrackModel[7] = new ModelRendererTurbo(this, 0, 467, textureX, textureY); // Import Kette8L
		leftTrackModel[8] = new ModelRendererTurbo(this, 100, 480, textureX, textureY); // Import Kette9L
		leftTrackModel[9] = new ModelRendererTurbo(this, 120, 492, textureX, textureY); // Import Kette10L
		leftTrackModel[10] = new ModelRendererTurbo(this, 120, 477, textureX, textureY); // Import Kette11L
		leftTrackModel[11] = new ModelRendererTurbo(this, 140, 480, textureX, textureY); // Import Kette12L
		leftTrackModel[12] = new ModelRendererTurbo(this, 160, 488, textureX, textureY); // Import Kette13L
		leftTrackModel[13] = new ModelRendererTurbo(this, 172, 478, textureX, textureY); // Import Kette14L
		leftTrackModel[14] = new ModelRendererTurbo(this, 174, 501, textureX, textureY); // Import Kette15L
		leftTrackModel[15] = new ModelRendererTurbo(this, 192, 474, textureX, textureY); // Import Kette16L

		leftTrackModel[0].addBox(0F, 0F, 0F, 81, 1, 8, 0F); // Import Kette1L
		leftTrackModel[0].setRotationPoint(-35F, 9F, -30F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 13, 1, 8, 0F); // Import Kette2L
		leftTrackModel[1].setRotationPoint(58F, 5F, -30F);
		leftTrackModel[1].rotateAngleZ = -2.75762F;

		leftTrackModel[2].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Import Kette3L
		leftTrackModel[2].setRotationPoint(58F, 5F, -30F);
		leftTrackModel[2].rotateAngleZ = 2.356194F;

		leftTrackModel[3].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Import Kette4L
		leftTrackModel[3].setRotationPoint(63F, 0F, -30F);
		leftTrackModel[3].rotateAngleZ = -2.356194F;

		leftTrackModel[4].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Import Kette5L
		leftTrackModel[4].setRotationPoint(62F, -7F, -30F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Import Kette6L
		leftTrackModel[5].setRotationPoint(63F, -7F, -30F);
		leftTrackModel[5].rotateAngleZ = -2.356194F;

		leftTrackModel[6].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Import Kette7L
		leftTrackModel[6].setRotationPoint(58F, -12F, -30F);
		leftTrackModel[6].rotateAngleZ = -0.78539816F;

		leftTrackModel[7].addBox(0F, 0F, 0F, 88, 1, 8, 0F); // Import Kette8L
		leftTrackModel[7].setRotationPoint(-30F, -12F, -30F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 1, 12, 8, 0F); // Import Kette9L
		leftTrackModel[8].setRotationPoint(-30F, -12F, -30F);
		leftTrackModel[8].rotateAngleZ = -1.38257482F;

		leftTrackModel[9].addBox(0F, 0F, 0F, 10, 1, 8, 0F); // Import Kette10L
		leftTrackModel[9].setRotationPoint(-51F, -8F, -30F);
		leftTrackModel[9].rotateAngleZ = 0.1882215F;

		leftTrackModel[10].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Import Kette11L
		leftTrackModel[10].setRotationPoint(-51F, -8F, -30F);
		leftTrackModel[10].rotateAngleZ = -0.78539816F;

		leftTrackModel[11].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Import Kette12L
		leftTrackModel[11].setRotationPoint(-55F, -4F, -30F);
		leftTrackModel[11].rotateAngleZ = 0.78539816F;

		leftTrackModel[12].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Import Kette13L
		leftTrackModel[12].setRotationPoint(-55F, -4F, -30F);

		leftTrackModel[13].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Import Kette14L
		leftTrackModel[13].setRotationPoint(-55F, 3F, -30F);
		leftTrackModel[13].rotateAngleZ = 0.78539816F;

		leftTrackModel[14].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Import Kette15L
		leftTrackModel[14].setRotationPoint(-51F, 7F, -30F);
		leftTrackModel[14].rotateAngleZ = 2.356194F;

		leftTrackModel[15].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // Import Kette16L
		leftTrackModel[15].setRotationPoint(-51F, 7F, -30F);
		leftTrackModel[15].rotateAngleZ = 1.38544838F;


		rightTrackModel = new ModelRendererTurbo[16];
		rightTrackModel[0] = new ModelRendererTurbo(this, 0, 503, textureX, textureY); // Import Kette1R
		rightTrackModel[1] = new ModelRendererTurbo(this, 0, 492, textureX, textureY); // Import Kette2R
		rightTrackModel[2] = new ModelRendererTurbo(this, 0, 478, textureX, textureY); // Import Kette3R
		rightTrackModel[3] = new ModelRendererTurbo(this, 36, 490, textureX, textureY); // Import Kette4R
		rightTrackModel[4] = new ModelRendererTurbo(this, 61, 486, textureX, textureY); // Import Kette5R
		rightTrackModel[5] = new ModelRendererTurbo(this, 81, 489, textureX, textureY); // Import Kette6R
		rightTrackModel[6] = new ModelRendererTurbo(this, 20, 480, textureX, textureY); // Import Kette7R
		rightTrackModel[7] = new ModelRendererTurbo(this, 0, 467, textureX, textureY); // Import Kette8R
		rightTrackModel[8] = new ModelRendererTurbo(this, 100, 480, textureX, textureY); // Import Kette9R
		rightTrackModel[9] = new ModelRendererTurbo(this, 120, 492, textureX, textureY); // Import Kette10R
		rightTrackModel[10] = new ModelRendererTurbo(this, 120, 477, textureX, textureY); // Import Kette11R
		rightTrackModel[11] = new ModelRendererTurbo(this, 140, 480, textureX, textureY); // Import Kette12R
		rightTrackModel[12] = new ModelRendererTurbo(this, 160, 488, textureX, textureY); // Import Kette13R
		rightTrackModel[13] = new ModelRendererTurbo(this, 172, 478, textureX, textureY); // Import Kette14R
		rightTrackModel[14] = new ModelRendererTurbo(this, 174, 501, textureX, textureY); // Import Kette15R
		rightTrackModel[15] = new ModelRendererTurbo(this, 192, 474, textureX, textureY); // Import Kette16R

		rightTrackModel[0].addBox(0F, 0F, 0F, 81, 1, 8, 0F); // Import Kette1R
		rightTrackModel[0].setRotationPoint(-35F, 9F, 22F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 13, 1, 8, 0F); // Import Kette2R
		rightTrackModel[1].setRotationPoint(58F, 5F, 22F);
		rightTrackModel[1].rotateAngleZ = -2.75762F;

		rightTrackModel[2].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Import Kette3R
		rightTrackModel[2].setRotationPoint(58F, 5F, 22F);
		rightTrackModel[2].rotateAngleZ = 2.356194F;

		rightTrackModel[3].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Import Kette4R
		rightTrackModel[3].setRotationPoint(63F, 0F, 22F);
		rightTrackModel[3].rotateAngleZ = -2.356194F;

		rightTrackModel[4].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Import Kette5R
		rightTrackModel[4].setRotationPoint(62F, -7F, 22F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Import Kette6R
		rightTrackModel[5].setRotationPoint(63F, -7F, 22F);
		rightTrackModel[5].rotateAngleZ = -2.356194F;

		rightTrackModel[6].addBox(0F, 0F, 0F, 4, 1, 8, 0F); // Import Kette7R
		rightTrackModel[6].setRotationPoint(58F, -12F, 22F);
		rightTrackModel[6].rotateAngleZ = -0.78539816F;

		rightTrackModel[7].addBox(0F, 0F, 0F, 88, 1, 8, 0F); // Import Kette8R
		rightTrackModel[7].setRotationPoint(-30F, -12F, 22F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 1, 12, 8, 0F); // Import Kette9R
		rightTrackModel[8].setRotationPoint(-30F, -12F, 22F);
		rightTrackModel[8].rotateAngleZ = -1.38257482F;

		rightTrackModel[9].addBox(0F, 0F, 0F, 10, 1, 8, 0F); // Import Kette10R
		rightTrackModel[9].setRotationPoint(-51F, -8F, 22F);
		rightTrackModel[9].rotateAngleZ = 0.1882215F;

		rightTrackModel[10].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Import Kette11R
		rightTrackModel[10].setRotationPoint(-51F, -8F, 22F);
		rightTrackModel[10].rotateAngleZ = -0.78539816F;

		rightTrackModel[11].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Import Kette12R
		rightTrackModel[11].setRotationPoint(-55F, -4F, 22F);
		rightTrackModel[11].rotateAngleZ = 0.78539816F;

		rightTrackModel[12].addBox(0F, 0F, 0F, 1, 7, 8, 0F); // Import Kette13R
		rightTrackModel[12].setRotationPoint(-55F, -4F, 22F);

		rightTrackModel[13].addBox(0F, 0F, 0F, 1, 3, 8, 0F); // Import Kette14R
		rightTrackModel[13].setRotationPoint(-55F, 3F, 22F);
		rightTrackModel[13].rotateAngleZ = 0.78539816F;

		rightTrackModel[14].addBox(0F, 0F, 0F, 3, 1, 8, 0F); // Import Kette15R
		rightTrackModel[14].setRotationPoint(-51F, 7F, 22F);
		rightTrackModel[14].rotateAngleZ = 2.356194F;

		rightTrackModel[15].addBox(0F, 0F, 0F, 1, 17, 8, 0F); // Import Kette16R
		rightTrackModel[15].setRotationPoint(-51F, 7F, 22F);
		rightTrackModel[15].rotateAngleZ = 1.38544838F;

		/*MGFrontModel = new ModelRendererTurbo[3][];

		    
		    MGFrontModel[0] = new ModelRendererTurbo[0];

		    
		    MGFrontModel[1] = new ModelRendererTurbo[1];
		    MGFrontModel[1][0] = new ModelRendererTurbo(this, 425, 0, this.textureX, this.textureY);
		    
		    MGFrontModel[1][0].addBox(-2.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);

		    
		    for (ModelRendererTurbo gunPart : MGFrontModel[1])
		    {
		      gunPart.setRotationPoint(42.5F, -19.5F, -11.5F);
		    }

		    
		    MGFrontModel[2] = new ModelRendererTurbo[0];*/

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < bodyModel.length; i++)
		{
			bodyModel[i].render(f5);
		}
		for(int i = 0; i < turretModel.length; i++)
		{
			turretModel[i].render(f5);
		}
		for(int i = 0; i < barrelModel.length; i++)
		{
			barrelModel[i].render(f5);
		}
		for(int i = 0; i < leftTrackModel.length; i++)
		{
			leftTrackModel[i].render(f5);
		}
		for(int i = 0; i < rightTrackModel.length; i++)
		{
			rightTrackModel[i].render(f5);
		}
		for(int i = 0; i < leftTrackWheelModels.length; i++)
		{
			leftTrackWheelModels[i].render(f5);
		}
		for(int i = 0; i < rightTrackWheelModels.length; i++)
		{
			rightTrackWheelModels[i].render(f5);
		}
		/*for(int i = 0; i < MGFrontModel.length; i++)
		{
			for(int j = 0; j < MGFrontModel[0].length; j++)
			{
				MGFrontModel[i][j].render(f5);
			}
		}*/
	}
}
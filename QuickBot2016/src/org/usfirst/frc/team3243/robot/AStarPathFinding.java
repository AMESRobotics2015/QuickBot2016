package org.usfirst.frc.team3243.robot;

public class AStarPathFinding {

	int l;
	int w;
	int[][] field = new int[30][26];
	
	public void fieldsetup(){
		for(int x = 1 ; x < 31 ; x++){
			for(int w = 1; w < 27; w++){
				field[l][w] = 1;
			}
		}
		for (int l = 17; l < 21; l++){
			for (int w = 1; w < 4; w++){
				field[l][w] = 2;
			}
		}
		for (int l = 17; l < 21; l++){
			for (int w = 4; w < 22; w++){
				field[l][w] = 3;
			}
		}
		for (int l = 1; l < 25; l++){
			for (int w = 23; w < 27; w++){
				field[l][w] = 0;
			}
		}
		field[3][9] = 6;
		field[24][2] = 5;
	}
	
	public void pathfind(){
		
	}
}

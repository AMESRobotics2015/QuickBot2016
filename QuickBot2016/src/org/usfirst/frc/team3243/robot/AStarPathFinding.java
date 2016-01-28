package org.usfirst.frc.team3243.robot;

public class AStarPathFinding {

	int l;
	int w;
	int[][] feild = new int[54][26];
	
	public void feildsetup(){
		for(int x = 1 ; x < 55 ; x++){
			for(int w = 1; w < 26; w++){
				feild[l][w] = 1;
			}
		}
	}
}

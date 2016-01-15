package org.usfirst.frc.team3243.robot;

import edu.wpi.first.wpilibj.Joystick;


/**
 	* 
 	* X1,A2,B3,Y4,LB5,RB6,LT7,RT8,BA9,ST10,LJ11,RJ12
 */
public class InputManager {
	Joystick cont = new Joystick(0);
	double[] in;
	double[] input() {
		in[0] = ramp(deadZone(cont.getRawAxis(0)));
		return(in);
	}
	
	double deadZone (double input) {
		double deadRange = 0.1;
		if (Math.abs(input) < deadRange) {
			input = 0;
		}
		return input;
	}
	
	double ramp(double input){
		if (cont.getRawButton(13)) {
			input = Math.pow(input, 3)/3;
		}else{
			input = Math.pow(input, 3)/6
		}
		
				
	}
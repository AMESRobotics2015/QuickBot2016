package org.usfirst.frc.team3243.robot;

import edu.wpi.first.wpilibj.Joystick;


/**
 	* White tape right side
 	* X1,A2,B3,Y4,LB5,RB6,LT7,RT8,BA9,ST10,LJ11,RJ12
 	* Written by Cole, Malachi and Cuyler 1/15/16
 */
public class InputManager {
	Joystick ctrl = new Joystick(0);
	double[] in;
	
	double[] controllerInput() {
		in[0] = ramp(deadZone(ctrl.getRawAxis(0)));
		in[1] = ramp(deadZone(ctrl.getRawAxis(1)));
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
		if (ctrl.getRawButton(13)) {
			input = Math.pow(input, 3)/3;
		}else{
			input = Math.pow(input, 3)/6;
		}
		return input;
	}	
}
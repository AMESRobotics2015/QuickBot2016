package org.usfirst.frc.team3243.robot;

import edu.wpi.first.wpilibj.Joystick;


/**
 	* Plug white tape controller into the right side USB port
 	* 
 	* X1,A2,B3,Y4,LB5,RB6,LT7,RT8,BA9,ST10,LJ11,RJ12
 	* Written by Cole, Malachi and Cuyler 1/15/16
 */
public class InputManager {
	Joystick ctrl = new Joystick(0);
	double[] in;
	
	double[] controllerInput() {
		in[0] = ramp(deadZone(ctrl.getRawAxis(1))); //get a value (-1 to 1) from the controller. Then make sure it's outside of the deadzone. Then multiply it if the sprinting button is pressed.
		in[1] = ramp(deadZone(ctrl.getRawAxis(3)));
		return(in);
	}
	
	
	//sets input to 0 if it's within the deadzone
	double deadZone (double input) {
		double deadRange = 0.1;
		if (Math.abs(input) < deadRange) {
			input = 0;
		}
		return input;
	}
	
	
	//Make it so that if either trigger is pressed, robot goes at full speed. Otherwise, it goes at partial speed.
	//Intended to affect getRawAxis()
	double ramp(double input){
		if (ctrl.getRawButton(7)) {
			input = Math.pow(input, 3) / 3;
		}else{
			input = Math.pow(input, 3) / 6;
		}
		return input;
	}	
}

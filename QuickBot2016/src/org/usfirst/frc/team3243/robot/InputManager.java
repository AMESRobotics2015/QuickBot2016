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
	double[] in = new double[2];
	
	/**
	 * Basic controller input to be set up for sending to the robot.
	 * @return
	 */
	double[] controllerInput() {
		in[0] = 1 * ramp(deadZone(ctrl.getRawAxis(1))); //get a value (-1 to 1) from the controller. Then make sure it's outside of the deadzone. Then multiply it if the sprinting button is pressed.
		in[1] = 1 * ramp(deadZone(ctrl.getRawAxis(3)));
		return(in);
	}
	
	/**
	 * sets input to 0 if it's within the deadzone
	 * @param input
	 * @return
	 */
	double deadZone (double input) {
		double deadRange = 0.1;
		if (Math.abs(input) < deadRange) {
			input = 0;
		}
		return input;
	}
	
	
	/**
	 * Make it so that if either trigger is pressed, robot goes at full speed. Otherwise, it goes at partial speed. Intended to affect getRawAxis()
	 * @param input
	 * @return
	 */
	double ramp(double input){
		
			//input = Math.pow(input, 3) / 3;
		
		return input;
	}	
	
	/**
	 * Much like above, this will allow us to get an axis reading if need be for a gamepiece.
	 */
	public void gameRawAxisGet(){
		
	}
	
	public boolean getButton(int button) {
		return ctrl.getRawButton(button);
	}
	
	/**
	 * Read button presses as user input.
	 */
	public void gameButtons(){
		
	}
}

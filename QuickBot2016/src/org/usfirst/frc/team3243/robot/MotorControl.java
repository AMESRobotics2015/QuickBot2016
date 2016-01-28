package org.usfirst.frc.team3243.robot;

import edu.wpi.first.wpilibj.Victor;

//written by Cole 1/15/16

public class MotorControl {
	public static final double SPEED_FACTOR=0.7;
	Victor motor1 = new Victor(0);
	Victor motor2 = new Victor(1);
	Victor motor3 = new Victor(2);
	Victor motor4 = new Victor(3);
	
	
	//motor1 = front left, motor2 = back left, motor3 = front right, motor4 = back right
	public void drive(double[] speed,boolean turbo) {
		if (!turbo) {
			speed[0]/=SPEED_FACTOR;
			speed[1]/=SPEED_FACTOR;
		}
		motor1.set(-speed[0]);
		motor2.set(-speed[0]);
		motor3.set(speed[1]);
		motor4.set(speed[1]);
	}
	public void drive(double[] speed) {
		drive(speed,true);
	}
	
	/**
	 * Method for inputting values from input manager for gamepiece. NOTE: We may need to make more of these depending upon the final design.
	 */
	void gameMotor(){
		
	}
}

package org.usfirst.frc.team5401.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.smartdashboard.*;
import org.usfirst.frc.team5401.robot.commands.MotorTurn;
/**
 *
 */
public class DriveBase extends Subsystem {
	
	 VictorSP rightMotor;
	 VictorSP leftMotor;
	 
	 Encoder rightEncoders;
	 Encoder leftEncoders;
	 

	 public DriveBase(){
		 
	rightMotor = new VictorSP(0);
	leftMotor = new VictorSP(1);
	
	rightEncoders = new Encoder( 1, 2, false, Encoder.EncodingType.k1X);
	leftEncoders = new Encoder( 3 , 4, false, Encoder.EncodingType.k1X);
	
	 }
	
	 public void drive(double leftDirection, double rightDirection){
	 leftMotor.set(leftDirection);    	
	 rightMotor.set(-1* rightDirection);
	    	
	    	
	 }
	    public double getVelocity(){
	    	double velocity = (Math.abs(leftEncoders.getRate()) + Math.abs(rightEncoders.getRate()))/2;
	    	//For testing
	    	SmartDashboard.putNumber("Robot Velocity", velocity);
	    	return velocity;
	 }
	 
	    public double getEncoderDistance(){
	    	double leftDistanceRaw = leftEncoders.get();
	    	double rightDistanceRaw = rightEncoders.get();
	    	SmartDashboard.putNumber("Left Enc Raw", leftDistanceRaw);
	    	SmartDashboard.putNumber("Right Enc Raw", rightDistanceRaw);
	    	double leftDistance = leftEncoders.getDistance();
	    	double rightDistance = rightEncoders.getDistance();
	    	SmartDashboard.putNumber("Left Enc Adj", leftDistance);
	    	SmartDashboard.putNumber("Right Enc Adj", rightDistance);
	    	double encoderDistance = (leftDistance + rightDistance)/2;
	    	return encoderDistance;
	    }

	 
	 public void encoderreading(){
		 
		 leftEncoders.getDistance();
		 rightEncoders.getDistance();
	    
		 leftEncoders.getRate();
		 rightEncoders.getRate();
		 
		 SmartDashboard.putNumber("This is the left distance", leftEncoders.getDistance());
		 SmartDashboard.putNumber("This is the right distance", rightEncoders.getDistance());
		 
		 SmartDashboard.putNumber("This is the left rate", leftEncoders.getRate());
		 SmartDashboard.putNumber("This is the right rate", rightEncoders.getRate());
	
	 }

	    public void encoderReset(){
	    	leftEncoders.reset();
	    	rightEncoders.reset();
	    	
	    }
	    
	    public void setDPP(){
	    	leftEncoders.setDistancePerPulse(0);
	    	rightEncoders.setDistancePerPulse(0);
	    	
	    }
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	

        // Set the default command for a subsystem here.
        setDefaultCommand(new MotorTurn());
        
    }
}


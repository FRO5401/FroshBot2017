package org.usfirst.frc.team5401.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5401.robot.Robot;

/**
 *
 */
public class MotorTurn extends Command {
	
    public MotorTurn() {
    	
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveBase);
        
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    	 
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double throttle = Robot.oi.readYAxisLeftJoyStick();
    	double slew = Robot.oi.readXAxisLeftJoyStick();
    	
    	if(slew < -0.6 && slew > -1){
    		Robot.driveBase.drive(-slew, throttle);
    	}
    	if(slew > 0.6 && slew < 1){
    		Robot.driveBase.drive(slew, -throttle);
    	}
        if(throttle < -0.6 && throttle > -1){
        	Robot.driveBase.drive(slew, -throttle);
        	}
        if(throttle > 0.6 && throttle < 1){
        	Robot.driveBase.drive(slew, -throttle);	
        	}
    	else{
    	
    	if(throttle < .6 && throttle > -.6 && slew < .6 && slew > -.6 ){
    		Robot.driveBase.drive(0 , 0);
    		}
    	}
    		
    	}
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

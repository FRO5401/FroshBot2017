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
    	
    	 Robot.driveBase.drive( -1, -1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
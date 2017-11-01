package org.usfirst.frc.team5401.robot.subsystems;

import org.usfirst.frc.team5401.robot.Robot;
import org.usfirst.frc.team5401.robot.RobotMap;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Rollers extends Subsystem {
	
	private VictorSP roller1;
	private VictorSP roller2;
	
	public void Rolling() {
	
	roller1 = new VictorSP(RobotMap.ROLLER1);
	roller2 = new VictorSP(RobotMap.ROLLER2);
	
	}
	
	

   
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


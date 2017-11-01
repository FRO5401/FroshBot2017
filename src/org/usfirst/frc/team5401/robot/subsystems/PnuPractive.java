package org.usfirst.frc.team5401.robot.subsystems;
import edu.wpi.first.wpilibj.AnalogInput;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.VictorSP;
import org.usfirst.frc.team5401.robot.RobotMap;


public void armUpDown(int direction){
	feederArm =  new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.INFEEDER_IN, RobotMap.INFEEDER_OUT);
    	if (direction == 1) {
    		feederArm.set(DoubleSolenoid.Value.kForward);
    		SmartDashboard.putNumber("Feeder Arm", -1); //Feeder Arm is out
    	} else if (direction == -1) {
    		feederArm.set(DoubleSolenoid.Value.kReverse);
    		SmartDashboard.putNumber("Feeder Arm", 1); //Feeder Arm is in
    	}
}
	
package org.usfirst.frc.team5401.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;;



/**
 *
 */
public class Elevator extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	CANTalon _elevatorTalon;
	
	public void Elevator(){
		_elevatorTalon = new CANTalon(0);//<-- 0 may change. The 0 is the location. The location is found on the web Dashboard
		
		_elevatorTalon.changeControlMode(TalonControlMode.Position);
		
		_elevatorTalon.setEncPosition(0);
		SmartDashboard.putNumber("Elevator Position", _elevatorTalon.getEncPosition());
		
		
		//Declare PID variables kP, kI, kD, Izone, rampRate, channel
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


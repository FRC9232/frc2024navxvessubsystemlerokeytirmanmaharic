package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.*;

public class ShooterSubsystem extends SubsystemBase {
    private TalonSRX rightMotor;
    private TalonSRX leftMotor;

    public ShooterSubsystem(){
        rightMotor = new TalonSRX(6);
        leftMotor = new TalonSRX(5);
    
       rightMotor.setSelectedSensorPosition(0);
        leftMotor.setSelectedSensorPosition(0);
        }

    public void setShooter(Boolean open){
        if (open == true){
            rightMotor.setInverted(true);
            leftMotor.setInverted(false);
            rightMotor.set(ControlMode.PercentOutput, -0.95);
            leftMotor.set(ControlMode.PercentOutput, -0.95);
        }
        else{
            rightMotor.set(ControlMode.PercentOutput, 0);
            leftMotor.set(ControlMode.PercentOutput, 0);
        }
    }
    public void amphShoot(){
         rightMotor.setInverted(true);
         leftMotor.setInverted(false);
         rightMotor.set(ControlMode.PercentOutput, -0.17);
         leftMotor.set(ControlMode.PercentOutput, -0.17);
     
    }





}
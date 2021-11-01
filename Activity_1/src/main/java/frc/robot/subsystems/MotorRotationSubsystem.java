package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.RotationConstants;

public class MotorRotationSubsystem extends SubsystemBase {


  TalonSRX topMotor1 = new TalonSRX(RotationConstants.kTopMotor1Port);
  //TalonSRX leftMotor2 = new TalonSRX(DriveConstants.kLeftMotor2Port);
  
  TalonSRX topMotor2 = new TalonSRX(RotationConstants.kTopMotor2Port);

  double speed = 1;
  
  /**
   * Creates a new DriveSubsystem.
   */
  public MotorRotationSubsystem(double Power) {
    topMotor1.set(ControlMode.PercentOutput, Power);
    topMotor2.set(ControlMode.PercentOutput, Power);
  }

}
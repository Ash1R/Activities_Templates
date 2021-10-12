/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.DriveConstants;

public class DriveSubsystem extends SubsystemBase {

  
  // See https://github.com/iron-claw-972/HowToProgramming for how to do this. 
  // Make sure to set the right amount of motors! (if you only have 2 motors don't make 4)


  CANSparkMax sparkMotor = new CANSparkMax(51, MotorType.kBrushless);
  Encoder sparkEncoder = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
  

  TalonSRX leftMotor1 = new TalonSRX(DriveConstants.kLeftMotor1Port);
  TalonSRX leftMotor2 = new TalonSRX(DriveConstants.kLeftMotor2Port);
  
  TalonSRX rightMotor1 = new TalonSRX(DriveConstants.kRightMotor1Port);
  TalonSRX rightMotor2 = new TalonSRX(DriveConstants.kRightMotor2Port);
  


  //how to set up sparkmaxes, if your robot has those
  // CANSparkMax leftMotor1 = new CANSparkMax(DriveConstants.kLeftMotor1Port, MotorType.kBrushless);
  // CANSparkMax leftMotor2 = new CANSparkMax(DriveConstants.kLeftMotor2Port, MotorType.kBrushless);

  // CANSparkMax rightMotor1 = new CANSparkMax(DriveConstants.kRightMotor1Port, MotorType.kBrushless);
  // CANSparkMax rightMotor2 = new CANSparkMax(DriveConstants.kRightMotor2Port, MotorType.kBrushless);
  
  /**
   * Creates a new DriveSubsystem.
   */
  public DriveSubsystem() {
    // however if you have 1 motor per side, then remove these
    leftMotor2.set(ControlMode.Follower, DriveConstants.kLeftMotor1Port);
    rightMotor2.set(ControlMode.Follower, DriveConstants.kRightMotor1Port);

    //how to follow motors with sparkmaxes
    // leftMotor2.follow(leftMotor1);
    // rightMotor2.follow(rightMotor1);

    //leftMotor1.setInverted(true);
  }

  /**
   * Drives the robot using tank drive controls
   * Tank drive is slightly easier to code but less intuitive to control, so this is here as an example for now
   * @param leftPower the commanded power to the left motors
   * @param rightPower the commanded power to the right motors
   */

  public void tankDrive(double leftPower, double rightPower) {
    leftMotor1.set(ControlMode.PercentOutput, leftPower);
    rightMotor1.set(ControlMode.PercentOutput, rightPower);

    //if using a sparkmax
    // leftMotor1.set(leftPower);
    // rightMotor1.set(rightPower);
  }

  /**
   * Drives the robot using arcade controls.
   *
   * @param forward the commanded forward movement
   * @param turn the commanded turn rotation
   */
  public void arcadeDrive(double throttle, double turn) {
    leftMotor1.set(ControlMode.PercentOutput, throttle + turn);
    rightMotor1.set(ControlMode.PercentOutput, throttle - turn);
  }


  public void wheelOfFortune(double kP, double kI, double kD){
    PIDController pid = new PIDController(kP, kI, kD);
    sparkMotor.set(pid.calculate(sparkEncoder.getDistance(), 180));
  }
  
}
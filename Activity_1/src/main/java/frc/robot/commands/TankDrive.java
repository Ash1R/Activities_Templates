/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.Constants.DriveConstants;

public class TankDrive extends CommandBase {
  private final DriveSubsystem m_drive;

  /**
   * Creates a new TankDrive.
   *
   * @param subsystem The drive subsystem this command wil run on.
   */
  public TankDrive(DriveSubsystem subsystem) {
    m_drive = subsystem;
    addRequirements(m_drive);
  }

  @Override
  public void execute() {
    m_drive.tankDrive(
      RobotContainer.getMotorSpeed(DriveConstants.kLeftJoyAxis), 
      RobotContainer.getMotorSpeed(DriveConstants.kRightJoyAxis));
    }
  
}
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.RobotContainer;
import frc.robot.Constants.DriveConstants;

public class ArcadeDrive extends CommandBase {
  private final DriveSubsystem m_drive;

  /**
   * Creates a new ArcadeDrive.
   *
   * @param subsystem The drive subsystem this command wil run on.
   */
  public ArcadeDrive(DriveSubsystem subsystem) {
    m_drive = subsystem;
    addRequirements(m_drive);
  }

  @Override
  public void execute() {
    m_drive.arcadeDrive(
      RobotContainer.getMotorSpeed(DriveConstants.kRightJoyAxis), 
      RobotContainer.getMotorSpeed(DriveConstants.kLeftJoyAxis));
  }
}
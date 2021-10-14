/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class DriveConstants {
    
    public static final int kLeftMotor1Port = 3;
    public static final int kLeftMotor2Port = 4;
    public static final int kRightMotor1Port = 7;
    public static final int kRightMotor2Port = 8;

    
    public static final int kControllerPort = 0;

    
    public static final int kLeftJoyAxis = 1;
    public static final int kRightJoyAxis = 5;

    public static final double kP = 0.1;
    public static final double kI = 0;
    public static final double kD = 0;

  }

  public static final class JoystickConstants{
    public static final int kA = 0;
    public static final int KB = 1;
    public static final int kY = 2;

  }

  public static final class RotationConstants{
    public static final int kTopMotor1Port = 6;
    public static final int kTopMotor2Port = 5;
  }

}
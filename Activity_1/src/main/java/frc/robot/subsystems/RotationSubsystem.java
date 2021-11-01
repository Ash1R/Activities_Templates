package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.DriveConstants;

public class RotationSubsystem extends SubsystemBase {
    TalonSRX topMotor1 = new TalonSRX(DriveConstants.kTopMotor1Port);
    TalonSRX topMotor2 = new TalonSRX(DriveConstants.kTopMotor2Port);


    public RotationSubsystem() {
        topMotor2.set(ControlMode.Follower, DriveConstants.kTopMotor1Port);
    }

    public void powerSet(double topPower) {
        topMotor1.set(ControlMode.PercentOutput, topPower);
    }
}
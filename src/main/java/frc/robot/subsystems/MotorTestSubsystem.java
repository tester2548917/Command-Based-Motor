// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.MotorTestConstants;

public class MotorTestSubsystem extends SubsystemBase {
  private final SparkMax motor = 
    new SparkMax(MotorTestConstants.kMotorCanId, SparkLowLevel.MotorType.kBrushless);
  public MotorTestSubsystem() {

  }

  public void setSpeed(double speed) {
    // speed between -1 n 1
    motor.set(speed);
  }

  public void stop() {
    motor.set(0);
  }
}

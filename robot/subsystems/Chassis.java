// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Chassis extends SubsystemBase {
  /** Creates a new Chassis. */
private WPI_VictorSPX _backLeft = new WPI_VictorSPX(16);
private WPI_VictorSPX _frontLeft = new WPI_VictorSPX(17);
private WPI_VictorSPX _backRight = new WPI_VictorSPX(19);
private WPI_VictorSPX _frontRight = new WPI_VictorSPX(18);

private DifferentialDrive _drive = new DifferentialDrive(_frontRight,_frontLeft);



  public Chassis() 
  {
    _backLeft.follow(_frontLeft);
    _backRight.follow(_frontRight);
    _frontLeft.setInverted(true);
    _frontRight.setInverted(true);
    _backLeft.setInverted(true);
    _backRight.setInverted(true);

    

  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Front Left Speed", _frontLeft.get());
    SmartDashboard.putNumber("Front Right Speed", _frontRight.get());
    SmartDashboard.putNumber("Back Left Speed", _backLeft.get());
    SmartDashboard.putNumber("Back Right Speed", _backRight.get());

    _drive.feed();

  }
  public void teleoPeriodic() {
  
  }

  public void Drive(double turn, double direction)
  {
    _drive.arcadeDrive(turn*0.75, direction*0.75);
  }
  public void TeleOpDrive(Joystick controller)
  {
    double axis0 = controller.getRawAxis(0);
    double axis5 = controller.getRawAxis(5);
    SmartDashboard.putNumber("axis 0", axis0);
    SmartDashboard.putNumber("axis 5", axis5);
    Drive(-axis0, axis5);
  }

  public void autoDrive()
  {
    _drive.arcadeDrive(0.2, 0);
    _drive.feed();
  }
}
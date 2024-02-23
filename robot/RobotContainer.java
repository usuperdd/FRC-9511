// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import edu.wpi.first.wpilibj2.command.button.CommandPS4Controller;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.subsystems.*;
import frc.robot.commands.*;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Chassis _chassis = new Chassis();
  private final Joystick _controller = new Joystick(0);
  //private final Joystick _controller1 = new Joystick(1);
  private final Shooter _CumShooter = new Shooter();
  private final JoystickButton _Shoot = new JoystickButton(_controller, 1);
  
 
  
  //private final Joystick _joyStick = new Joystick(1);
  //private final VerticalElevator _vertical = new VerticalElevator();
  //private final Grabber _grabber = new Grabber();
  //private final GrabberWheels _wheels = new GrabberWheels();
  // private final GrabberArm _grabberArm = new GrabberArm();
  //private final HorizontalElevator _horizontal = new HorizontalElevator();
  //private final JoystickButton _upButton = new JoystickButton(_joyStick, 5);
  //private final JoystickButton _downButton = new JoystickButton(_joyStick, 3);
  // private final JoystickButton _inButton = new JoystickButton(_joyStick, 4);
  // private final JoystickButton _outButton = new JoystickButton(_joyStick, 6);
  //private final JoystickButton _grabberButton = new JoystickButton(_joyStick, 1);
  //private final JoystickButton _wheelButton = new JoystickButton(_joyStick, 2);
  // private final JoystickButton _pushButton = new JoystickButton(_joyStick, 4);
  // private final JoystickButton _pullButton = new JoystickButton(_joyStick, 6);
  //private final AxisDirection _joyAxis = new Axis();   
  
  // Replace with CommandPS4Controller or CommandJoystick if needed
  // private final CommandXboxController m_driverController = new CommandXboxController(OperatorConstants.kDriverControllerPort);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    _chassis.setDefaultCommand(new ArcadeDrive(_chassis, _controller));
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
   // _vertical.setDefaultCommand(new VerticalCommand(_vertical, 0.02));
   //  _upButton.whileTrue(new VerticalCommand(_vertical, 0.25));
    // _downButton.whileTrue(new VerticalCommand(_vertical, -0.15));

   // _horizontal.setDefaultCommand(new HorizontalDefaultCommand(_horizontal, _joyStick)); 

    // _horizontal.setDefaultCommand(new RunCommand(() -> _horizontal.HorizontalMove(0),_horizontal));
    // _outButton.whileTrue(new RunCommand(() -> _horizontal.HorizontalMove(0.25), _horizontal));
    // _inButton.whileTrue(new RunCommand(() -> _horizontal.HorizontalMove(-0.25), _horizontal));
    // _horizontal.setDefaultCommand(new RunCommand(() -> _horizontal.HorizontalMove((_joyStick.getY())*0.5)));    

    // _grabber.setDefaultCommand(new RunCommand(() -> _grabber.grabber(-0.15), _grabber));
    // _grabberButton.whileTrue(new RunCommand(() -> _grabber.grabber(0.5), _grabber));

   // _grabber.setDefaultCommand(new GrabberCommand(_grabber, 0));
   // _wheelButton.whileTrue(new GrabberCommand(_grabber, -0.25));       
   // _grabberButton.whileTrue(new GrabberCommand(_grabber, 0.3));

    // _wheels.setDefaultCommand(new RunCommand(() -> _wheels.rolling(0.15), _wheels));
    // _wheelButton.whileTrue(new RunCommand(() -> _wheels.rolling(0.5), _wheels));

    //_wheels.setDefaultCommand(new GrabberWheelsCommand(_wheels, 0.15));
    // _wheelButton.whileTrue(new GrabberWheelsCommand(_wheels, 0.5));

    // _grabberArm.setDefaultCommand(new RunCommand(() -> _grabberArm.rotate(-0.02), _grabberArm));
    // _pushButton.whileTrue(new RunCommand(() -> _grabberArm.rotate(0.35), _grabberArm));
    // _pullButton.whileTrue(new RunCommand(() -> _grabberArm.rotate(-0.5), _grabberArm));    
    //_Shoot.setDefaultCommand(new ShooterCommand(_CumShooter, 0));
    _Shoot.whileTrue(new ShooterCommand(_CumShooter,0.5));

  }
}


    //public Command getAutonomusCommand(){
      //return new AutoDrive(_chassis);
    //}
  
  
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
 

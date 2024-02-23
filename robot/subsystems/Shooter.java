package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  private CANSparkMax leftWheel = new CANSparkMax(1, MotorType.kBrushless);
  private CANSparkMax rightWheel = new CANSparkMax(14, MotorType.kBrushless);
  /** Creates a new Elevator. */
  public Shooter() 
  {
    leftWheel.restoreFactoryDefaults();
    rightWheel.restoreFactoryDefaults();

    leftWheel.setSmartCurrentLimit(20);
    rightWheel.setSmartCurrentLimit(20);

    rightWheel.burnFlash();
    leftWheel.burnFlash();
  }
  public void Shooting(double speed)
  {
    rightWheel.set(speed);
    leftWheel.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
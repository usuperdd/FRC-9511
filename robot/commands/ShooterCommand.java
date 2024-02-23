package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.Shooter;

public class ShooterCommand extends CommandBase
{
    Shooter grabberWheels;
    double power;
   public ShooterCommand(Shooter wheels, double speed)
   {
        this.grabberWheels = wheels;
        power = speed;
        addRequirements(grabberWheels);
   } 
   @Override
   public void execute()
   {
        grabberWheels.Shooting(power);
   }
}
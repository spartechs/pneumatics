package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PneumaticSub;

public class PitchUp extends CommandBase{
    
    private final PneumaticSub pneumatic;

  /**
   * Creates a new PitchUp.
   *
   * @param subsystem The subsystem used by this command.
   */
  public PitchUp(PneumaticSub subsystem) {
    pneumatic = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(pneumatic);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    pneumatic.pitchUp();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

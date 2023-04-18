package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class PneumaticSub extends SubsystemBase{
    private DoubleSolenoid pitchSolenoid;

    public PneumaticSub(){
        pitchSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.forwardControl, Constants.reverseControl);
    }

    public void pitchUp(){
        pitchSolenoid.set(Value.kForward);
    }

    public void pitchDown(){
        pitchSolenoid.set(Value.kReverse);
    }
}
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsBase;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import java.lang.reflect.Field;

public class PneumaticSub extends SubsystemBase{
    private final DoubleSolenoid pitchSolenoid;

    public PneumaticSub(){
        pitchSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.forwardChannel, Constants.reverseChannel);
        pitchSolenoid.set(Value.kOff);
    }

    public void pitchUp(){
        pitchSolenoid.set(Value.kForward);
    }

    public void pitchDown(){
        pitchSolenoid.set(Value.kReverse);
    }

    public void pitchOff(){
        pitchSolenoid.set(Value.kOff);
    }


    public void e() {

        final Class<? extends DoubleSolenoid> solenoidClass = pitchSolenoid.getClass();

        // Get base
        Field baseField;
        try {
            baseField = solenoidClass.getField("m_module");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        baseField.setAccessible(true);

        PneumaticsBase base;
        try {
            base = (PneumaticsBase) baseField.get(solenoidClass);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        // Get mask
        Field maskField;
        baseField = solenoidClass.getField("")

        base.setSolenoids();
    }

}


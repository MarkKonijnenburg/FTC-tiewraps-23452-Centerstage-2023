package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class PlaneShooter {
    private Servo shooter;

    public PlaneShooter(HardwareMap hardwareMap){
        shooter = hardwareMap.get(Servo.class, "shooter");
    }

    public void Shoot() {shooter.setPosition(-1);
    }
}

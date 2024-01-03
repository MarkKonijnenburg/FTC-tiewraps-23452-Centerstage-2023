package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;


/**
 * This file is an example of how a subsystem can be defined.
 * Actual subsystems could for example be an intake, or a drivetrain.
 *
 * In a subsystem file, the different parameters and functions are defined.
 */
public class Gripper {

    //Declare motor and servo objects
    private Servo servoIntake;

    //Define positions and other variables of the subsystem
    private double open = 1;
    private double close = 0.87;


    public Gripper(HardwareMap hardwareMap) {
        servoIntake = hardwareMap.get(Servo.class, "Intake");

    }


    public void OPEN() {
        servoIntake.setPosition(open);
    }

    /**
     * Example of a function which moves a servo to a certain position
     */
    public void CLOSED() {
        servoIntake.setPosition(close);
    }
}
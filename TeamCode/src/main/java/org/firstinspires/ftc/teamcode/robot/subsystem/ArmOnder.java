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
public class ArmOnder {

    //Declare motor and servo objects
    private DcMotor motorRight;
    private DcMotor motorLeft;

    public ArmOnder(HardwareMap hardwareMap){

        motorLeft = hardwareMap.get(DcMotor.class, "ArmLeft");
        motorRight = hardwareMap.get(DcMotor.class, "ArmRight");


        motorLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        motorLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void DISABLED(){;
        motorLeft.setPower(0);
        motorRight.setPower(0);
    }

    public void FORWARD(){
        motorLeft.setPower(0.75);
        motorRight.setPower(0.75);
    }

    public void BACKWARDS(){
        motorLeft.setPower(-0.75);
        motorRight.setPower(-0.75);
    }
}

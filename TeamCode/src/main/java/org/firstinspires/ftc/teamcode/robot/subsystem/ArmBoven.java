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
public class ArmBoven {

    //Declare motor and servo objects
    private DcMotor motorArmBoven;
    private int degreeDriving;
    private int degreePickup;
    private int degreePlacement;

    public ArmBoven(HardwareMap hardwareMap) {
        motorArmBoven = hardwareMap.get(DcMotor.class, "ArmCenter");
        motorArmBoven.setDirection(DcMotorSimple.Direction.REVERSE);
        motorArmBoven.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorArmBoven.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorArmBoven.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        degreeDriving = 100;
        degreePickup = 50;
        degreePlacement = 200;
    }


    public void DRIVING(){
        motorArmBoven.setTargetPosition(degreeDriving);
        motorArmBoven.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorArmBoven.setPower(0.75);
    }
    public void PLACEMENT(){
        motorArmBoven.setTargetPosition(degreePlacement);
        motorArmBoven.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorArmBoven.setPower(0.75);
    }
    public void PICKUP(){
        motorArmBoven.setTargetPosition(degreePickup);
        motorArmBoven.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorArmBoven.setPower(0.75);
    }

    public void DISABLED(){
        motorArmBoven.setPower(0);
    }

}


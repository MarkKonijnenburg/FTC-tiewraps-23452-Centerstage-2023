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
    private  DcMotor motorArmBoven;

    public ArmBoven(HardwareMap hardwareMap){
        motorArmBoven = hardwareMap.get(DcMotor.class, "ArmCenter");
        motorArmBoven.setDirection(DcMotorSimple.Direction.REVERSE);
        motorArmBoven.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }




    public void FORWARD(){
        motorArmBoven.setPower(0.75);
    }
    public void BACKWARDS(){
        motorArmBoven.setPower(-0.75);
    }

}

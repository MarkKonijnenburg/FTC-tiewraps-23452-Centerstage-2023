//package org.firstinspires.ftc.teamcode.robot.subsystem;
//
//import static java.lang.Math.round;
//
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorSimple;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//import com.qualcomm.robotcore.hardware.Servo;
//
//
//
///**
// * This file is an example of how a subsystem can be defined.
// * Actual subsystems could for example be an intake, or a drivetrain.
// *
// * In a subsystem file, the different parameters and functions are defined.
// */
//public class ArmOnder {
//
//    //Declare motor and servo objects
//    private DcMotor motorRight;
//    private DcMotor motorLeft;
//    private int degreeDriving;
//    private int degreePickup;
//    private int degreePlacement;
//
//
//
//    public ArmOnder(HardwareMap hardwareMap){
//
//        motorLeft = hardwareMap.get(DcMotor.class, "ArmLeft");
//        motorRight = hardwareMap.get(DcMotor.class, "ArmRight");
//
//
//        motorLeft.setDirection(DcMotorSimple.Direction.REVERSE);
//        motorLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        motorLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        motorLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//
//        motorRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//        motorRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        motorRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//
//
//
//        degreeDriving = 30;
//        degreePickup = 0;
//        degreePlacement = 400;
//
//    }
//    public void DISABLED(){;
//        motorLeft.setPower(0);
//        motorRight.setPower(0);
//    }
//    public  void up(){
//        motorRight.setPower(0.5);
//        motorLeft.setPower(0.5);
//    }
//    public  void down(){
//        motorRight.setPower(-0.5);
//        motorLeft.setPower(-0.5);
//    }
//
//    public void DRIVING(){
//        motorRight.setTargetPosition(degreeDriving);
//        motorLeft.setTargetPosition(degreeDriving);
//        motorRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        motorLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        motorLeft.setPower(1);
//        motorRight.setPower(1);
//
//    }
//
//    public void PICKUP(){
//        motorRight.setTargetPosition(degreePickup);
//        motorLeft.setTargetPosition(degreePickup);
//        motorRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        motorLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        motorLeft.setPower(-1);
//        motorRight.setPower(-1);
//    }
//    public void PLACEMENT(){
//        motorRight.setTargetPosition(degreePlacement);
//        motorLeft.setTargetPosition(degreePlacement);
//        motorRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        motorLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        motorLeft.setPower(-1);
//        motorRight.setPower(-1);
//    }
//    public int getDegreeDriving() {
//        return degreeDriving;
//    }
//
//    public void setDegreeDriving(int degreeDriving) {
//        this.degreeDriving = degreeDriving;
//    }
//
//    public int getDegreePickup() {
//        return degreePickup;
//    }
//
//    public void setDegreePickup(int degreePickup) {
//        this.degreePickup = degreePickup;
//    }
//
//    public int getDegreePlacement() {
//        return degreePlacement;
//    }
//
//    public void setDegreePlacement(int degreePlacement) {
//        this.degreePlacement = degreePlacement;
//    }
//}

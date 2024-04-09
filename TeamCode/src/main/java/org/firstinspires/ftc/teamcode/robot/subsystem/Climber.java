//package org.firstinspires.ftc.teamcode.robot.subsystem;
//
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//
//public class Climber {
//
//    private DcMotor climberMotor;
//
//    public Climber(HardwareMap HardwareMap) {
//        climberMotor = HardwareMap.get(DcMotor.class, "climber");
//        climberMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//    }
//
//    public void climbing(){
//        climberMotor.setPower(0.8);
//    }
//    public void down(){
//        climberMotor.setPower(-0.8);
//    }
//
//    public void disabled(){
//        climberMotor.setPower(0);
//    }
//
//}

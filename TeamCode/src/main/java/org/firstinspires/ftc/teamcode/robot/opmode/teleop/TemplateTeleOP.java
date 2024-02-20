package org.firstinspires.ftc.teamcode.robot.opmode.teleop;


import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.lib.geometry.Rotation2d;
import org.firstinspires.ftc.teamcode.lib.kinematics.ChassisSpeeds;
import org.firstinspires.ftc.teamcode.robot.subsystem.ArmOnder;
import org.firstinspires.ftc.teamcode.robot.subsystem.ArmBoven;
import org.firstinspires.ftc.teamcode.robot.subsystem.Climber;
import org.firstinspires.ftc.teamcode.robot.subsystem.ExampleMecanumDrivetrain;
//import org.firstinspires.ftc.teamcode.robot.subsystem.ExampleSubsystem;
import org.firstinspires.ftc.teamcode.robot.subsystem.Gripper;
import org.firstinspires.ftc.teamcode.robot.subsystem.Pixelschuiver;
import org.firstinspires.ftc.teamcode.robot.subsystem.PlaneShooter;


/*
* After the @TeleOp, the name of the TeleOP is defined which is displayed on the Driver Station
* The group can be filled in to group different Opmodes on the phone
* The // before @Disabled can be removed to hide the Opmode on the Driver Station
 */
@TeleOp(name="DEZE_CODE_IS_DE_GOEDE!", group="Iterative Opmode")
//@Disabled
public class TemplateTeleOP extends OpMode
{
    // Declare timer to keep track of how long the program has been running
    private final ElapsedTime runtime = new ElapsedTime();

    /*
    * Declare subsystems
    * This means that we will say that certain subsystems exist and give them a name,
    * but not yet create them, this will happen in the init() function.
     */
//    private ExampleSubsystem exampleSubsystem;
    private ExampleMecanumDrivetrain exampleMecanumDrivetrain;
//    private ArmBoven armBoven;
 //   private ArmOnder armOnder;
  //  private Gripper gripper;
    private Climber climberMotor;
    private PlaneShooter planeShooter;
    private Pixelschuiver pixelschuiver;
    @Override
    public void init() {
        // Telemetry.addData is used to display variables and text on the Driver Station
        telemetry.addData("Status", "Initializing");

        /*
         * Create all the subsystems
         * Go to the folder 'subsystems' to view the subsystems, which contain more information
         */
//        exampleSubsystem = new ExampleSubsystem(hardwareMap);
        exampleMecanumDrivetrain = new ExampleMecanumDrivetrain(hardwareMap);
    //    gripper = new Gripper(hardwareMap);
//        armOnder = new ArmOnder(hardwareMap);
//        armBoven = new ArmBoven(hardwareMap);
        climberMotor = new Climber(hardwareMap);
        planeShooter = new PlaneShooter(hardwareMap);
        pixelschuiver = new Pixelschuiver(hardwareMap);
        // Tell the driver that initialization is complete via the Driver Station
        telemetry.addData("Status", "Initializing done");
    }

    /**
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
    }

    /**
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {
        // Restart the timer
        runtime.reset();

    }

    /**
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {
//        /*
//         * Execute the functions of the example subsystem based on controller input
//         */
//        if (gamepad2.y){
//            armOnder.DRIVING();
//            armBoven.DRIVING();
//            telemetry.addData("degreeSetpoint", armOnder.getDegreeDriving());
//        } if(gamepad2.x){
//            armOnder.PLACEMENT();
//            armBoven.PLACEBACK();
//            telemetry.addData("degreeSetpoint", armOnder.getDegreePlacement());
//        }  if(gamepad2.b){
//            armOnder.PICKUP();
//            armBoven.PICKUP();
//            telemetry.addData("degreeSetpoint", armOnder.getDegreePickup());
//        }  if (gamepad2.a){
//           armOnder.PICKUP();
//           armBoven.PLACEFRONT();
//        }


//        if (gamepad2.right_bumper){
//            gripper.CLOSED();
//        }  else if(gamepad2.left_bumper) {
//            gripper.OPEN();
//        }

        if (gamepad2.right_trigger > 0.1){
            climberMotor.climbing();
        } else if (gamepad2.left_trigger > 0.1) {
            climberMotor.down();
        } else {
            climberMotor.disabled();
        }

        if (gamepad2.y) {
            planeShooter.Shoot();
        }

        if (gamepad2.dpad_up) {
            pixelschuiver.flipUp();
        } else if (gamepad2.dpad_down) {
          pixelschuiver.flipDown();
        }
//        if (gamepad1.right_bumper) {
//            armOnder.up();
//        } else if (gamepad1.left_bumper) {
//            armOnder.down();
//        }
//        else {
//            armOnder.DISABLED();
//        }



        /*
         * Several examples to control different drivetrains will be discussed below
         * Remember that you only need to use one way to control your drivetrain,
         * so you don't have to leave all examples in this file, you can delete the parts below
         * that you don't want to use
         */

        //Control the drivetrain using the two joysticks of the 1st controller
        //The ChassisSpeeds object will be used to store the desired speeds of the robot
//        double forwardSpeed = -gamepad1.left_stick_y;
//        double sidewaysSpeed = gamepad1.left_stick_x;  //Pushing the stick forward gives negative values, so the Y value should be inverted
//        double rotationalSpeed = gamepad1.right_stick_x;
//        ChassisSpeeds chassisSpeeds = new ChassisSpeeds(forwardSpeed, sidewaysSpeed, rotationalSpeed);

        //The chassisSpeeds can be used as input for the mecanumDrive function to control the drivetrain
        double y = -gamepad1.left_stick_y; // Remember, Y stick is reversed!
        double x = gamepad1.left_stick_x;
        double rx = gamepad1.right_stick_x;
        exampleMecanumDrivetrain.mecanumDrive(x,y,rx);

        //In the code above, the robot will drive forward if the stick is pushed forward,
        //but the robot can also be controlled relative to the field.
        //In that case, the robot will always move away from the driver if the joystick is pushed up,
        //no matter the orientation of the robot
        //To do this, the rotation of the robot must be known, luckily the Control Hub has a sensor
        //which can measure the angle of the robot, called the IMU
        //How exactly to read out the IMU can be found in the UTIL folder
        //How to use the Rotation2d object is also shown there
        //For now we will just take a random value (10 in this case)
//        Rotation2d exampleRobotAngle = Rotation2d.fromDegrees(10);
//
//        double xSpeed = gamepad1.left_stick_x;
//        double ySpeed = -gamepad1.left_stick_y; //Pushing the stick forward gives negative values, so the Y value should be inverted
//        double rotationalSpeed1 = gamepad1.right_stick_x;
//
//        ChassisSpeeds chassisSpeedsFromFieldRelative = ChassisSpeeds.fromFieldRelativeSpeeds(xSpeed, ySpeed, rotationalSpeed1, exampleRobotAngle);
//
//        //The ChassisSpeeds can now be used in the same way as before
//        exampleMecanumDrivetrain.mecanumDrive(chassisSpeedsFromFieldRelative);


        // Show the elapsed game time and wheel power.
        telemetry.addData("Status", "Run Time: " + runtime.toString());
    }

    /**
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
    }
}

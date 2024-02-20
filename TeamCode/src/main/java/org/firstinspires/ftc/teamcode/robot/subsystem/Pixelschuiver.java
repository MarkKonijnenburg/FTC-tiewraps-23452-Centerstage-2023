package org.firstinspires.ftc.teamcode.robot.subsystem;//package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;


/**
 * This file is an example of how a subsystem can be defined.
 * Actual subsystems could for example be an intake, or a drivetrain.
 *
 * In a subsystem file, the different parameters and functions are defined.
 */
public class Pixelschuiver {
    //Declare motor and servo objecects;
    private Servo servoLeft;
    private Servo servoRight;
    //Define positions and other variables of the subsystem
    private double downPosition = 0.1;
    private double upPosition = 0.5;

    /**
     * This is the constructor of the subsystem
     * This is the function that will be run when the subsystem is created,
     * which happens at the beginning of an OpMode.
     * The constructor should have the same name as the class (ExampleSubsystem in this case).
     *
     * @param hardwareMap This is the input of the constructor, which will be used
     *                    to link the motors and servos in the code to the motors and servos
     *                    on the actual robot
     */
    public Pixelschuiver(HardwareMap hardwareMap){
        /*
        * This lines of code links the DcMotor 'myMotor' to the port on the control/expansion hub
        * labeled "motor1"
        * This 'labeling' can be done on the Driver Station by clicking on the three dots
        * in the upper right corner and then going to 'Configure Robot'
         */

        /*
        * Normally a DC motors runs in the clockwise direction for positive values
        * If positive values need to correspond to counter clockwise rotation,
        * for example for a drivetrain, the motor can be reversed
         */

        /*
         * Tell the motors to use the integrated encoders
         * This gives a bit more precision while controlling the motors
         */

        // Servos can also be extracted from the hardwareMap similar to DC motors
        servoLeft = hardwareMap.get(Servo.class, "servoLeft");
        servoRight = hardwareMap.get(Servo.class, "servoRight");
        servoLeft.setDirection(Servo.Direction.REVERSE);
    }

    /*
    * After the constructor the functions of the subsystem can be defined.
    * For this example subsystems the functions are:
    * flipDown,
    * flipUp,
    * setMotorSpeed
     */


    /**
     * Example of a function which moves a servo to a certain position
     */
    public void flipDown(){
        servoRight.setPosition(downPosition);
        servoLeft.setPosition(downPosition);
    }

    /**
     * Example of a function which moves a servo to a certain position
     */
    public void flipUp(){
        servoRight.setPosition(upPosition);
        servoLeft.setPosition(upPosition);
    }

    /**
     * Example of a function to set a motor to a certain speed
     *
     * @param speed Desired speed of the motor
     *              -1 corresponds to full power backwards
     *              1 corresponds to full power forwards
     */

}

/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.firstinspires.ftc.teamcode.robot.opmode.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.robot.subsystem.ExampleMecanumDrivetrain;


/**
 * This file is a template for an "OpMode".
 * An OpMode is a 'program' that runs in either the autonomous or the teleop period of an FTC match.
 * The names of OpModes appear on the menu of the FTC Driver Station.
 * When a selection is made from the menu, the corresponding OpMode
 * is put on the Robot Controller and executed.
 *
 * This particular OpMode contains a template to structure your code with subsystems.
 *
 */

/*
 * After the @Autonomous, the name of the Autonomous is defined which is displayed on the Driver Station
 * The group can be filled in to group different Opmodes on the phone
 * The // before @Disabled can be removed to hide the Opmode on the Driver Station
 */

@Autonomous(name="AutonoomBlueFront", group="Linear OpMode")
@Disabled
public class AutonomousBlueFront extends LinearOpMode {

    // Declare timer to keep track of how long the program has been running
    private final ElapsedTime runtime = new ElapsedTime();

    /*
     * Declare subsystems
     * This means that we will say that certain subsystems exist and give them a name,
     * but not yet create them, this will happen in the init() function.
     */
    private ExampleMecanumDrivetrain exampleMecanumDrivetrain;

    @Override
    public void runOpMode() {
        /*
         * This code is run after the driver presses INIT, but before the actual start of the match
         */

        // Telemetry.addData is used to display variables and text on the Driver Station
        telemetry.addData("Status", "Initializing");

        /*
         * Create all the subsystems
         * Go to the folder 'subsystems' to view the subsystems, which contain more information
         */
        exampleMecanumDrivetrain = new ExampleMecanumDrivetrain(hardwareMap);

        // Tell the driver that initialization is complete via the Driver Station
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        /*
         * Wait for the game to start (driver presses PLAY)
         */
        waitForStart();
        runtime.reset();

        /*
         * Now it is time for the main autonomous code to run once during the match
         */

        //Set all the motors of the exampleMecanumDrivetrain subsystem to half speed
        exampleMecanumDrivetrain.setLeftBackSpeed(0.5);
        exampleMecanumDrivetrain.setRightFrontSpeed(0.5);
        exampleMecanumDrivetrain.setLeftFrontSpeed(0.5);
        exampleMecanumDrivetrain.setRightBackSpeed(0.5);

        //wait for 2600 milliseconds
        sleep(2600);

        //stop all motors
        exampleMecanumDrivetrain.stop();

        //wait for 2000 milliseconds
        sleep(2000);

        //set all the left motors of the exampleMecanumDrivetrain subsystem to go forward and the right ones to go backward
        exampleMecanumDrivetrain.setLeftBackSpeed(1);
        exampleMecanumDrivetrain.setRightFrontSpeed(-1);
        exampleMecanumDrivetrain.setLeftFrontSpeed(1);
        exampleMecanumDrivetrain.setRightBackSpeed(-1);

        //wait for 1800 milliseconds
        //the robot turns 90 degrees to the right
        sleep(1800);

        //stop all motors
        exampleMecanumDrivetrain.stop();

        //wait for 2000 milliseconds
        sleep(2000);

        //all the motors of the exampleMecanumDrivetrain subsystem go backwards
        exampleMecanumDrivetrain.setLeftBackSpeed(-0.5);
        exampleMecanumDrivetrain.setRightFrontSpeed(-0.5);
        exampleMecanumDrivetrain.setLeftFrontSpeed(-0.5);
        exampleMecanumDrivetrain.setRightBackSpeed(-0.5);

        //wait for 8500 milliseconds
        sleep(8500);

        //stop all motors
        exampleMecanumDrivetrain.stop();
    }
}

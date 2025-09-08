package org.firstinspires.ftc.teamcode.everglow_library;

import com.acmerobotics.roadrunner.PoseVelocity2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.MecanumDrive;

public abstract class RobotBase {
    public MecanumDrive drive;

    public abstract void update(int iterationCount);

    // moves the robot in accordance with
    public void calculateDrivePowers(Gamepad gamepad) {
        drive.setDrivePowers(new PoseVelocity2d(
                new Vector2d(
                        Math.abs(Math.pow((-gamepad.left_stick_y)*(1.0/Math.pow(4.5, gamepad.right_trigger)), 2)),
                        -gamepad.left_stick_x*(1.0/Math.pow(4, gamepad.right_trigger))
                ),
                -gamepad.right_stick_x*(1.0/Math.pow(5, gamepad.right_trigger))
        ));
        drive.updatePoseEstimate();
    }
}

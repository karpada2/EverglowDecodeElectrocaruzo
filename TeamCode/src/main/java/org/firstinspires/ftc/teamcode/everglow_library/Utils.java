package org.firstinspires.ftc.teamcode.everglow_library;

import com.acmerobotics.roadrunner.Vector2d;

public class Utils {
    public static Vector2d rotateByAngle(Vector2d vector, double angle) {
        double newX = vector.x*Math.cos(angle) - vector.y*Math.sin(angle);
        double newY = vector.x*Math.sin(angle) + vector.y*Math.cos(angle);

        return new Vector2d(newX, newY);
    }
}

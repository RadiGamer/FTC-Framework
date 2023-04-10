package org.firstinspires.ftc.teamcode.Movement;

import org.firstinspires.ftc.teamcode.MainClasses.RobotHardware;

public class Movement {
    private MecanumDrive mecanumDrive;

    public Movement(RobotHardware robot) {
        mecanumDrive = new MecanumDrive(robot);
    }

    public void forward(double speed) {
        mecanumDrive.drive(speed, 0, 0);
    }

    public void backward(double speed) {
        mecanumDrive.drive(-speed, 0, 0);
    }

    public void strafeLeft(double speed) {
        mecanumDrive.drive(0, -speed, 0);
    }

    public void strafeRight(double speed) {
        mecanumDrive.drive(0, speed, 0);
    }

    public void turnLeft(double speed) {
        mecanumDrive.drive(0, 0, -speed);
    }

    public void turnRight(double speed) {
        mecanumDrive.drive(0, 0, speed);
    }

    public void stop() {
        mecanumDrive.drive(0, 0, 0);
    }
}
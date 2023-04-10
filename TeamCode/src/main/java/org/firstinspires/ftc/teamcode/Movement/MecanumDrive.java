package org.firstinspires.ftc.teamcode.Movement;

import org.firstinspires.ftc.teamcode.MainClasses.RobotHardware;

public class MecanumDrive {
    private RobotHardware robot;

    public MecanumDrive(RobotHardware robot) {
        this.robot = robot;
    }

    public void drive(double forward, double strafe, double turn) {
        // Fórmula para el movimiento de ruedas Mecanum
        double frontLeftPower = forward + strafe + turn;
        double frontRightPower = forward - strafe - turn;
        double backLeftPower = forward - strafe + turn;
        double backRightPower = forward + strafe - turn;

        // Establecer la potencia de los motores
        robot.motorFrontLeft.setPower(frontLeftPower);
        robot.motorFrontRight.setPower(frontRightPower);
        robot.motorBackLeft.setPower(backLeftPower);
        robot.motorBackRight.setPower(backRightPower);
    }
}

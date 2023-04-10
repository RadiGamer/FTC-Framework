package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.MainClasses.RobotOpMode;
import org.firstinspires.ftc.teamcode.Movement.MecanumDrive;

@TeleOp(name = "MyMecanumTeleOp", group = "FTC")
public class TeleOpMode extends RobotOpMode {

    private MecanumDrive mecanumDrive;

    @Override
    protected void initRobot() {
        super.initRobot();
        mecanumDrive = new MecanumDrive(robot);
    }

    @Override
    protected void runRobot() {
        while (opModeIsActive()) {
            // Controles del robot

            double forward = -gamepad1.left_stick_y;
            double strafe = gamepad1.left_stick_x;
            double turn = gamepad1.right_stick_x;

            // Utilizar la clase MecanumDrive para controlar el movimiento del robot
            mecanumDrive.drive(forward, strafe, turn);

            idle();
        }
    }
}

package org.firstinspires.ftc.teamcode.Controllers;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class PIDExample extends LinearOpMode {

    private DcMotor motorFrontLeft;
    private DcMotor motorFrontRight;
    private DcMotor motorBackLeft;
    private DcMotor motorBackRight;

    private PIDController pidController;

    @Override
    public void runOpMode() {
        // Inicialización de motores de ejemplo
        motorFrontLeft = hardwareMap.get(DcMotor.class, "motorFrontLeft");
        motorFrontRight = hardwareMap.get(DcMotor.class, "motorFrontRight");
        motorBackLeft = hardwareMap.get(DcMotor.class, "motorBackLeft");
        motorBackRight = hardwareMap.get(DcMotor.class, "motorBackRight");

        // Configurar PIDController
        pidController = new PIDController();

        waitForStart();

        while (opModeIsActive()) {
            double targetPosition = 1000; // Ejemplo de posición objetivo
            double currentPosition = motorFrontLeft.getCurrentPosition(); // Utilizamos un motor como referencia
            double error = targetPosition - currentPosition;
            double deltaTime = 0.02; // Ejemplo de intervalo de tiempo entre actualizaciones
            double power = pidController.calculate(error, deltaTime);

            // Aplicar la potencia calculada a los motores
            motorFrontLeft.setPower(power);
            motorFrontRight.setPower(power);
            motorBackLeft.setPower(power);
            motorBackRight.setPower(power);

            // Esperar antes de la próxima actualización
            sleep((long) (deltaTime * 1000));
        }
    }
}
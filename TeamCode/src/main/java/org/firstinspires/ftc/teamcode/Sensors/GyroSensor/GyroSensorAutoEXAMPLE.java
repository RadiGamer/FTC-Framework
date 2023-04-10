package org.firstinspires.ftc.teamcode.Sensors.GyroSensor;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.MainClasses.RobotOpMode;

@Autonomous(name = "GyroAutonomous", group = "FTC")
public class GyroSensorAutoEXAMPLE extends RobotOpMode {
    private GyroSensor gyroSensor;

    @Override
    protected void initRobot() {
        super.initRobot();
        // Inicializar el sensor de giroscopio y calibrarlo
        gyroSensor = new GyroSensor(this);
        gyroSensor.calibrate();
    }

    @Override
    protected void runRobot() {
        while (opModeIsActive()) {
            // Obtener el ángulo actual del giroscopio
            double currentAngle = gyroSensor.getAngle();

            // Realizar acciones basadas en el ángulo del giroscopio
            // Por ejemplo, girar hasta alcanzar un ángulo específico


            // Para agregar este comportamiento en otra clase, copia y modifica
            // el siguiente bloque de código según tus necesidades.
            if (currentAngle < 90) {
                // Girar a la derecha
                robot.motorFrontLeft.setPower(0.3);
                robot.motorFrontRight.setPower(-0.3);
                robot.motorBackLeft.setPower(0.3);
                robot.motorBackRight.setPower(-0.3);
            } else {
                // Detener el robot
                robot.motorFrontLeft.setPower(0);
                robot.motorFrontRight.setPower(0);
                robot.motorBackLeft.setPower(0);
                robot.motorBackRight.setPower(0);
            }
            // Fin del bloque de código

            // Mostrar el ángulo actual en la telemetría
            telemetry.addData("Current Angle", currentAngle);
            telemetry.update();
        }
    }
}
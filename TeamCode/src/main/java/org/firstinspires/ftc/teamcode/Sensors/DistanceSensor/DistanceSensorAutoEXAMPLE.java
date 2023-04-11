// DistanceSensorAutonomousOnly.java
package org.firstinspires.ftc.teamcode.Sensors.DistanceSensor;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "DistanceSensorAutonomousOnly", group = "FTC")
public class DistanceSensorAutoEXAMPLE extends LinearOpMode {
    private DistanceSensorWrapper distanceSensor;

    @Override
    public void runOpMode() {
        // 1. Inicializar el sensor de distancia utilizando la clase DistanceSensorWrapper
        // Pasa el OpMode actual (this) y el nombre del sensor configurado en el archivo de configuración del hardware
        distanceSensor = new DistanceSensorWrapper(this, "distance_sensor");

        // Esperar a que el usuario inicie el OpMode
        waitForStart();

        while (opModeIsActive()) {
            // 2. Leer la distancia en centímetros utilizando el método getDistanceInCm() de la clase DistanceSensorWrapper
            double distanceInCm = distanceSensor.getDistanceInCm();

            // 3. Mostrar la distancia en la telemetría
            telemetry.addData("Distance (cm)", distanceInCm);
            telemetry.update();

            // Aquí puedes incluir cualquier lógica adicional que desees ejecutar en función de la distancia medida
        }
    }
}

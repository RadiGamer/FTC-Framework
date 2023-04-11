package org.firstinspires.ftc.teamcode.Sensors.ColorSensor;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class ColorSensorAutoEXAMPLE extends LinearOpMode {
    private ColorSensorWrapper colorSensor;

    @Override
    public void runOpMode() {
        // 1. Inicializar el sensor de color utilizando la clase ColorSensorWrapper
        // Pasa el OpMode actual (this) y el nombre del sensor configurado en el archivo de configuración del hardware
        colorSensor = new ColorSensorWrapper(this, "color_sensor");

        // Esperar a que el usuario inicie el OpMode
        waitForStart();

        while (opModeIsActive()) {
            // 2. Leer los valores de color (rojo, verde, azul y alfa) utilizando los métodos de la clase ColorSensorWrapper
            int red = colorSensor.red();
            int green = colorSensor.green();
            int blue = colorSensor.blue();
            int alpha = colorSensor.alpha();

            // 3. Mostrar los valores de color en la telemetría
            telemetry.addData("Red", red);
            telemetry.addData("Green", green);
            telemetry.addData("Blue", blue);
            telemetry.addData("Alpha", alpha);
            telemetry.update();

            // Aquí puedes incluir cualquier lógica adicional que desees ejecutar en función de los valores de color leídos
        }
    }
}
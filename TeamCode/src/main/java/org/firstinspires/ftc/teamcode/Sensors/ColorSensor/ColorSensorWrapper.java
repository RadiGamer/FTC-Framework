// ColorSensorWrapper.java
package org.firstinspires.ftc.teamcode.Sensors.ColorSensor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;

public class ColorSensorWrapper {
    private ColorSensor colorSensor;
    private OpMode opMode;

    public ColorSensorWrapper(OpMode opMode, String sensorName) {
        this.opMode = opMode;
        colorSensor = opMode.hardwareMap.get(ColorSensor.class, sensorName);
    }

    public int red() {
        return colorSensor.red();
    }

    public int green() {
        return colorSensor.green();
    }

    public int blue() {
        return colorSensor.blue();
    }

    public int alpha() {
        return colorSensor.alpha();
    }
}

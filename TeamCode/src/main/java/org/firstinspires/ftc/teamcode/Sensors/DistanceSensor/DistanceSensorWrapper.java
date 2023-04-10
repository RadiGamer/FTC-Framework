package org.firstinspires.ftc.teamcode.Sensors.DistanceSensor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class DistanceSensorWrapper {
    private DistanceSensorWrapper distanceSensorWrapper;
    private OpMode opMode;

    public DistanceSensorWrapper(OpMode opMode, String sensorName) {
        this.opMode = opMode;
        distanceSensorWrapper = opMode.hardwareMap.get(DistanceSensorWrapper.class, sensorName);
    }

    public double getDistance(DistanceUnit unit) {
        return distanceSensorWrapper.getDistance(unit);
    }

    public double getDistanceInCm() {
        return getDistance(DistanceUnit.CM);
    }
}
//TODO EXAMPLE
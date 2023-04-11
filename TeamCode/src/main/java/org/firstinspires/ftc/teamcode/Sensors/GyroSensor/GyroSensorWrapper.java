package org.firstinspires.ftc.teamcode.Sensors.GyroSensor;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GyroSensorWrapper {
    private BNO055IMU imu;
    private OpMode opMode;
    private BNO055IMU.Parameters parameters;
    private ExecutorService executor;

    public GyroSensorWrapper(OpMode opMode) {
        this.opMode = opMode;
        init();
    }

    private void init() {
        // Configurar y registrar el dispositivo IMU
        parameters = new BNO055IMU.Parameters();
        parameters.angleUnit = BNO055IMU.AngleUnit.DEGREES;
        parameters.accelUnit = BNO055IMU.AccelUnit.METERS_PERSEC_PERSEC;
        parameters.loggingEnabled = false;

        imu = opMode.hardwareMap.get(BNO055IMU.class, "imu");
        imu.initialize(parameters);
        executor = Executors.newSingleThreadExecutor();
    }

    public double getAngle() {
        // Obtener el ángulo actual en grados desde el giroscopio
        return imu.getAngularOrientation().firstAngle;
    }

    public void calibrate() {
        // Calibrar el giroscopio de forma asíncrona
        executor.submit(() -> {
            imu.initialize(parameters);
            opMode.telemetry.addData("GyroSensor", "Calibrating...");
            opMode.telemetry.update();

            while (!imu.isGyroCalibrated()) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            opMode.telemetry.addData("GyroSensor", "Calibration complete");
            opMode.telemetry.update();
        });
    }
}

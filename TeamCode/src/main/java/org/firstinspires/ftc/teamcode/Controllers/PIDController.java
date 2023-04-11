package org.firstinspires.ftc.teamcode.Controllers;

public class PIDController {
    public static double kP = 0.05;
    public static double kI = 0.01;
    public static double kD = 0.1;

    private double lastError;
    private double integral;

    public PIDController() {
        reset();
    }

    public double calculate(double error, double deltaTime) {
        double derivative = (error - lastError) / deltaTime;
        integral += error * deltaTime;
        lastError = error;
        return kP * error + kI * integral + kD * derivative;
    }

    public void reset() {
        lastError = 0;
        integral = 0;
    }
}
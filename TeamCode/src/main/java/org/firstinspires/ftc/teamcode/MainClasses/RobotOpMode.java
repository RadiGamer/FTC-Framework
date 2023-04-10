package org.firstinspires.ftc.teamcode.MainClasses;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public abstract class RobotOpMode extends LinearOpMode {
    // Instanciar la clase RobotHardware
    protected RobotHardware robot = new RobotHardware();

    // Método para inicializar el hardware del robot
    protected void initRobot() {
        robot.init(hardwareMap);
    }

    // Método abstracto que debe ser implementado en las clases que heredan de RobotOpMode
    protected abstract void runRobot();

    @Override
    public void runOpMode() {
        // Inicializar el hardware del robot
        initRobot();

        // Esperar a que se presione "start"
        waitForStart();

        // Ejecutar el modo de operación del robot (teleoperación o autonomía)
        runRobot();
    }
}
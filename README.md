# Framework para FTC con Ruedas Mecanum
Este framework está diseñado para facilitar el desarrollo de código para robots de First Tech Challenge (FTC) equipados con ruedas Mecanum. Provee una estructura básica y clases útiles para controlar el movimiento del robot, integrar sensores y desarrollar modos de teleoperación y autonomía.

1. [Requisitos previos](#requisitos-previos)
2. [Estructura del framework](#estructura-del-framework)
3. [Uso del framework](#uso-del-framework)
4. [Personalización y expansión](#personalización-y-expansión)

## Requisitos previos
Antes de utilizar este framework, asegúrese de haber instalado y configurado correctamente lo siguiente:

* Android Studio: https://developer.android.com/studio
* SDK de FIRST: https://github.com/FIRST-Tech-Challenge/FtcRobotController/wiki

## Estructura del framework
El framework está organizado en varias clases que cubren distintas funcionalidades:

1. Clases base
	* RobotHardware
	* RobotOpMode
2. Control del movimiento
	* MecanumDrive
	* Movement
3. Sensores
	* GyroSensor
	* DistanceSensor
	* ColorSensor
4. Controladores
	* PIDController
	* StateMachine
5. Teleoperación y autonomía
	* TeleOpMode
	* AutonomousMode
6. Utilidades
	* MathUtil
	* UnitConverter
## Uso del framework
Para utilizar este framework, siga los siguientes pasos:

1. Descargue o clone el repositorio del framework en su equipo local.
2. Importe el proyecto en Android Studio.
3. Familiarícese con las clases y la estructura del proyecto.
4. Cree su propio modo de teleoperación y autonomía basándose en las clases base proporcionadas (RobotOpMode, TeleOpMode y AutonomousMode).
5. Integre los sensores y controladores según sus necesidades.
6. Realice pruebas y ajustes en su robot.

## Personalización y expansión
Este framework está diseñado para ser flexible y fácil de adaptar a las necesidades de su equipo. Siéntase libre de personalizar y expandir las clases y funcionalidades existentes para satisfacer los requisitos de su robot y las tareas específicas que debe realizar.

Algunas ideas para expandir el framework incluyen:

- [ ] Agregar soporte para otros tipos de sensores, como cámaras o sensores de fuerza.
- [ ] Implementar algoritmos de navegación y localización.
- [ ] Integrar el uso de visión por computadora para reconocimiento de objetos y seguimiento.
- [ ] Optimizar el rendimiento del robot mediante el ajuste de parámetros y controladores.

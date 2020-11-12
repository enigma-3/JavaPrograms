package JavaTest;

/**
 *
 * @author Gavin Nagra
 */
public class RobotFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char convertedNumber;

        SmartRobot smartRobot = new SmartRobot("", "", 0.0, "");

        smartRobot.setRobotName("Smart Kid");
        smartRobot.setRobotModel("Model X");
        smartRobot.setRobotWeight(87.3);
        smartRobot.setRobotHeight("5ft 7in");

        System.out.println("Robot Name: " + smartRobot.getRobotName()
                + "\nRobot Model: " + smartRobot.getRobotModel() + "\n"
                + "Robot Weight: " + smartRobot.getRobotWeight() + " lb"
                + "\nRobot Height: " + smartRobot.getRobotHeight());

        smartRobot.talk();
        smartRobot.walk();
        smartRobot.showMagicNumber();
        convertedNumber = smartRobot.checkAndConvert();
        
        System.out.println("\nThe converted version is: " + convertedNumber);

    }

}

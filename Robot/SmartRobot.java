package JavaTest;

import javax.swing.JOptionPane;

/**
 *
 * @author Gavin Nagra
 */
public class SmartRobot {

    private String name;
    private String model;
    private double weight;
    private String height;

    /**
     * Constructor
     *
     * @param robName The robot's name
     * @param robModel The robot's model
     * @param robWeight The robot's weight
     * @param robHeight The robot's height.
     */
    public SmartRobot(String robName, String robModel, double robWeight, String robHeight) {
        name = robName;
        model = robModel;
        weight = robWeight;
        height = robHeight;
    }

    /**
     * The walk method makes the robot walk
     */
    public void walk() {
        System.out.println("\nI am walking");
    }

    /**
     * The talk method makes the robot talk
     */
    public void talk() {
        System.out.println("\nHi there, how are you?");
    }

    /**
     * The showMagicNumber method shows a random number from 1-100
     */
    public void showMagicNumber() {
        int randomNumber;

        randomNumber = (int) (Math.random() * 100 + 1);
        System.out.println("\nThe magic number is: " + randomNumber);
    }

    /**
     * The checkAndConvert method shows a converts an integer to ASCII char
     */
    public char checkAndConvert() {

        char converted;
        int number;

        String input = JOptionPane.showInputDialog("Enter a number to convert");
        number = Integer.parseInt(input);

        if (number > 64 && number < 123) {
            converted = (char) (number);
            return converted;
        } else {
            return '\n';
        }
    }

    /**
     * The setRobotName method sets the robot's name
     *
     * @param robName The robot's name
     */
    public void setRobotName(String robName) {
        name = robName;
    }

    /**
     * The setRobotModel method sets the robot's method
     *
     * @param robMethod The robot's method
     */
    public void setRobotModel(String robModel) {
        model = robModel;
    }

    /**
     * The setRobotWeight method sets the robot's weight
     *
     * @param robWeight The robot's weight
     */
    public void setRobotWeight(double robWeight) {
        weight = robWeight;
    }

    /**
     * The setRobotHeight method sets the robot's height
     *
     * @param robHeight The robot's height
     */
    public void setRobotHeight(String robHeight) {
        height = robHeight;
    }

    /**
     * getRobotName method
     *
     * @return The robot's name
     */
    public String getRobotName() {
        return name;
    }

    /**
     * getRobotModel method
     *
     * @return The robot's model
     */
    public String getRobotModel() {
        return model;
    }

    /**
     * getRobotWeight method
     *
     * @return The robot's weight
     */
    public double getRobotWeight() {
        return weight;
    }

    /**
     * getRobotHeight method
     *
     * @return The robot's height
     */
    public String getRobotHeight() {
        return height;
    }
}

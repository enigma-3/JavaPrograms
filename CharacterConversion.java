import javax.swing.JOptionPane;     // To enable input/output dialogs

/**
 *
 * @author Gavin Nagra
 * Convert Letter/Odd & Even Numbers
 */
public class CharacterConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String choice;      // Variable to store in JOptionPane
        int userChoice;     // Choice converted to integer
        
            do {                          
        choice = JOptionPane.showInputDialog("Please choose one of the options:"
                + "\n\n" + "1. Convert letter to lowercase\n" + "2. Odd or Even "
                + "\n\n" + "Type in 1 or 2.");  // Menu choice
                    
        userChoice = Integer.parseInt(choice);
        
        if (userChoice != 1 && userChoice != 2) // Validation
            JOptionPane.showMessageDialog(null, "Please enter a valid option.");
        
        } while (userChoice != 1 && userChoice != 2);   // Validation
        
        switch (userChoice) {
            case 1: convertLetter();     // Convert to lowercase method call
            break;
            case 2: oddOrEven();    // Odd/Even checker method call
            break;
        }   // Menu choices
            
    }
    
    public static void convertLetter() {    // Convert letter method
        
        String upperCaseLetter;   // Variable for user input of uppercase letter
        String lowerCaseLetter;   // Variable used to convert uppercase letter
        
       upperCaseLetter = JOptionPane.showInputDialog("Please enter an uppercase"
                + " letter: ");   // Obtains user input for upperCaseLetter
       lowerCaseLetter = upperCaseLetter.toLowerCase(); // Converts to lowercase
        
       JOptionPane.showMessageDialog(null, "The lowercase version is: " + 
               lowerCaseLetter);  // Displays results of converted letter
    }   
    
    public static void oddOrEven() {        // Odd or Even method
        
        String number;      // Number input for JOptionPane
        int userNumber;     // Convert input to integer
        
        // Receive input from user and store in variable
        number = JOptionPane.showInputDialog("Please enter a number: "); 
        // Convert input to integer for program
        userNumber = Integer.parseInt(number);
        
        if (userNumber % 2 == 0) {  // If number is even check
            JOptionPane.showMessageDialog(null, userNumber + " is an even "
                    + "number.");
        }
        else if (userNumber % 2 != 0) {     // If number is odd check
            JOptionPane.showMessageDialog(null, userNumber + " is an odd "
                    + "number.");
        }
    }

}
import javax.swing.JOptionPane;   // Too enable JOptionPane for input/output

/**
 *
 * Secret Number Guessing Game
 */
public class GuessTheNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String tryAgain = null;     // Declare outside of do-while loop
      
        do {    
        // Declare variables
        int randomNumber;
        int numberGuess;
        
        // Code process for obtaining "random secret number"
        randomNumber = (int)((Math.random()* 9 + 1));
       
        // Disabled below message which gives answer to secret number 
        // System.out.println("The random number is: " + randomNumber);
        
        // Prompt user to enter a guess for the number
        JOptionPane.showMessageDialog(null, "I have a secret number, can you "
                + "guess what it is?");
        
        do {
            
        // Input box for user to guess the number
        String string1 = JOptionPane.showInputDialog("Guess the number: ");
        numberGuess = Integer.parseInt(string1);
            
        // User gets it right, obtain input whether they'd like to try again
        if (numberGuess == randomNumber)
            tryAgain = JOptionPane.showInputDialog(null, "You got it! Would you"
                    + " like to try again? (Y/N)");
        
        // User gets it wrong by guessing lower number, display message
        else if (numberGuess < randomNumber)
            JOptionPane.showMessageDialog(null, "Your guess is too small, "
                    + "try again.");
        
        // User gets it wrong by guessing higher number, display message
        else if (numberGuess > randomNumber)
            JOptionPane.showMessageDialog(null, "Your guess is too large, "
                    + "try again.");
        
        } while (numberGuess != randomNumber);  
        // If incorrect outcomes, repeat guess chances
        
        } while (tryAgain.equals("Y") || tryAgain.equals ("y"));   
        // Repeat program if user inputs "Y" or "y"
    } 
     
}

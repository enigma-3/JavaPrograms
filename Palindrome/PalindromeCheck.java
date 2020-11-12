import javax.swing.JOptionPane;

/**
 *
 * @author gavinnagra
 */
public class PalindromeCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    StackInterface<String> arrayStack = new ArrayStack<>();
    String userInput;
    userInput = JOptionPane.showInputDialog("Enter a string");
    arrayStack.palindromeCheck(userInput);
    }
}


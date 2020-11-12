import javax.swing.JOptionPane;

/**
 *
 * @author gavinnagra
 */
public class DrawCircles extends DrawLines {
    
    public void drawCircle() {
        
        String input = JOptionPane.showInputDialog("Enter the starting point (A,"
                + " B, C, or D)");
        userChar = input.charAt(0);
        
        String input2 = JOptionPane.showInputDialog("Enter the next point to"
                + "determine the diameter (A, B, C, or D)");
        userChar2 = input2.charAt(0);
        
        JOptionPane.showMessageDialog(null, "Drawing a circle starting at " + 
                userChar + " with a diameter from " + userChar + " to " +
                userChar2);
        
    }
    
}

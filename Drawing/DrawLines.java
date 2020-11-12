import javax.swing.JOptionPane;

/**
 *
 * @author gavinnagra
 */
public class DrawLines extends DrawPoints{
    
    protected char userChar2;
    
    public void drawLine() {
        
        String input = JOptionPane.showInputDialog("Enter your first point (A, B"
                + ", C, or D");
        userChar = input.charAt(0);
        String input2 = JOptionPane.showInputDialog("Enter your second point(A,"
                + " B, C, or D");
        userChar2 = input2.charAt(0);
        
        JOptionPane.showMessageDialog(null, "Drawing a line from " + userChar + " to "
        + userChar2);
        
        
    }
    
}

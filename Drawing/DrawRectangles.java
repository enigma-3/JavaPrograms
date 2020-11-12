import javax.swing.JOptionPane;

/**
 *
 * @author gavinnagra
 */
public class DrawRectangles extends DrawLines {
    
    private char userChar3;
    private char userChar4;
    
    public void drawRectangle() {
        
        String input = JOptionPane.showInputDialog("Enter the first point (A, B,"
                + " C, or D)");
        userChar = input.charAt(0);
        
        String input2 = JOptionPane.showInputDialog("Enter the second point (A,"
                + " B, C, or D)");
        userChar2 = input2.charAt(0);
        
        String input3 = JOptionPane.showInputDialog("Enter the third point (A, "
                + "B, C, or D)");
        userChar3 = input3.charAt(0);
        
        String input4 = JOptionPane.showInputDialog("Enter the fourth point (A,"
                + " B, C, or D)");
        userChar4 = input4.charAt(0);
        
        JOptionPane.showMessageDialog(null, "Drawing a rectangle by connecting "
                + "the following points: " + userChar + " to " + userChar2 + 
                " to " +  userChar3 + " to " + userChar4);
        
        
    }
    
}

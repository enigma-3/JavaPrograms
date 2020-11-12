import javax.swing.JOptionPane;

/**
 *
 * @author gavinnagra
 */
public class DrawPoints {
    
    private char A = 'A';
    private char B = 'B';
    private char C = 'C';
    private char D = 'D';
    protected char userChar;
    
    public void drawPoint() {
        
        String userPoint = JOptionPane.showInputDialog("Enter Point A, B, C or "
                + "D");
        userChar = userPoint.charAt(0);
        
        switch(userChar) {
            case 'A':
                JOptionPane.showMessageDialog(null, "Drawing a point at " + A);
                break;
            case 'B':
                JOptionPane.showMessageDialog(null, "Drawing a point at " + B);
                break;
            case 'C':
                JOptionPane.showMessageDialog(null, "Drawing a point at " + C);
                break;
            case 'D':
                JOptionPane.showMessageDialog(null, "Drawing a point at " + D);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid input!");
        }
    }
}

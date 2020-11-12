import javax.swing.JOptionPane;

/**
 *
 * @author Gavin Nagra
 */
public class DrawingTool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int choice;
        
        DrawPoints drawPoint = new DrawPoints();
        DrawRectangles drawRectangle = new DrawRectangles();
        DrawCircles drawCircle = new DrawCircles();
        DrawLines drawLine = new DrawLines();
        
        String input = JOptionPane.showInputDialog("Enter a number from the menu"
                + " below:\n\n" + "1. Draw a Point\n" + "2. Draw a Rectangle\n"+
                "3. Draw a Circle\n" + "4. Draw a Line");
        choice = Integer.parseInt(input);
        
        switch(choice) {
            case 1:
                drawPoint.drawPoint();
                break;
            case 2:
                drawRectangle.drawRectangle();
                break;
            case 3:
                drawCircle.drawCircle();
                break;
            case 4:
                drawLine.drawLine();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid input");
        }
    }
    
}

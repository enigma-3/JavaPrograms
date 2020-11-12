import javax.swing.JOptionPane;

/**
 *
 * @author Gavin Nagra
 */
public class StudentProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name;
        String ID;
        String uniName;
        String department;
        int age;

        name = JOptionPane.showInputDialog("Enter your name");
        ID = JOptionPane.showInputDialog("Enter your Student ID");
        uniName = JOptionPane.showInputDialog("Enter the name of your "
                + "University");
        department = JOptionPane.showInputDialog("Enter your department");

        String input = JOptionPane.showInputDialog("Enter your age");
        age = Integer.parseInt(input);

        University student = new University(ID, name, uniName, department, age);

        JOptionPane.showMessageDialog(null, "Student Name: "
                + student.getStudentName() + "\n" + "Student Age: "
                + student.getStudentAge() + "\n" + "Student ID: "
                + student.getStudentID() + "\n" + "University Name: "
                + student.getStudentUniversity() + "\n" + "Department: "
                + student.getStudentDep());

    }

}

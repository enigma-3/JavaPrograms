/**
 *
 * @author gavinnagra
 */
public class Employee {

    String name;
    String employeeID;

    public Employee() {
    }

    public Employee(String name, String employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return this.name;
    }

    public String getEmployeeID() {
        return this.employeeID;
    }

    @Override
    public String toString() {
        System.out.println("Employee Name: " + this.name + "\nEmployee ID: "
                + this.employeeID);
        return "";
    }
}

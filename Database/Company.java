import java.util.List;

/**
 *
 * @author gavinnagra
 */
public class Company extends Organization {
    
    String type;
    protected List<Employee> employees;
    
    public Company() {}
    
    Company(String name, String address, String type, List<Employee> employees){
        super(name, address);
        this.type = type;
        this.employees = employees;
    } 
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    public String getType() {
        return this.type;
    }
    
    public List<Employee> getEmployees() {
        return this.employees;
    }
    
    @Override
    public String toString() {
        super.toString();
        System.out.println("Type: " + this.type + "\n");
        for(Employee e: this.employees)
        {
           System.out.println(e);
        }   
        return null;
    }
}


import java.util.*;

public class School extends Organization {

    private String location;
    private String address;

    protected List<Department> departments;

    public School() {
    }

    School(String name, String president, int yearFound, String location, String address) {
        this.name = name;
        this.president = president;
        this.yearFound = yearFound;
        this.location = location;
        this.address = address;
    }

    School(List<Department> departments) {
        this.departments = departments;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return this.location;
    }

    public String getAddress() {
        return this.address;
    }

    public void display() {
        System.out.println("Organization: " + this.name + "\nPresident: "
                + this.president + "\nYear Founded: " + this.yearFound
                + "\nCity: " + this.location + "\nAddress: " + this.address
                + "\n");
    }
    
    @Override
    public String toString() {
        for(Department d: departments)
        {
           d.display();
        }   
        return null;
    }
}

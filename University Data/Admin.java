import java.util.*;

public class Admin extends Person {

    private String dean;
    private String facultyControlled;
    
    protected List<Professor> professors;
    
    public Admin() {}
    
    Admin(String name, int age, String gender, String dean, 
            String facultyControlled) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dean = dean;
        this.facultyControlled = facultyControlled;
    }
    
    Admin(List<Professor> professors) {
        this.professors = professors;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDean(String dean) {
        this.dean = dean;
    }

    public void setFacultyControlled(String facultyControlled) {
        this.facultyControlled = facultyControlled;
    }

    public String getDean() {
        return this.dean;
    }

    public String getFacultyControlled() {
        return this.facultyControlled;
    }
    
    public void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nGender: "
        + gender + "\nDean: " + dean + "\nFaculty: " + facultyControlled + "\n");
    }
    
    @Override
    public String toString() {
        for(Professor p: professors)
        {
           p.display();
        }   
        return null;
    }
}

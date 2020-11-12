import java.util.*;

public class University extends Organization {

    private int numberOfStudents;
    private int numberOfSchools;
    
    protected List<School> schools;
    
    public University() {}
    
    University(List<School> schools) {
        this.schools = schools;
    }
    
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfStudents() {
        return this.numberOfStudents;
    }

    public void setNumberOfSchools(int numberOfSchools) {
        this.numberOfSchools = numberOfSchools;
    }

    public int getNumberOfSchools() {
        return this.numberOfSchools;
    }

    public void display() {
    }
    
    @Override
    public String toString() {
        for(School sc: schools)
        {
           sc.display();
        }   
        return null;
    }
}

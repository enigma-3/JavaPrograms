import java.util.*;

public class Professor extends Person {

    private String faculty;
    private String email;
    private String degree;
    
    
    protected List<Student> students;
    
    public Professor() {}
    
    Professor(String name, int age, String gender, String faculty, String email,
            String degree) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.faculty = faculty;
        this.email = email;
        this.degree = degree;
    }
    
        Professor(List<Student> students) {
        this.students = students;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDegree() {
        return this.degree;
    }

    public void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " +
                gender + "\nFaculty: " + faculty + "\nEmail: " + email +
                "\nDegree: " + degree + "\n");
    }
    
    @Override
    public String toString() {
        for(Student s: students)
        {
           s.display();
        }   
        return null;
    }
}

import java.util.*;
/**
 *
 * @author gavinnagra
 */
public class UniDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        School sc1 = new School("Kwantlen Polytechnic University", "Alan Davis",
        1981, "Surrey", "12666 72 Ave");
        School sc2 = new School("Kwantlen Polytechnic University", "Alan Davis",
        1981, "Richmond", "8771 Lansdowne Road");
        
        List <School> schools = new ArrayList<School>();
        schools.add(sc1);
        schools.add(sc2);
        
        University universities = new University(schools);
        universities.toString();
        
        Department d1 = new Department("Arts", "Criminology", 3000);
        Department d2 = new Department("Arts", "Psychology", 4500);
        
        List <Department> departments = new ArrayList<Department>();
        departments.add(d1);
        departments.add(d2);
        
        School schoolDepartments = new School(departments);
        schoolDepartments.toString();
        
        
        Professor p1 = new Professor("Howard", 55, "Male", "Arts", "howard@kpu"
                + ".ca", "MA");
        Professor p2 = new Professor("Henry", 40, "Male", "Science", "henry@kpu"
                + ".ca", "MS");
        Professor p3 = new Professor("Robert", 84, "Male", "Arts", "robert@kpu"
                + ".ca", "MA");
        Professor p4 = new Professor("Edgar", 64, "Male", "Science", "edgar@kpu"
                + ".ca", "MS");
        
        List <Professor> artsProfs = new ArrayList<Professor>();
        artsProfs.add(p1);
        artsProfs.add(p3);
        
        List <Professor> scienceProfs = new ArrayList<Professor>();
        scienceProfs.add(p2);
        scienceProfs.add(p4);
        
        Admin a1 = new Admin("Sansa", 67, "Female", "Roberta", "Arts");
        Admin a2 = new Admin("Arya", 54, "Female", "Cathrine", "Science");
        
        System.out.println("The following are Administrators of the Arts/Science"
                + " faculty:\n");
        a1.display();
        a2.display();
        
        System.out.println("The following are Professors in the two "
                + "faculties:\n");
             
        Admin artsAdmin = new Admin(artsProfs);
        artsAdmin.toString();
        
        Admin scienceAdmin = new Admin(scienceProfs);
        scienceAdmin.toString();
        
        Student s1 = new Student("Jake", 18, "Male", "123", "General", 1);
        Student s2 = new Student("Jimmy", 19, "Male", "456", "Other", 1);
        Student s3 = new Student("Justin", 20, "Male", "789", "Test", 2);
        Student s4 = new Student("Gavin", 18, "Male", "334", "General", 2);
        
        List <Student> firstyears = new ArrayList<Student>();
        firstyears.add(s1);
        firstyears.add(s2);
        
        List <Student> secondyears = new ArrayList<Student>();
        secondyears.add(s3);
        secondyears.add(s4);
        
        System.out.println("Professor " + p1.getName() + " is in"
                + " charge of the following first year students: \n");
        Professor firstyear = new Professor(firstyears);
        firstyear.toString();
        
        System.out.println("Professor " + p2.getName() + " is in"
                + " charge of the following second year students: \n");
        Professor secondyear = new Professor(secondyears);
        secondyear.toString();
        
        System.out.println("The following course is taught by Professor " + 
                p3.getName() + ":");
        
        Course c1 = new Course("1125 - S87", "Political Science", p3.getName());
        c1.display();
        
        System.out.println("\nStudent " + s4.getName() + " takes the above "
                + "course.");
        
        
    }
    
}

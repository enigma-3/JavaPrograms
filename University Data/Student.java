
public class Student extends Person {

    private String ID;
    private String department;
    private int year;

    public Student() {
    }

    Student(String name, int age, String gender, String ID, String department,
            int year) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.department = department;
        this.year = year;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setDep(String department) {
        this.department = department;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getID() {
        return this.ID;
    }

    public String getDep() {
        return this.department;
    }

    public int getYear() {
        return this.year;
    }

    public void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nGender: "
                + gender + "\nStudent ID: " + ID + "\nDepartment: " + department
                + "\nYear: " + year + "\n");
    }
}

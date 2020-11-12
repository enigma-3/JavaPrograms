public class Department extends Organization {

    private String depName;
    private String program;
    private int studentsEnrolled;
    
    public Department() {}
    
    Department(String depName, String program, int studentsEnrolled) {
        this.depName = depName;
        this.program = program;
        this.studentsEnrolled = studentsEnrolled;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    
    public void setStudentsEnrolled(int studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public String getDepName() {
        return this.depName;
    }

    public String getProgram() {
        return this.program;
    }

    public int getStudentsEnrolled() {
        return this.studentsEnrolled;
    }

    public void display() {
        System.out.println("\nDepartment: " + this.depName + "\nProgram: " +
                this.program + "\nStudents Enrolled: " + this.studentsEnrolled
                + "\n");
    }
}

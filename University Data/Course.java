public class Course {

    private String courseNumber;
    private String courseName;
    private String courseProf;
    
    public Course() {}
    
    Course(String courseNumber, String courseName, String courseProf) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.courseProf = courseProf;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseProf(String courseProf) {
        this.courseProf = courseProf;
    }

    public String getCourseNumber() {
        return this.courseNumber;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getCourseProf() {
        return this.courseProf;
    }

    public void display() {
        System.out.println("\nCourse Name: " + this.courseName + "\nCourse "
                + "Number: " + this.courseNumber + "\nCourse Prof: " + 
                this.courseProf);
    }
}

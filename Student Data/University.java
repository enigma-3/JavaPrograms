/**
 *
 * @author Gavin Nagra
 */
public class University {

    // Fields
    private String studentNumber;       // Student Number ID
    private String studentName;         // Student's Name
    private String universityName;      // Student's University Name
    private String department;          // Student's Department
    private int studentAge;          // Student's Age

    /**
     * Constructor
     *
     * @param studName The student's name
     * @param num The student's ID
     * @param uniName The student's university name
     * @param dep The student's department.
     * @param age The student's age.
     */
    public University(String num, String studName, String uniName, String dep,
            int age) {
        studentName = studName;
        studentNumber = num;
        universityName = uniName;
        department = dep;
        studentAge = age;
    }

    // Methods
    /**
     * The setStudentName method sets the student's name
     *
     * @param studName The student's name
     */
    public void setStudentName(String studName) {
        studentName = studName;
    }

    /**
     * The setStudentID method sets the student's ID
     *
     * @param num The student number and ID
     */
    public void setStudentID(String num) {
        studentNumber = num;
    }

    /**
     * The setStudentUniversity method sets the student's university
     *
     * @param uniName The student's university
     */
    public void setStudentUniversity(String uniName) {
        universityName = uniName;
    }

    /**
     * The setStudentDepartment method sets the student's department
     *
     * @param dep The student's department
     */
    public void setStudentDepartment(String dep) {
        department = dep;
    }

    /**
     * The setStudentAge method sets the student's age
     *
     * @param age The student's age
     */
    public void setStudentAge(int age) {
        studentAge = age;
    }

    /**
     * getStudentName method
     *
     * @return The student's name
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * getStudentID method
     *
     * @return The student's ID
     */
    public String getStudentID() {
        return studentNumber;
    }

    /**
     * getStudentUniversity method
     *
     * @return The student's university
     */
    public String getStudentUniversity() {
        return universityName;
    }

    /**
     * getStudentDep method
     *
     * @return The student's department
     */
    public String getStudentDep() {
        return department;
    }

    /**
     * getStudentAge method
     *
     * @return The student's age
     */
    public int getStudentAge() {
        return studentAge;
    }
}

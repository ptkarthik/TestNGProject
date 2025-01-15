package practise.schoolsort.java.map;

public class StudentDetails implements Comparable<StudentDetails>{
    public StudentDetails(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    private String studentName;

    @Override
    public String toString() {
        return "StudentDetails{" +
                "studentName='" + studentName + '\'' +
                ", studentID='" + studentID + '\'' +
                '}';
    }

    private String studentID;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }


    @Override
    public int compareTo(StudentDetails o) {
        return this.getStudentID().compareTo(o.getStudentID());
    }
}

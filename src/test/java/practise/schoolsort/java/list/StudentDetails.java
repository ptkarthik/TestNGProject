package practise.schoolsort.java.list;

public class StudentDetails implements Comparable<StudentDetails> {

    private int rollNumber;
    private String name;
    private Double age;

    public StudentDetails(int rollNumber, String name, Double age, String department) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    private String department;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }





   @Override
    public int compareTo(StudentDetails o) {
        return (int) (o.getAge()-this.getAge());
    }
}

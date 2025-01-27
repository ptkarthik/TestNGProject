package practise.jan27.streams.groupingbyusage.studentdata;

class Student {
    private String name;
    private String grade;
    private int marks;

    public Student(String name, String grade, int marks) {
        this.name = name;
        this.grade = grade;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " (" + grade + ", " + marks + " marks)";
    }
}
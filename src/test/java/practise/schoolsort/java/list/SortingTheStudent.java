package practise.schoolsort.java.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTheStudent {
    public static void main(String[] args) {
        List<StudentDetails> studentDetailsList = new ArrayList<>();
        studentDetailsList.add(new StudentDetails(1, "Karthik", 36.00, "Testing"));
        studentDetailsList.add(new StudentDetails(2, "Pavithra", 29.00, "HR"));
        studentDetailsList.add(new StudentDetails(3, "Inira", 2.10, "Government"));
        studentDetailsList.add(new StudentDetails(23, "Harish", 28.00, "CustomerSupport"));
        studentDetailsList.add(new StudentDetails(1, "Pradeep", 26.00, "Developer"));
        Collections.sort(studentDetailsList,new ComaparatorSetup());
       for(StudentDetails s:studentDetailsList) {
           System.out.println(s.getName());
       }
    }
}

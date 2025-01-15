package practise.schoolsort.java8.list;

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
        List<StudentDetails> srtedList=studentDetailsList.stream().sorted(new ComaparatorSetup()).toList();
//        for(StudentDetails s:srtedList)
//        {
//            System.out.println(s.getName());
//        }
//studentDetailsList.stream().sorted().forEachOrdered(n->System.out.println(n.getName()));
//        System.out.println("Using fr each");
//        //using foreach
        studentDetailsList.stream().sorted(new ComaparatorSetup()).forEach(student->System.out.println(student.getName()));
    }
}

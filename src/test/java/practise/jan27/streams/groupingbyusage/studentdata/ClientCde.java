package practise.jan27.streams.groupingbyusage.studentdata;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClientCde {
    /*
    Grouping and Partitioning

Group a list of students based on their grades and partition them into pass/fail categories.
     */
    public static void main(String[] args) {
        List<Student> listOfStudents = Arrays.asList(new Student("Karthik", "C", 330),
                new Student("Pavithra", "A", 467),
                new Student("Madhu", "A", 487)
                , new Student("Pradeep", "B", 413),
                new Student("Inira", "A", 458),
                new Student("Harish", "C", 370),
                new Student("Sridhar", "B", 401),
                new Student("Manoj", "D", 299)
        );

        Map<String, List<Student>> map = listOfStudents.stream().
                collect(Collectors.groupingBy(student -> student.getGrade()));
        //to know the structure of above map.. im cnverting too Set and check.
        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        //output will be like

        /*A [Pavithra (A, 467 marks), Madhu (A, 487 marks), Inira (A, 458 marks)]
        B [Pradeep (B, 413 marks), Sridhar (B, 401 marks)]
        C [Karthik (C, 330 marks), Harish (C, 370 marks)]
        D [Manoj (D, 299 marks)] */


        Map<Boolean,List<Student>> passedOrFailed=listOfStudents.stream().
                collect(Collectors.partitioningBy(student->student.getMarks()>=300));

        passedOrFailed.get(true).stream().
                sorted((student,student2)->student2.getName().compareTo(student.getName())).forEach(student->System.out.println(student));
        ;
    }
}

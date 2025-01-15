package practise.schoolsort.java8.map;

import java.util.HashMap;
import java.util.Map;

public class ClientCodeMap {
    public static void main(String[] args) {
        Map<Integer, StudentDetails> student = new HashMap();
        student.put(1, new StudentDetails("Karthik", "433831"));
        student.put(2, new StudentDetails("Pavithra", "456644"));
        student.put(3, new StudentDetails("Inira", "33221"));
        student.put(4, new StudentDetails("Pradeep", "98900"));
        student.put(5, new StudentDetails("Harish", "878798"));

//using entrySet
        student.entrySet().stream().sorted((e1, e2) -> e1.getValue().getStudentName().compareTo(e2.getValue().getStudentName())
        ).forEach((ent -> System.out.println(ent.getValue().getStudentID() + "   " + ent.getValue().getStudentName())));

    }

}

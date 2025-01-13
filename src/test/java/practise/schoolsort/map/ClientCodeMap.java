package practise.schoolsort.map;

import java.util.*;

public class ClientCodeMap {
    public static void main(String[] args) {
        Map<Integer, StudentDetails> student = new HashMap();
        student.put(1, new StudentDetails("Karthik", "433831"));
        student.put(2, new StudentDetails("Pavithra", "456644"));
        student.put(3, new StudentDetails("Inira", "33221"));
        student.put(4, new StudentDetails("Pradeep", "98900"));
        student.put(5, new StudentDetails("Harish", "878798"));

//        Set<Map.Entry<Integer, StudentDetails>> studentSet = student.entrySet();
//        for (Map.Entry<Integer, StudentDetails> iterator : studentSet) {
//            System.out.println(iterator.getValue().toString());
//        }

        //below returns collections
        Collection<StudentDetails> collectionOfMap = student.values();

        List<StudentDetails> listOFStudents = new ArrayList<>(collectionOfMap);
//        System.out.println("The collections of list of students is" + listOFStudents);
//
//        //the below sorting is dne via student id as per the compare to method in StudentDetails Class
//        //Collections.sort dooes that
//        Collections.sort(listOFStudents);
//        for (StudentDetails j : listOFStudents) {
//            System.out.println(j.getStudentID());
//        }

        //lets see how reverse order works
        Collections.sort(listOFStudents, new ComparatorReverseOrder());

        for (StudentDetails j : listOFStudents) {
            System.out.println(j.getStudentID());
        }
    }

}

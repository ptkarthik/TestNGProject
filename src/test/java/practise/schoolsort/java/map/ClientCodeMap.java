package practise.schoolsort.java.map;

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
        Set<Integer> ss=student.keySet();

        List<StudentDetails> listOFStudents = new ArrayList<>(collectionOfMap);
//        System.out.println("The collections of list of students is" + listOFStudents);
//
//        //the below sorting is dne via student id as per the compare to method in StudentDetails Class
//        //Collections.sort dooes that
//        Collections.sort(listOFStudents);
//        for (StudentDetails j : listOFStudents) {
//            System.out.println(j.getStudentID());
//        }

//        //lets see how reverse order works
//        Collections.sort(listOFStudents, new ComparatorReverseOrder());
//
//        for (StudentDetails j : listOFStudents) {
//            System.out.println(j.getStudentID()+ "  "+j.getStudentName());
//        }

        //above all of sorted by coonverting map too List nw we will do via Entries

        Set<Map.Entry<Integer, StudentDetails>> setOfStudents = student.entrySet();
        List<Map.Entry<Integer, StudentDetails>> convertedListOfMapEntries = new ArrayList<>(setOfStudents);

        System.out.println(convertedListOfMapEntries);

        //just too reverse via key which is "Integer type"
        Collections.reverse(convertedListOfMapEntries);
        System.out.println("After Reversal");
        System.out.println(convertedListOfMapEntries);


        // reverse via value "Student details" data either student name or id

        Collections.sort(convertedListOfMapEntries,  (e1, e2) -> e2.getValue().getStudentName().
                compareTo(e1.getValue().getStudentName()));

        for (Map.Entry<Integer, StudentDetails> j : convertedListOfMapEntries) {
            System.out.println(j.getValue().getStudentID() + "  " + j.getValue().getStudentName());
        }

    }

}

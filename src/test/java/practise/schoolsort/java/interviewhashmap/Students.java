package practise.schoolsort.java.interviewhashmap;

import java.util.HashMap;
import java.util.Map;

public class Students {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<String, String>();
        students.put("Harish", "001");
        students.put("Karthik", "002");
        students.put("Pavithra", "003");
        students.put("Pradeep", "004");
        students.put("Inira", "005");
        students.put("Sridhar", "006");
        students.put("Madhu", "007");

        students.entrySet().stream().sorted((studentOne, studentTwo) ->
                        studentTwo.getValue().compareTo(studentOne.getValue())).
                forEach(n -> System.out.println(n.getKey() + "  " + n.getValue()));
    }
}
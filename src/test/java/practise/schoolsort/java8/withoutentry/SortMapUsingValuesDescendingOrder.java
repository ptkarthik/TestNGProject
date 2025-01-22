package practise.schoolsort.java8.withoutentry;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapUsingValuesDescendingOrder {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<String, String>();
        students.put("Harish", "001");
        students.put("Karthik", "002");
        students.put("Pavithra", "003");
        students.put("Pradeep", "004");
        students.put("Inira", "005");
        students.put("Sridhar", "006");
        students.put("Madhu", "007");

        // we create an arraylist by passing keyset
        List<String> listOfString = new ArrayList<>(students.keySet());

        listOfString.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return students.get(o2).compareTo(students.get(o1));
            }
        });
        Map<String, String> sortedMap = new LinkedHashMap<>();
        for (String value : listOfString) {
            sortedMap.put(value, students.get(value));
        }
        System.out.println(sortedMap);

        // above same using java8
        Map<String, String> srtedMap = students.keySet().stream().sorted((key1, key2) -> students.get(key2).
                compareTo(students.get(key1))).collect(Collectors.toMap(key -> key, value -> students.get(value),
                (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedMap);


    }


}

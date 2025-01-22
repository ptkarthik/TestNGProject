package practise.hashmapsortingfinal;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapValueSort {
    public static void main(String[] args) {

        Map<String, String> students = new HashMap<String, String>();
        students.put("Harish", "001");
        students.put("Karthik", "002");
        students.put("Pavithra", "003");
        students.put("Pradeep", "004");
        students.put("Inira", "005");
        students.put("Sridhar", "006");
        students.put("Madhu", "007");

        //using keyset using non java 8
        Set<String> setofKeys = students.keySet();
        List<String> listOfString = new ArrayList<>(setofKeys);

        Collections.sort(listOfString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return students.get(o2).compareTo(students.get(o1));
            }
        });

        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        for (String k : listOfString) {
            linkedHashMap.put(k, students.get(k));
        }

        System.out.println(linkedHashMap);

        //using keyset using java8
        Map<String, String> linkedHashMap2 = students.keySet().stream().sorted((key1, key2) ->
                students.get(key2).compareTo(students.get(key1))).collect(Collectors.toMap(k -> k,
                k -> students.get(k), (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(linkedHashMap2);

        //using entryset without java
        List<Map.Entry<String, String>> listfEntries = new ArrayList<>(students.entrySet());

        Collections.sort(listfEntries, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        Map<String, String> linkedHashMap3 = new LinkedHashMap<>();
        for (Map.Entry<String, String> e : listfEntries) {
            linkedHashMap3.put(e.getKey(), e.getValue());
        }
        System.out.println(linkedHashMap3);


        ////using entryset with java8 using for each
        students.entrySet().stream().sorted((set1, set2) -> set2.getValue().
                compareTo(set1.getValue())).forEach((e) ->
                System.out.println(e.getKey() + " " + e.getValue()));
        ////using entryset with java8 using linkedHashMap
        Map<String, String> linkedHashMap4 = students.entrySet().
                stream().sorted((set1, set2) -> set2.getValue().
                        compareTo(set1.getValue())).
                collect(Collectors.toMap(key -> key.getKey(), value ->
                        value.getValue(), (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(linkedHashMap4);
    }
}

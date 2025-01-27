package practise.jan27.streams.groupingbyusage.studentdata;

import java.util.*;

public class KeysAretheFirstLetterOfString {
    public static void main(String[] args) {
        /*
        Custom Collector

Create a custom collector to build a Map where keys are the
first letter of a string, and values are lists of strings.
         */

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Edward");
//
//        names.stream().collect(Collectors.groupingBy(v -> v.charAt(0))).
//                entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        //custom collectr
        Map<Character, List<String>> hashMap = new HashMap<>();
        for (String name : names) {
            Character characterData = name.charAt(0);
            List<String> stringList = new ArrayList<>();
            for (String name1 : names) {
                if (name1.indexOf(characterData) == 0) {
                    stringList.add(name1);
                    hashMap.put(characterData, stringList);
                }
            }
        }
        System.out.println(hashMap);
    }
}


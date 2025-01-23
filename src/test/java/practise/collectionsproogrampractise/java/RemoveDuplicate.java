package practise.collectionsproogrampractise.java;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        /*
        Find Duplicate Elements in a List

        Write a program to find all duplicate elements in a List.
         */

        List<String> fruits = Arrays.asList(
                "Apple", "Banana", "Orange", "Grapes", "Mango",
                "Pineapple", "Peach", "Cherry", "Strawberry", "Blueberry",
                "Raspberry", "Watermelon", "Papaya", "Lemon", "Lime",
                "Pear", "Plum", "Kiwi", "Apricot", "Guava",
                "Apple", "Banana", "Mango", "Pineapple", "Cherry",
                "Peach", "Watermelon", "Papaya", "Blueberry", "Raspberry",
                "Orange", "Grapes", "Lemon", "Lime", "Pear",
                "Kiwi", "Plum", "Guava", "Apricot", "Strawberry",
                "Apple", "Mango", "Banana", "Grapes", "Cherry",
                "Lime", "Papaya", "Watermelon", "Pineapple", "Orange", "kaka"
        );

        // finding duplicates : approach 1
        fruits.stream().collect(Collectors.
                        groupingBy(key -> key, Collectors.counting())).entrySet().
                stream().map((entry) -> entry.getValue() > 1 ? entry.getKey() +
                        " has duplicates and its value is " + entry.getValue()
                        : entry.getKey() + " " + "is not duplicate").
                forEach(entry -> System.out.println(entry));

        //CONVERT TO MAP AND GET DETAILS

        Map<String, Integer> hashMap = new HashMap<>();
        Integer count = 1;
        for (String fruit : fruits) {
            if (!hashMap.containsKey(fruit)) {
                hashMap.put(fruit, count);
            } else {
                hashMap.put(fruit, hashMap.get(fruit) + 1);
            }
        }

        for (Map.Entry<String, Integer> data : hashMap.entrySet()) {

            if (data.getValue() > 1) {
                System.out.println("The Duplicate fruits are " +
                        "" + " " + data.getKey() + " " + "The count of duplicates Values are" + " " + data.getValue());
            }

        }

        //remving duplicates
        Set<String> duplicates = new HashSet<>(fruits);
        System.out.println(duplicates);

    }
}

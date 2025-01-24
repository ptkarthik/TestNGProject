package practise.practiseroundtwo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateElementsinaList {

    public static void main(String[] args) {
        List<String> items = Arrays.asList(
                "Carrot", "Toyota", "Apple", "Banana", "Potato",
                "BMW", "Carrot", "Cherry", "Ford", "Cucumber",
                "Audi", "Fig", "Tesla", "Onion", "Tomato",
                "Spinach", "Tesla", "Banana", "Mercedes", "Apple", "Avacado", "Tiger", "Ajith"
        );

        for (int i = 0; i < items.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < items.size(); j++) {
                if (items.get(i).equalsIgnoreCase(items.get(j))) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("the fruit " + items.get(i) + " is a duplicate");

            }
        }

        //lets do the same with java 8
        System.out.println(items.stream().filter(i -> items.stream().
                        filter(j -> i.equalsIgnoreCase(j)).count() > 1).distinct().
                collect(Collectors.toList()));

    }
}

package practise.practiseroundtwo.java8;

import java.util.*;
import java.util.stream.Collectors;

public class CountOccurencesOfEachElement {
    public static void main(String[] args) {
        List<String> items = Arrays.asList(
                "Carrot", "Toyota", "Apple", "Banana", "Potato",
                "BMW", "Carrot", "Cherry", "Ford", "Cucumber",
                "Audi", "Fig", "Tesla", "Onion", "Tomato",
                "Spinach", "Tesla", "Banana", "Mercedes", "Apple", "Avacado", "Tiger", "Ajith"
        );

        Map<String, Long> map = items.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting())).
                entrySet().stream().
                collect(Collectors.toMap(k -> k.getKey(), value -> value.getValue(), (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(map);

        Optional<Map.Entry<String, Long>> o = items.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting())).
                entrySet().stream().max((e1, e2) -> e1.getValue().compareTo(e2.getValue()));
        o.ifPresent((e -> System.out.println(e.getKey() + " " + e.getValue())));

    }
}

package practise.collectionsproogrampractise.java8;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CoonvertListToMap {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(1, 43, 4, 5, 112, 11, 3, 9, 34, 22, 45, 6);
        List<String> listOfString = Arrays.asList("Karthik", "Ajay", "Harish", "Jeevan",
                "Kanmani", "Ajith", "Vijay");
        SecureRandom secureRandom = new SecureRandom();
        Map<Integer, String> map =
                listOfIntegers.stream().collect(Collectors.
                        toMap(e -> e, e -> listOfString.get(secureRandom.nextInt(listOfString.size())), (d, g) ->
                                d, LinkedHashMap::new));
        System.out.println(map);


        //using reduce and find max value of
        //logic is 0 is identity and a is the same identity, b is the value stream has. one by one.
        /*
        first iteration it checks 0,1
        second iteration since 1 is greater it becomes a and b is the next value of stream it keeps checking and return
         */
        Integer max = listOfIntegers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("the max" + max);
    }
}

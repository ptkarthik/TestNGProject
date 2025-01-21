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
                        toMap(e -> e, e -> listOfString.get(secureRandom.nextInt(listOfString.size()))));
        System.out.println(map);
    }
}

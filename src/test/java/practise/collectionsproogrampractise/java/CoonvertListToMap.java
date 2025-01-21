package practise.collectionsproogrampractise.java;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoonvertListToMap {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(1, 43, 4, 5, 112, 11, 3, 4, 9, 34, 22, 45, 6);
        List<String> listOfString = Arrays.asList("Karthik", "Ajay", "Harish", "Jeevan",
                "Kanmani", "Ajith", "Vijay");
        Map<Integer, String> map = new HashMap<>();
        SecureRandom secureRandom = new SecureRandom();
        for (Integer s : listOfIntegers) {
            map.put(s, listOfString.get(secureRandom.nextInt(listOfString.size())));
        }

        System.out.println(map);
    }
}

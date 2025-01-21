package practise.collectionsproogrampractise.java8;

import java.util.Arrays;
import java.util.List;

public class CustomCollectorToCountVowelsInAList {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(1, 43, 4, 5, 112, 11, 3, 9, 34, 22, 45, 6);
        listOfIntegers.stream().map(CustomCollectorToCountVowelsInAList::square).forEach(System.out::println);
    }

    public static int square(int number) {
        return number * number;
    }

}

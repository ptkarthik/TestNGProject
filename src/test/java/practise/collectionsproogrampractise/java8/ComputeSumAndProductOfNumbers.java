package practise.collectionsproogrampractise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ComputeSumAndProductOfNumbers {
    public static void main(String[] args) {
        Integer sum = 0;
        List<Integer> listOfIntegers = Arrays.asList(1, 43, 4, 5, 112, 11, 3, 4, 9, 34, 22, 45, 6);

        System.out.println(listOfIntegers.stream().mapToInt(Integer::intValue).sum());
    }


}

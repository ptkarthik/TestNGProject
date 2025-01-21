package practise.collectionsproogrampractise.java;

import java.util.Arrays;
import java.util.List;

public class ComputeSumAndProductOfNumbers {
    public static void main(String[] args) {
        Integer sum = 0;
        List<Integer> listOfIntegers = Arrays.asList(1, 43, 4, 5, 112, 11, 3, 4, 9, 34, 22, 45, 6);

        for (Integer i : listOfIntegers) {
            sum = sum + i;
        }
        System.out.println(sum);

        //aboove deos sum and product using java8
    }

}

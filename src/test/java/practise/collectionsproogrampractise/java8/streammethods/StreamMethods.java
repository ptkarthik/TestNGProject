package practise.collectionsproogrampractise.java8.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(1, 43, 4, 5, 112, 11, 3, 4, 9, 34, 22, 45, 6);
        // noneMatch will check all f the values in stream and it will return true if none match
        System.out.println(listOfIntegers.stream().noneMatch(a -> a.equals(1)));

        //mapToInt return int not integer. basically it toIntFunction
        System.out.println(listOfIntegers.stream().mapToInt(Integer::intValue).sum());

        //mapToDouble
        listOfIntegers.stream().mapToDouble(Integer::doubleValue).count();

       Optional<Integer> opt= listOfIntegers.stream().reduce((a, b)->a>b?a:b);
       opt.ifPresent(System.out::print);


    }

}

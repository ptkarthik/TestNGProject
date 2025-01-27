package practise.jan27.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MultiplePredicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 18, 7, 21, 15, 3, 10, 27);
        numbers.stream().filter(f -> f % 2 == 0).filter(f -> f / 1 == 10).forEach(f -> System.out.println(f));

//without Streams


        Predicate<Integer> function1 = f -> f % 2 == 0;

        Predicate<Integer> function2 = f -> f / 1 == 10;

        Predicate<Integer> n = function1.and(function2);
        n.test(10);
    }


}

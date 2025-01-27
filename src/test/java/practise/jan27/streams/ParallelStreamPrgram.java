package practise.jan27.streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ParallelStreamPrgram {
    public static void main(String[] args) {
        List<Integer> randomIntegers = new Random()
                .ints(1000000, 1, 1000)  // Generate 1 million random integers between 1 and 1000
                .boxed()
                .collect(Collectors.toList());

        randomIntegers.parallelStream().forEachOrdered(s->System.out.println(s));
    }

}

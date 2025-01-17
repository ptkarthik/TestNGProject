package oonbardingmodulesrevisit.java8.functionalinterface.primitiveinterfaces;

import java.security.SecureRandom;
import java.util.function.IntPredicate;

public class IntPredicateClientCde {
    public static void main(String[] args) {
        int a[] = {10, 2, 3, 5, 4, 6, 7, 24, 26, 23, 34, 56, 66};
        SecureRandom secureRandom = new SecureRandom();
        int index = secureRandom.nextInt(a.length);

        IntPredicate intpred = values -> values % 2 == 0;

        System.out.println("the number " + " " + a[index] + " " + intpred.test(a[index]));

    }
}

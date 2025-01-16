package oonbardingmodulesrevisit.java8.lambdaexpressions;

import java.util.function.Predicate;

public class PalindromeOrNot {
    public static void main(String[] args) {

        palindromCheckWithoutStreams("kaak");



    }

    private static void palindromCheckWithoutStreams(String s) {
        Predicate<String> p =
                ss -> {
                    String reversed = "";
                    for (int i = ss.length() - 1; i >= 0; i--) {
                        reversed = reversed + ss.charAt(i);
                    }
                    return ss.equalsIgnoreCase(reversed);
                };
        System.out.println(p.test(s));
    }
}

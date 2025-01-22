package practise.javaprograms.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringBasedOnLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Lekhashree", "Sathya", "BalajiYuvaraj", "Niharika");
        list.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }).forEach(s->System.out.println(s));
    }

}

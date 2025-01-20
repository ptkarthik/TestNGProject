package practise.javaprograms.collection;

import java.util.*;

public class ListToSetTransfrm {
    public static void main(String[] args) {
        String[] strings = new String[]{
                "Karthik", "Ajith", "Vijay", "Pavihra", "Harini", "losliya","Vijay","Manoj"
        };

        System.out.println(Arrays.toString(strings));

        List<String> listOFStrings = Arrays.asList(strings);

        System.out.println(listOFStrings.toString());

        HashSet<String> set = new HashSet(listOFStrings);
        System.out.println(set.toString());
      set.stream().sorted((a,b)->b.compareTo(a)).forEach(s->System.out.println(s));

    }
}

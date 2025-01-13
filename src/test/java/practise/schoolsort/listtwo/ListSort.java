package practise.schoolsort.listtwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Grapes");
        list.add("Mango");
        list.add("Carror");
        list.add("Beetroot");
        list.add("Banana");
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        list.stream().sorted(Collections.reverseOrder()).forEach(n->System.out.println(n));
    }
}

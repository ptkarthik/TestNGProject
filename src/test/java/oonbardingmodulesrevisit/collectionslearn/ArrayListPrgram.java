package oonbardingmodulesrevisit.collectionslearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPrgram {
    public static void main(String[] args) {
        List<List<Integer>> listofLists = new ArrayList<>();
        listofLists.add(Arrays.asList(5));
        listofLists.add((Arrays.asList(5, 4, 77, 74, 22, 44)));
        listofLists.add(Arrays.asList(1, 12));
        listofLists.add(Arrays.asList(4, 37, 34, 36, 52));
        listofLists.add(Arrays.asList(0));
        listofLists.add(Arrays.asList(3, 20, 22, 33));
        listofLists.add(Arrays.asList(5));
        listofLists.add(Arrays.asList(1, 3));
        listofLists.add(Arrays.asList(3, 4));
        listofLists.add(Arrays.asList(3, 1));
        listofLists.add(Arrays.asList(4, 3));
        listofLists.add(Arrays.asList(5, 5));
        System.out.println(listofLists);
    }
}

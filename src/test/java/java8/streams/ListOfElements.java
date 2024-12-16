package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfElements {
    public static void main(String[] args) {
      List<String> listObjects=  Arrays.asList("Karthik","Pavithra","Inira","Harish");
        System.out.println(listObjects.stream().map(list->list.length()).sorted().collect(Collectors.toList()));
        System.out.println(listObjects.stream().sorted().collect(Collectors.toList()));
        listObjects.stream().

    }
}

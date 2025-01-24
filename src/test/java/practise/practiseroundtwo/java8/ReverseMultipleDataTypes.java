package practise.practiseroundtwo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseMultipleDataTypes {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(
                "Apple5", "Banana3", "Cherry10", "Date7",
                "Elderberry2", "Fig8", "Grape1", "Honeydew4", "IndianFig9"
        );
        // List of Integers
        List<Integer> integerList = Arrays.asList(
                1, 2, 3, 4, 5,
                6, 7, 8, 9, 10,
                11, 12, 13, 14, 15,
                16, 17, 18, 19, 20
        );

        // List of Characters
        List<Character> characterList = Arrays.asList(
                'A', 'B', 'C', 'D', 'E',
                'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T'
        );

        // List of Doubles
        List<Double> doubleList = Arrays.asList(
                1.1, 2.2, 3.3, 4.4, 5.5,
                6.6, 7.7, 8.8, 9.9, 10.10,
                11.11, 12.12, 13.13, 14.14, 15.15,
                16.16, 17.17, 18.18, 19.19, 20.20
        );

        reversetheString(stringList);
        reversetheInteger(integerList);
        reversetheCharacter(characterList);
        reversetheDouble(doubleList);
    }

    private static void reversetheDouble(List<Double> doubleList) {
        System.out.println(doubleList.stream().sorted((double1, double2) -> double2.compareTo(double1)).
                collect(Collectors.toList()));
    }

    private static void reversetheCharacter(List<Character> characterList) {
        //owm custom comparator
        System.out.println(characterList.stream().
                sorted((characters1, characters2) -> characters2.compareTo(characters1)).
                collect(Collectors.toList()));
    }

    private static void reversetheInteger(List<Integer> integerList) {
        //owm custom comparator
        System.out.println(integerList.stream().sorted((Int1, Int2) -> Int2.compareTo(Int1)).collect(Collectors.toList()));
    }

    private static void reversetheString(List<String> stringList) {
        //owm custom comparator
        List<String> reversedStringList = stringList.stream().
                sorted((string1, string2) -> string2.compareTo(string1)).collect(Collectors.toList());
        System.out.println(reversedStringList);


    }

}


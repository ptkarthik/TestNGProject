package oonbardingmodulesrevisit.corejava.arraysandstrings.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersFromString {
    /*
    1. write a program to Print duplicate characters from String

     */
    public static void main(String[] args) {
        Integer count = 1;
        String s = "Thisisdalskdjiieeriehroilskafjldkflkdfiresee";
        char[] characters = s.toCharArray();
        Map<Character, Integer> mapOfCharacters = new HashMap<>();

        for (Character c : characters) {
            if (!mapOfCharacters.containsKey(c)) {
                mapOfCharacters.put(c, count);
            } else {
                mapOfCharacters.put(c, mapOfCharacters.get(c) + 1);
            }
        }
        System.out.println(mapOfCharacters);

        for (Map.Entry<Character, Integer> entry : mapOfCharacters.entrySet()) {
            System.out.println("The character" + " " + entry.getKey() + " i" +
                    "s with duplicates of" + " " + entry.getValue());
        }
    }
}

package practise.conversions;

import java.util.ArrayList;
import java.util.List;

public class ConversionsCheck {
    public static void main(String[] args) {
        //list too Array
        List<String> listOfStrings= new ArrayList<>();
        listOfStrings.add("Hi");
        listOfStrings.add("Hello");
        listOfStrings.add("karthikeyan");
        String[] stringArray= listOfStrings.toArray(new String[0]);
        System.out.println(listOfStrings);
        System.out.println(stringArray[0]);

    }
}

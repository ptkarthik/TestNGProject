package java8.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class HandlingMaps {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Karthik","IT");
        map.put("Pavithra","HR");
        map.put("Inira","Kid");
        map.put("Harish","Cosmetics");
        map.put("Shruthy","College");
        map.put("Pradeep","IT");



        map.forEach((mapKey,mapValue)->{
        System.out.println(mapKey.toLowerCase());
            System.out.println(mapValue.toUpperCase());});
    }
}

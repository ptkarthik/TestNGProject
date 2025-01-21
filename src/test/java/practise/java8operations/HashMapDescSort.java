package practise.java8operations;

import java.util.*;

public class HashMapDescSort {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Karthik", "IT");
        hashMap.put("Pavithra", "HR");
        hashMap.put("Harish", "Customer Support");
        hashMap.put("Pradeep", "DevOps");
        hashMap.put("Inira", "School");
        hashMap.put("Raja", "Photography");
        hashMap.put("Kooteswaran", "Plumbing");
        hashMap.put("Pramila", "Teacher");


        List<Map.Entry<String, String>> unsortedList = new ArrayList<>(hashMap.entrySet());
        Collections.sort(unsortedList, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        Map<String, String> hasMap = new LinkedHashMap<>();

        for (Map.Entry<String, String> j : unsortedList) {
            hasMap.put(j.getKey(), j.getValue());
        }

        for (Map.Entry<String, String> j : hasMap.entrySet()) {
            System.out.println(j.getKey() + "  " + j.getValue());
        }
    }
}

package practise.java8operations;

import java.util.*;

public class HashMapAcsendingSort {
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
        Collections.sort(unsortedList, Comparator.comparing(Map.Entry::getValue));
    }
}

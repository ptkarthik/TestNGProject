package oonbardingmodulesrevisit.corejava.arraysandstrings.arrays;

public class SmallestLargestFinding {
    public static void main(String[] args) {
        Integer a[] = {10, 23, 24, 34, 1, 23, 46, 55};
        Integer largest=a[0];
        for (int i=0;i<a.length;i++) {
            if(a[i]>largest) {
                largest=a[i];
            }
        }
        System.out.println(largest);
    }
}

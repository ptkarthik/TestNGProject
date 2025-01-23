package practise.collectionsproogrampractise.java;

import java.util.Arrays;

public class MergeTwoSortedArraysIntoAList {
    public static void main(String[] args) {
        /*
        Merge Two Sorted Arrays into a Sorted List
        Write a program to merge two sorted arrays
        into one sorted list.
         */

        Integer[] unsortedArray = {42, 7, 19, 35, 56, 2, 13, 29, 11, 8, 24, 90, 14, 31, 3, 72, 18, 5, 49, 63};
        Integer temp;

        //sorting using collections.sort won't woork
        // becuase its cllection interface it can do list and set whereas this is and array .
        // yu either have convert it to list or d yur own sorting technique;

        for (int i = 0; i < unsortedArray.length; i++) {
            for (int j = 0; j < unsortedArray.length; j++) {
                if (unsortedArray[i] > unsortedArray[j]) {
                    temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[i];
                    unsortedArray[i] = temp;
                    System.out.println("The i value is " + unsortedArray[i] + " the j value is " + unsortedArray[j]);
                }
            }
        }

        System.out.println(Arrays.toString(unsortedArray));
    }
}

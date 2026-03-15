package org.dsaPractice.Sorting.CyclicSort;

import java.util.Arrays;

/*
* Cyclic Sort
*
* FOr every pass i -> 0 to n, array 's ith element is swapped with the array's value index -1 th position
*  if the values are not present in correct position
*  swapping criteria : if the array 's value at index (i) - 1 is not equal to the i
* */

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 1, 2, 4};
//        applyCyclicSortInON2(arr);
        applyCyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void applyCyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            var correctIndex = arr[i] - 1;
            if(correctIndex != i) {
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }

    public static void swap(int[] arr, int srcElem, int trgtElem) {
        int swap = arr[trgtElem];
        arr[trgtElem] = arr[srcElem];
        arr[srcElem] = swap;
    }
}

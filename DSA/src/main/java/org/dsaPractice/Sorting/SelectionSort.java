package org.dsaPractice.Sorting;

import java.util.Arrays;

/*
 * Selection Sort
 * 1. FIND THE FIRST LARGEST ELEMENT AND SWAP THE LAST INDEX , ALSO SWAP LAST INDEX ELEMENT TO CURRENT ELEMENT INDEX
 * 2. FIND THE SECOND LARGEST AND REPEAT THE PROCESS
 * 3. DO IT THE ARRAY LENGTH TIMES
 * */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 25, 2, 1};
        applySelectionSort(arr);
    }

    private static void applySelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastElemIndex = arr.length - i - 1;
            int largestElemIndex = findLargestElemIndex(arr, 0, lastElemIndex);

            var swap = arr[lastElemIndex];
            arr[lastElemIndex] = arr[largestElemIndex];
            arr[largestElemIndex] = swap;
        }

        System.out.println(Arrays.toString(arr));
    }

    private static int findLargestElemIndex(int[] arr, int start, int lastIndex) {
        int max = start;
        for (int i = start; i <= lastIndex; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }


}

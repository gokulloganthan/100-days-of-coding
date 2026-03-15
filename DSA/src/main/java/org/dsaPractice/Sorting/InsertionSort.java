package org.dsaPractice.Sorting;

import java.util.Arrays;

/*
 * Insertion Sort
 *
 * Array is partitioned as two half - left & right
 * left - sorted array
 * right - unsorted array
 *
 *  For each pass(i index) the swapper loop(j indexed) continues until all the right partition values are moved into left partition in appropriate position
 *     For 1st pass
 *     comparing first element in right array (2nd index) and last element in left array(1nd index)
 *           if first element in right array is smaller than the last element in left array
 *               then the right array element is transferred to end of left array
 *                  then swapping loop(j) is continued until the complete left array is sorted and in ascending order
 *                       on last inserted element is compared to the previous element of last array in left partition
 *                           swap needed - > value is swapped and pointer is moved to preceding elements in left
 *                  until then swapping is made until when no swapping is required i.e all left partition of array are completely sorted
 *           if first element in right array is larger than the last element in left array
 *               then the right array first element is appended to the end of left array and swapping loop is breaked for that pass
 *                [Note : why no comparison is required : because all the left aligned elements of left array are sorted already , so comparing it with last item of left array if we can conclude the new element is greater then remaining left aligned elements will also pass the criteria , So compariosn required)
 *    Same follows are remaining (n-2) passes of pass(i) loop
 *    [note : why only totally (n-2) passes for n elements ?
 *           As swapping loop starts one step ahead the current i value (j=i+1 ) we need to stop the looping
 *            why stop looping ? while i beling on nth loop and j swapping loop starting from (n-1)th element might lead to array indexOutOfBoundException
 * */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 6, 3, 4};
        applyInsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void applyInsertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int swap = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = swap;
                } else {
                    break;
                }
            }
        }
    }
}

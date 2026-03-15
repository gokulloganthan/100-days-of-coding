package org.dsaPractice.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void reverseArray(int[] arr) {
        int start = 0,end = arr.length-1;
        while(start <= end){
            swap(arr,start++,end--);
        }
    }

    public static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
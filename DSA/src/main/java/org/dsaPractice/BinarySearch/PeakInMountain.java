package org.dsaPractice.BinarySearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
/*
 * we are traversing the start,end from opposite directions
 * And compare the middle > middle + 1 if true then we are increasing order just increment the start to mid + 1
 * And simultaneouly comparwe the middle < middle -1 if true we are in decreasing order just consider the middle as possible peak continue comparing it with left side elements
 * When both end progress towards left and start progress towards right
 * at one point the loop breaks i.e start < end at that time start and end will point to the same index that will be the peek element
 * */

public class PeakInMountain {
    public static void main(String[] args) {
        int arr[] = {3,5,2,0};

        var ans = findPeakElement(arr);
        System.out.println(ans);
    }

    private static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int middle = start + (end - start) / 2;

            if(arr[middle] < arr[middle + 1]){
                start = middle + 1;
            }else{
                end = middle;
            }
        }

        System.out.println(start+":"+end);
        return end;
    }
}


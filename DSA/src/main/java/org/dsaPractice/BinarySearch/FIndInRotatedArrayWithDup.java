package org.dsaPractice.BinarySearch;

/*
https://leetcode.com/problems/search-in-rotated-sorted-array/description/
* find the pivot i.e larget number
    * scenario 1 if mid > mid +1 return mid  eg:[4,5,6,7,0,1,2]
    * scenario 2 if mid < mid +1 return mid+1  eg:[0,1,2,4,7,6,5]
    * scenario 3 if start < mid skip the left part of the middle because our pivot never exist in the part of array eg : [4,5,7,1,2] make start = mid
    * scenario 4 if start > mid skip the right part of the middle because our pivot never exist in the part of array eg : [6,7,4,2,1] make end = mid-1
* once if pivot element is captured in any of the 4 cases then find the target in left part of array
* if not found find in right part of array even not found return -1
* */
public class FIndInRotatedArrayWithDup {
    public static void main(String[] args) {
        int[] arr = {6,7,4,2,1};
        int target = 6;

        int pivot = findPivotInArrWithDuplicates(arr);
        System.out.println(pivot);
    }

    public static int findPivotInArrWithDuplicates(int[] arr){
        int start = 0;
        int end =  arr.length - 1;

        while(start <= end) {
            int middle = start + (end - start ) / 2;
            if(arr[start] <= arr[middle]){  // #scenario 3
                start = middle;
            }if(middle > start && arr[start] > arr[middle]){  // #scenario 4
                end =  middle - 1;
            }
            if(middle < end && arr[middle] > arr[middle + 1]){ // #scenario 1
                return middle;
            }else{
                return middle + 1;  // #scenario 2
            }
        }
        return -1;
    }
}

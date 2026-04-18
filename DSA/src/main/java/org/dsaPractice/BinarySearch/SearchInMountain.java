package org.dsaPractice.BinarySearch;

// My submission :
/*
 *
 * */

public class SearchInMountain {
    public static void main(String[] args) {
        int arr[] = {1,5,2};
        int target = 2;

        var peak = findPeakElement(arr,target);

        var isFoundInLeftSide = binaryAgnosticSearch(arr,target,0,peak);
        if(isFoundInLeftSide != -1){
            System.out.println(isFoundInLeftSide);
        }else{
            System.out.println(binaryAgnosticSearch(arr,target,peak+1,arr.length-1));
        }
    }

    private static int findPeakElement(int[] arr, int target) {
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

        return end;
    }

    private static int binaryAgnosticSearch(int[] arr, int target,int start,int end) {
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int middle = start + (end - start) / 2;

            if(arr[middle] == target){
                return middle;
            }

            if(isAsc){
                if(arr[middle] > target){
                    end = middle - 1;
                }else if (arr[middle] < target ){
                    start = middle + 1;
                }
            }else{
                if(arr[middle] < target){
                    end = middle - 1;
                }else if (arr[middle] > target ){
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}

/*
* /**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while(start <= end) {
            int middle = start + (end - start) / 2;

            if(mountainArr.get(middle) < mountainArr.get(middle+1)){
                start = middle + 1;
            }else{
                end = middle;
            }
        }

        int peak = end;
        int foundInLeftSide = binaryAgnosticSearch(mountainArr,target,0,peak);
        if(foundInLeftSide != -1){
            return foundInLeftSide;
        }
        return binaryAgnosticSearch(mountainArr,target,0,peak);
    }

    private static int binaryAgnosticSearch(MountainArray mountainArr, int target,int start,int end) {
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

        while(start <= end) {
            int middle = start + (end - start) / 2;

            if(mountainArr.get(middle) == target){
                return middle;
            }

            if(isAsc){
                if(mountainArr.get(middle) > target){
                    end = middle - 1;
                }else if (mountainArr.get(middle) < target ){
                    start = middle + 1;
                }
            }else{
                if(mountainArr.get(middle) < target){
                    end = middle - 1;
                }else if (mountainArr.get(middle) > target ){
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
* */
package org.dsaPractice.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ascArr = {1,3,23,42,55,78,89};
        int target = 55;

        int res = binaryAscSearch(ascArr,target);
        System.out.println(res);

        int[] descArr = new int[]{89,78,55,42,23,3,1};
        System.out.println(binaryDescSearch(descArr,target));

        System.out.println(binaryAgnosticSearch(ascArr,target));
        System.out.println(binaryAgnosticSearch(descArr,target));
    }

    public static int binaryAscSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int middle = start + (end - start) / 2;

            if(arr[middle] > target){
                end = middle - 1;
            }else if (arr[middle] < target ){
                start = middle + 1;
            }else{
                return middle;
            }
        }
        return -1;
    }

    public static int binaryDescSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int middle = start + (end - start) / 2;

            if(arr[middle] < target){
                end = middle - 1;
            }else if (arr[middle] > target ){
                start = middle + 1;
            }else{
                return middle;
            }
        }
        return -1;
    }

    /*to search both ascending or descending array*/
    private static int binaryAgnosticSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

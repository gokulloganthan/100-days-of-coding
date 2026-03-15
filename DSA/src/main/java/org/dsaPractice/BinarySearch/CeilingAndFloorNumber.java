package org.dsaPractice.BinarySearch;

//FLOOR  - FIND LARGEST NUMBER SMALLER THAN THE TARGET
//CEILING - FIND SMALLEST NUMBER LARGER THAN THE TARGET
public class CeilingAndFloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        System.out.println(ceilingNumberSearch(arr,target));
    }

    private static int ceilingNumberSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int middle = start + (end - start) / 2;

            if(arr[middle] > target){
                end = middle - 1;
            }else if (arr[middle] < target ){
                start = middle + 1;
            }else{
                if (arr[middle] == target){
                    return middle;
                }
            }
        }

        System.out.println(arr[start]+" <- start && end -> "+arr[end]);
        //we get two numbers arr[start] (ceiling) ,arr[end] (floor)
        // after the loop condition terminates we get two numbers for any target no
        // if we need ceiling number that is number grater or equal to target return the firstNo i.e 16
        // if we need floor number that is number lesser or equal to target return the firstNo i.e 14
        return start;
    }
}

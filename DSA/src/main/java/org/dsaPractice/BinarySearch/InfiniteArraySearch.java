package org.dsaPractice.BinarySearch;

/*
* step 1 find the length of array without using arr.length
*       step 1.1 set the s,e to 0th element
*       step 1.2 compare the subarray contains the target if it contains apply binary search
*       step 1.3 repeat the process of dubling the gap between s,e until you find subarray that contains the target
* step 2 find the target is within the array using binary search
* */
public class InfiniteArraySearch {
    public static void main(String[] args) {
        int[] arr = {1,11,25,39,43,56,63,75,84,93,101,114};
        //3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170
        int target = 84; //10

        System.out.println(findTheLastElementIndex(arr,target));
    }

    private static int findTheLastElementIndex(int[] arr,int target) {
        int start = 0;
        int end = 1;

        while(target > arr[end]) {
            int newStart = end + 1;
//            int oldBox = end-start; // to get the total length of oldbox i.e 2 because it has [0,1]
//            int oldBoxLen = oldBox+1;
//            int newBox = oldBoxLen * 2;
            end  =  end + (end - start + 1) * 2;  // or end = end + newBox
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }


    private static int binarySearch(int[] arr, int target,int start,int end) {
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
}

/*
* 2 ^ 0 = 1
* 2 ^ 1 = 2
* 2 ^ 3 = 8
* */
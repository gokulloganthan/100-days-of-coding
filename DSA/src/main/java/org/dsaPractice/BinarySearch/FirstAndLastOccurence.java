package org.dsaPractice.BinarySearch;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,9};
        int target = 8;

        //my tryouts
//        System.out.println(finLeftMost(arr,target)+" -> "+findRightMost(arr,target));

        //kunal sol
        System.out.println(findFirstAndLast(arr,target,true)+","+findFirstAndLast(arr,target,false));
    }

    private static int finLeftMost(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int middle = start + (end - start) / 2;

            if(arr[middle] > target || arr[middle] == target){
                end = middle - 1;
            }else{
                start = middle + 1;
            }
        }
        return end+1;
    }

    private static int findRightMost(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int middle = start + (end - start) / 2;

            if(arr[middle] < target || arr[middle] == target){
                start = middle + 1;
            }else{
                end = middle - 1;
            }
        }
        return start-1;
    }


    //kunal sol
    private static int findFirstAndLast(int[] arr, int target,boolean isFIndFirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end) {
            int middle = start + (end - start) / 2;
            if(arr[middle] > target){
                end = middle - 1;
            }else if (arr[middle] < target ){
                start = middle + 1;
            }else{
                ans = middle;
                if(isFIndFirst) {
                    end = middle - 1;
                }else{
                    start = middle + 1;
                }
            }
        }

        return ans;
    }
}

package org.dsaPractice.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,55,66,78};
        int target = 1;
        System.out.println(bs(arr,target,0,arr.length - 1));
    }

    static int bs(int[] arr,int trgt,int s,int e){
        //base condition
        if(s > e){
            return -1;
        }

        //recursive recurrence statement or the key recursion branch omitting decision is made based on this calculation
        int mid = s + (e - s) / 2;

        //capturing result in the recursion that we are expecting
        if(arr[mid] == trgt){
            return mid;
        }

        //traversing to left side tree if trgt comes before middle element in the array
        if(trgt < arr[mid]){
            return bs(arr,trgt,s,mid-1);
        }

        //traversing to right side tree if trgt comes after middle element in the array
        return bs(arr,trgt,mid+1,e);
    }
}

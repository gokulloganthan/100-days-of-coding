package org.dsaPractice.BinarySearch;

import java.util.ArrayList;
import java.util.List;

/*
* 1.find the min and max largest sum
*   min - largest number in an fine chopped array [i.e when we chunk each element into an subarray  and take largest number array
*   max - sum of the elements of the unchopped single array
*
* 2. use binary serach to find the minimum sum without sacrificing the below criteria
*   Criteria : total chops should not exceed the chop limit
*
* 3. Start adding the sum of each element to an array
*    3.a If next element addition will not exceed the permittedSum -> add new element
*    If adding next element will make totalSum > PermittedSum  -> Rest the sum and increase totalChops count by 1
*    At end you will get total chops
*
*    At final compare the chop to totalAllowedChops
*     if totalChops > permittedChops
*        -> then it means you have chopped finer than the permitted chop limit
*        -> To reduce the chop limit we need to increase the value of the permittedSum [if permittedSum increases total subarray limit can be expanded leading to less number of subarrays / chopps]
*        -> in binary search we can set the currentPermittedSum + 1 as beginning of permitted SUm as we know that reducing the permittedSum leads to more number od chops i.e violates the permittedChops
*        -> so the startPermittedSum will point to current middlePermittedSum + 1
*     else
*        -> we have more privilege to increase the permittedChopsSum ultimately leading to minimum permitted Chops Sum as possible & equal number permitted number of Chops
*        -> so our endPermittedSum will be reduced to current middlePermittedSum
*
*    Repeat the process until we reach the ultimate end where nothing goes wrong either by
*        -> decreasing the permittedChopsSum leading to increased totalChops violating the permittedChops
*        -> increasing the permittedChopsSum (does not lead to missing our minimalistic total sum as possible) also leading to decreased totalChops violating the permittedChops
*
*    Final goal : Reach the State where decreasing totalPermittedSum does not violate total number of chops required
*    -> our start will reach to the minimelistic total Sum as possible by increasing the permittedSum limit that does not violate our law i.e totalChops not lesser than the totalPermittedChops
*    -> our end will reach to the minimelistic total Sum as possible by decreasing the permittedSum that does not violate our law i.e totalChops not greater than the totalPermittedChops
* */
public class LargestSumInSplitArray {
    public static void main(String[] args) {

        /*easy*/
        int[] nums = new int[]{7,2,5,10,8};
        int k = 2;

        /*edge case 1*/
//        int[] nums = new int[]{1,4,4};
//        int k = 3;

        /*edge case 2*/
//        int[] nums = new int[]{2,3,1,2,4,3};
//        int k = 5;

        System.out.println(new LargestSumInSplitArray().splitArray(nums,k));
    }

    public int splitArray(int[] nums, int k) {
        /* Find the range between which our mimilest largest sum lies */
        if(nums.length == k){
            int max = nums[0];
            for (int num : nums) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

        int start = nums[0];
        int end = 0;
        for (int num : nums) {
            if (num < start) {
                start = num;
            }
            end += num;
        }



        List<List<Integer>> tempArr = new ArrayList<>();
        int tempArrCnt = 0;
        int tempArrElemCnt = 0;

        while(start < end){
            int middle = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for(int num : nums){
                if(num + sum > middle){
                    pieces++;
                    sum=num;
                }else{
                    sum += num;
                }
            }

            if(pieces > k){
                start = middle + 1;
            }else{
                end = middle;
            }
        }
        return end;
    }
}



package org.dsaPractice.Sorting.CyclicSort.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*https://leetcode.com/problems/find-the-duplicate-number/submissions/1873054733/*/
class AllMissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,7,8,2,3,1};

        System.out.println(allMissingNumber(arr));
    }
    private static List<Integer> allMissingNumber(int[] nums) {
        int i = 0;
        var missingNos = new ArrayList<Integer>();
        while (i < nums.length) {
            var correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1) {
                missingNos.add(j+1);
            }
        }

        return missingNos;
    }

    public static void swap(int[] nums, int srcElem, int trgtElem) {
        int swap = nums[trgtElem];
        nums[trgtElem] = nums[srcElem];
        nums[srcElem] = swap;
    }
}
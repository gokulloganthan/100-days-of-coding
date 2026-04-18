package org.dsaPractice.Sorting.CyclicSort.problems;

import java.util.Arrays;

/*https://leetcode.com/problems/set-mismatch/submissions/1873891790/*/
class SetMismatch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1};

        var res = findErrorNums(arr);
        System.out.println(res[0]+","+res[1]);
    }
    private static int[] findErrorNums(int[] nums) {
        int i = 0;
        var misMatches = new int[2];
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
            var correctIndex = nums[j] - 1;
            if(j != correctIndex) {
                misMatches[0] = nums[j];
                misMatches[1] = j + 1;
            }
        }

        return misMatches;
    }

    public static void swap(int[] nums, int srcElem, int trgtElem) {
        int swap = nums[trgtElem];
        nums[trgtElem] = nums[srcElem];
        nums[srcElem] = swap;
    }
}
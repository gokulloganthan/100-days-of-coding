package org.dsaPractice.Sorting.CyclicSort.problems;

import java.util.Arrays;

/*https://leetcode.com/problems/find-the-duplicate-number/submissions/1873054733/*/
class OneDuplNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,3,4,2};

        System.out.println(findDuplicate(arr));
    }
    private static int findDuplicate(int[] nums) {
        int i = 0;
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
                return nums[j];
            }
        }

        return -1;
    }

    public static void swap(int[] nums, int srcElem, int trgtElem) {
        int swap = nums[trgtElem];
        nums[trgtElem] = nums[srcElem];
        nums[srcElem] = swap;
    }
}
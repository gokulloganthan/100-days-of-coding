package org.dsaPractice.Sorting.CyclicSort.problems;

//https://leetcode.com/problems/missing-number/
class MissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{3,0,1};

        System.out.println(missingNumber(arr));
    }
    private static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            var correctIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j) return j;
        }

        return nums.length;
    }

    public static void swap(int[] nums, int srcElem, int trgtElem) {
        int swap = nums[trgtElem];
        nums[trgtElem] = nums[srcElem];
        nums[srcElem] = swap;
    }
}
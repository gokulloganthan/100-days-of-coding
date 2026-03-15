package org.dsaPractice.Sorting.CyclicSort.problems;


//https://leetcode.com/problems/first-missing-positive/submissions/1873973619/
class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,0};

        System.out.println(firstMissingPositive(arr));
    }
    private static int firstMissingPositive(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            var correctIndex = nums[i] - 1;
            //ignoring the negative elements and considering the num element with value lessOrEqual to the length of arrray
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }

        //usual scenario - finding which is the smallest positive number after 0
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1) return j+1;
        }

        return nums.length + 1;  //edge case : when no number is missing return the next number after the nth element of n elements array
    }

    public static void swap(int[] nums, int srcElem, int trgtElem) {
        int swap = nums[trgtElem];
        nums[trgtElem] = nums[srcElem];
        nums[srcElem] = swap;
    }
}
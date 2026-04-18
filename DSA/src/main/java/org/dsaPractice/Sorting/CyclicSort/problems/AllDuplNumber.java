package org.dsaPractice.Sorting.CyclicSort.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/1873142369/*/
class AllDuplNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,7,8,2,3,1};

        System.out.println(findAllDuplicate(arr));
    }
    private static List<Integer> findAllDuplicate(int[] nums) {
        int i = 0;
        var duplNos = new HashSet<Integer>();
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
                duplNos.add(nums[j]);
            }
        }

        return duplNos.stream().toList();
    }

    public static void swap(int[] nums, int srcElem, int trgtElem) {
        int swap = nums[trgtElem];
        nums[trgtElem] = nums[srcElem];
        nums[srcElem] = swap;
    }
}
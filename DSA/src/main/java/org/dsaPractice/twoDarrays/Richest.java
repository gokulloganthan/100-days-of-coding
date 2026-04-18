package org.dsaPractice.twoDarrays;

import java.util.Arrays;

public class Richest {
    public static void main(String[] args) {
        int[][] arr = {{2,8,7},{7,1,3},{1,9,5}};

        int max = findWealth(arr[0]);
        for(int[] a:arr){
            int curr = findWealth(a);
            if(curr > max){
                max = curr;
            }
        }
    }

    private static int findWealth(int[] a) {
        return Arrays.stream(a).sum();
    }
}

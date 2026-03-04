package org.dsaPractice.Bitwise;

/*
*   Using XOR to get unique
*
*
*  value
*   we no when same num ^ 0 gives same no
*   when 2 ^ 0 gives 2 but 2 ^ 2 gives 0
*   So idea here is all duplicate numbers xor with its duplicate number each other
*     At final stage only unique numbers stand in the race
*   Note : the order of xor does not matter here because due to association property ( a * b) === (b * a) So (a ^ b ^ c) === (c ^ b ^ a)
*   (2 ^ 3 ^ 4 ^ 1 ^ 2 ^ 1 ^ 3 ^ 6 ^ 4) => 6
*   it is similar to negative values of number cancelling it with the positive value
*   (2 + 3 + 4 + 1 + (-2) + (-1) + (-3) + 6 + (-4) ) = 6
* */
public class UniqueDigitInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,1,2,1,3,6,4};
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"^"+res+" returns "+(res^arr[i]));
            res ^= arr[i];
        }
        System.out.println(res);
    }
}

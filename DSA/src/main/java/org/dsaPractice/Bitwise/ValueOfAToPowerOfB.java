package org.dsaPractice.Bitwise;

/*
Find the value of a^b
- ![img_19.png](img_19.png)
* a ^ b
* Step 1 : identify binary rep of B and maintain the base (b as inital value),answer (init as 1)
* step 2 : right shift the binary of b until it becomes 0
  step 3 : multiply the current value of b with answer each time when right shift happens
  step 4 : double the value of base each time when right shift happens
* */
public class ValueOfAToPowerOfB {
    public static void main(String[] args) {
        long power = 62;
        long ans = 1;
        long base = 2;

        while(power > 0){
            var lastDig = power & 1;
            if((power & 1) == 1) { // we are omitting the calculation of 0(current last digit of binary of 6) * 2^3 as it will give 0 only
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }

        System.out.println(ans);
    }
}

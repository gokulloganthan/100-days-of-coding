package org.dsaPractice.Bitwise;

/*
*
* - Approach
  - 1st app
    - make right shift and identify last digit is 1 and keep counter to count total 1
  - 2nd
      - ![img_17.png](img_17.png)
      - ![img_18.png](img_18.png)
      - ![img_16.png](img_16.png)
* */
public class PowerOfTwoOrNot {

    public static void main(String[] args) {
        int num = 31;
        var isPowerOfTwo = (num & (num - 1)) == 0;
        System.out.println(isPowerOfTwo);
    }
}

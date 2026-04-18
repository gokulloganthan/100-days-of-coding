package org.dsaPractice.Bitwise;

//- ![img_7.png](img_7.png)
/*
Even or Odd
-   An number is said to odd or even depending on the last digit in binary
-   evry number after the first binary digit is going to be odd because 2 ^ anything * anything is always even
-   But 2 ^ 0 * odd (1) is 1 and 2^0 * even (0) is even
  - so any number binary representation last digit(LSB Least Significant Digit) is the deciding factor of an number to be odd or not
  - beacuse adding this to previous digits calculation completely changes the evenity /oddity of an no
* if n &(operation) 1 is equal to 1 then the number must be odd
  if n & 1 is not equal to 1 then it is even
* */
public class OddOrEven {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(findOddWithBitwiseAnd(n));
    }

    private static boolean findOddWithBitwiseAnd(int n) {
        return (n&1) == 1;
    }
}

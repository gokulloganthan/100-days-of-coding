package org.dsaPractice.Bitwise;
/*
* amazon
*
* 1 => 5  (001) => (0*5^3 + 0*5^2 + 1*5^1) => 5
* 2 => 25 (011) => (0*5^3 + 1*5^2 + 1*5^1) => 25
* 3 => 30
* 4 => 125
* 5 => 130
* */
public class MagicNumber {
    public static void main(String[] args) {
        int n = 4;
        int base = 5;
        int ans = 0;

        while ( n > 0){
            var lastDig = n & 1; // gives the last digit of the n in binary Eg: if last dig is 1 then 1& 1 gives 1 if n&1 is 0 then last digit is 0
            n = n >> 1;  // after getting last dig to know the next dig in binary format of no we are adding the zero at left most and omit the last rightmost dig eg: 011 -> 001(last 1 is omitited as only 8 dig can be accomodated in 1 byte) until no one is left
            ans += lastDig * base; // multiple last dig of number with base value
            base *= 5; //increement power of base value for each loop 5^1 -> 5^2 -> 5^3 ....
        }

        System.out.println(ans);
    }
}

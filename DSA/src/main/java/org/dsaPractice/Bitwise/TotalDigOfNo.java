package org.dsaPractice.Bitwise;

/*
* get the total digits of number in any base binary,decimal,hexademial,octal
*
* */
public class TotalDigOfNo {
    public static void main(String[] args) {
        int num = 10;
        int base = 2;

        //
        int form = (int) (Math.log(num) / Math.log(base)) + 1;

        System.out.println(form);
    }
}

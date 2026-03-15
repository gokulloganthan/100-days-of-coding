package org.dsaPractice.Recursion;

public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println(fb(4));
    }
    static int fb(int num){
        if(num < 2){
            return num;
        }
        return fb(num - 1) + fb(num - 2);
    }
}

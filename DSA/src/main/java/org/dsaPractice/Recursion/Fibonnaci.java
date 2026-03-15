package org.dsaPractice.Recursion;

public class Fibonnaci {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+":"+fbWithGoldenRule(i+1));
        }
    }
    static int fb(int num){
        if(num < 2){
            return num;
        }
        return fb(num - 1) + fb(num - 2);
    }

    //fibb with golden ratio
    public static int fbWithGoldenRule(int n){
        var alpha = ( 1 + Math.sqrt(5) )/2;
        return (int)((Math.pow(alpha,n)) / (Math.sqrt(5)));
    }
}

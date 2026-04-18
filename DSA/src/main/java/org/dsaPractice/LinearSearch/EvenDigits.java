package org.dsaPractice.LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {1,2273,45,-5337};
        int totalEvnDigNums = 0;

        for(int num : nums){
            int totalDig = getTotalDig(num);
            if(totalDig % 2 == 0) totalEvnDigNums++;
        }

        System.out.println(totalEvnDigNums);
    }

    private static int getTotalDig(int num) {
        int numb = Math.abs(num); //  if num is negative integer
        int cnt = 0;

        //normal approach 1 to find digits
        while(numb > 0){
            cnt ++;
            numb /= 10;
        }

        //fastest approach 2 to find digits
//        Scanner sc = new Scanner(System.in);
//        var res = (int) Math.log10(sc.nextInt()) + 1;
//        System.out.println(res);

        return cnt;
    }
}

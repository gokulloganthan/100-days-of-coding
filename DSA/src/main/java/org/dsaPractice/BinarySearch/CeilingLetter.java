package org.dsaPractice.BinarySearch;

//FIND SMALLEST CHARACTER LARGER THAN THE TARGET
public class CeilingLetter {
    public static void main(String[] args) {

        char[] a = {'c','f','j'}; //99,102,106
        char target = 'a'; //97

        //corner case to return first element when nothing found greater than target
//        char[] a = {'x','x','y','y'};
//        char target = 'z';
        System.out.println(ceilingLetterSearch(a,target));
    }

    private static char ceilingLetterSearch(char[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int middle = start + (end - start) / 2;

            if(arr[middle] > target){
                end = middle - 1;
            }else{
                start = middle + 1;
            }
        }
        return arr[start % arr.length]; //to return the starting element when nothing matches the condition
    }
}

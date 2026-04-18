package org.dsaPractice.Strings;

public class ModifyString {
    public static void main(String[] args) {

        //Creates and stores the string value in String pool @heap memory
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1);
        System.out.println(s1 == s2); //will point to the same string value stored location in string pool when value is same instead of duplicating the same value again in string pool

        //String & String objects are immutable by default
        String ss1 = new String("Hello");
        String ss2 = ss1;

        //Using String and String objects for each change in string characters the new object is created in the heap memory
        ss1 = ss1.replace('l','w'); // hewwo
        ss1 = ss1.replace('o','u'); //string "hewwo" in the heap memory becomes orphan and new string "hewwu" is created as new value in string pool in heap
        System.out.println(ss1);
        System.out.println("ss2 : "+ss2);

        //Using String builder for making String mutable and modifying it
        // Real use case : String builder helps us to modify the string stored in heap memory instead of creating new object in heap for every time we change the string value
        StringBuilder sb = new StringBuilder();

        sb.append("a");
        sb.append("b"); // string "a" in the heap memory is replaced with "b" leading to O(n) space complexity;

        System.out.println(sb);
    }
}

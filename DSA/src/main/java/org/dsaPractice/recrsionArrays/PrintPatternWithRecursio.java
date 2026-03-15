package org.dsaPractice.recrsionArrays;

import java.lang.*;

class PrintPatternWithRecursio
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		printInvStarPtrn(4,0);
		printStarPtrn(4,0);
	}
	
	static void printInvStarPtrn(int r,int c){
	    if(r == 0){
	        return;
	    }
	    
	    if(c < r){
	        System.out.print("*");
	        printInvStarPtrn(r,c+1);
	    }else{
	        System.out.println();
	        printInvStarPtrn(r-1,0);
	    }
	    
	}
	
	static void printStarPtrn(int r,int c){
	    if(r == 0){
	        return;
	    }
	    
	    if(c < r){
	        printStarPtrn(r,c+1);
	        System.out.print("*");
	    }else{
	        printStarPtrn(r-1,0);
	        System.out.println();
	    }
	    
	}
}

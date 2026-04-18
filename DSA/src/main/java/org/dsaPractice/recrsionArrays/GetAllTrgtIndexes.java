package org.dsaPractice.recrsionArrays;

import java.util.*;
import java.lang.*;
import java.io.*;

class GetAllTrgtIndexes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = new int[]{1,2,3,4,5,3};
		int target = 3;
		ArrayList<Integer> list = allOccofTrgtWORT(arr,target,0);
		System.out.print(list);
	}


	/*with arg and no return type*/
	public static void allOccofTrgt(int[] arr,int target,int i,List<Integer> indList ){
	    if(i == arr.length){
	        return;
	    }
	    if(arr[i] == target) indList.add(i);
	    allOccofTrgt(arr,target,i+1,indList);
	}

	/*w/o arg but reytun type of arr*/
	/*not optimized as creating new arrayList for every function call compared to allOccofTrgt() */
	public static ArrayList<Integer> allOccofTrgtWORT(int[] arr,int target,int i){
		ArrayList<Integer> list = new ArrayList<>();
		if(i == arr.length){
			return list;
		}
		if(arr[i] == target) list.add(i);
		ArrayList<Integer> answerFromPrevCalls= allOccofTrgtWORT(arr,target,i+1);
		list.addAll(answerFromPrevCalls);
		return list;
	}
}

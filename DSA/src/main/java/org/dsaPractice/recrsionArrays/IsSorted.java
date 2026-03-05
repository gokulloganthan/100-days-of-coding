package org.dsaPractice.recrsionArrays;

import java.util.*;
import java.lang.*;
import java.io.*;


class IsSorted
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = new int[]{1,2,3,4,5};
		System.out.print(binearSearch(arr,4,0,arr.length-1));
	}

	public static boolean isSorted(int[] arr,int start){
		boolean isInOrder = arr[start] <= arr[start + 1];
		if(start == arr.length - 2){
			return isInOrder;
		}
		return isInOrder && isSorted(arr,start+1);
	}

	public static int linearSearch(int[] arr,int target,int i){

		if(arr[i] == target) return i;

		if(i+1 == arr.length) return -1;

		return linearSearch(arr,target,i+1);
	}

	public static int binearSearch(int[] arr,int target,int start,int end){

		if(start > end){
			return -1;
		}

		int middle = start + (end - start) / 2;

		if(arr[middle] == target) return middle;

		if(arr[middle] > target) return binearSearch(arr,target,start,middle - 1);

		return binearSearch(arr,target,middle + 1,end);
	}
}

package org.dsaPractice.recrsionArrays;

import java.lang.*;
import java.util.Arrays;

class SortWithRecc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = new int[]{4,3,2,1};
		bubbleSortWithRecc(arr,arr.length - 1,0);
//		System.out.println(Arrays.toString(arr));

		//find max number in array
		int[] arr2 = new int[]{1,56,3,2,4};
//		System.out.println(findLrgstNoWithRecc(arr2,arr.length,0,0));

		selectionSortWithRecc(arr2,arr2.length,0,0);
		System.out.println(Arrays.toString(arr2));
	}

	static void selectionSortWithRecc(int[] arr,int row,int col,int max){
		if(row == 0) return;

		if(col < row){
			if(arr[col] > arr[max]){
				selectionSortWithRecc(arr,row,col+1,col);
			}else{
				selectionSortWithRecc(arr,row,col+1,max);
			}
		}else{
			int temp = arr[max];
			arr[max] = arr[row - 1];
			arr[row -1] = temp;
			selectionSortWithRecc(arr,row - 1,0,0);
		}
	}

	static void bubbleSortWithRecc(int[] arr,int r,int c){
	    if(r == 0){
	        return;
	    }
	    
	    if(c < r){
	        if(arr[c] > arr[c+1]){
	            int temp = arr[c];
	            arr[c] = arr[c+1];
	            arr[c+1] = temp;
	        }
	        bubbleSortWithRecc(arr,r,c+1);
	    }else{
	        bubbleSortWithRecc(arr,r-1,0);
	    }
	}


}

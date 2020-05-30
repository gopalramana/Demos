package com.brain.sotware;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class DiskSpaceAnalaysis {

	public static void main(String[] args) {
		
		 List<Integer> list = new LinkedList<Integer>(); 
	        list.add(1); 
	        list.add(2); 
	        list.add(4); 
	        list.add(9); 
	        list.add(8); 
	        list.add(0); 
	        System.out.println(segement(2,list));
	        
	  
	}
	
	public static int segement(int x, List<Integer> space) {
		
	
		Integer[] arr = new Integer[space.size()]; 
	    arr=space.toArray(arr);
	    
	    int beginindx=0;
		int y=space.size()-x;
		int[] finalarray=new int[y+1];
		int i=0;
		
		while(beginindx<=y) {
			
			Integer[] subarray =Arrays.copyOfRange(arr, beginindx, x);
			beginindx=beginindx+1;
			x=x+1;
			Arrays.sort(subarray);
			finalarray[i]=(Integer)Array.get(subarray, 0);
			i=i+1;
		}
	
		Arrays.sort(finalarray);
       return finalarray[finalarray.length-1];
	}
	
}

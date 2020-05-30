package com.brain.sotware;

public class Snippet {
	
	static int a[]={1,2,5,6,3,2};  
	static int b[]={44,66,99,77,33,22,55};  
	System.out.println(""+); 	
	
	

public static int getSmallest(int[] a, int[] B){  
	int temp;  
	for (int i = 0; i < a.length; i++)   
	        {  
	            for (int j = i + 1; j < a.length; j++)   
	            {  
	                if (a[i] > a[j])   
	                {  
	                    temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
	                }  
	            }  
	        }  
	       return a[0];  
	}
}


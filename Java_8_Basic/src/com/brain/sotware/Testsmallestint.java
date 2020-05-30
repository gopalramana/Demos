package com.brain.sotware;

import java.util.Arrays;
import java.util.List;

public class Testsmallestint {

	public static void main(String[] args) {
		
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55,2};  
		System.out.println("cc"+getSmallest(a,b)); 	

	}
	public static int getSmallest(int[] a, int[] b){  
		int temp;  
		
		List<int[]> alist=Arrays.asList(a);
		List<int[]> blist=Arrays.asList(b);
		int asmallest=0;
		int bsmallest = 0;
		
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
		            asmallest=a[0];  
		        }  
		
	
	for (int i = 0; i < b.length; i++)   
    {  
        for (int j = i + 1; j < b.length; j++)   
        {  
            if (b[i] > b[j])   
            {  
                temp = b[i];  
                b[i] = b[j];  
                b[j] = temp;  
            }  
        }  
        bsmallest=b[0];  
    }  
	
	if(alist.contains(bsmallest)&& blist.contains(asmallest)) 
	return bsmallest;
	else
	return -1;
		
	}
	
	
}
	
	
	
	
	  



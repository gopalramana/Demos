package com.brain.sotware;
import java.util.*;  
public class Example{  
    public static void main(String[] args) {       
       List<String> list=new ArrayList<String>();  
       list.add("Rick");         
       list.add("Negan");       
       list.add("Daryl");         
       list.add("Glenn");         
       list.add("Carl");                
       list.forEach(          
           // lambda expression        
           (name)->System.out.println(name)         
       );     
    }  
}
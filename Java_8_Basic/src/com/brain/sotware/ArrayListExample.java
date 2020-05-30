package com.brain.sotware;

import java.util.ArrayList;

public class ArrayListExample 
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>(2);
         
        list.add("A");
        list.add("B");
         
        //System.out.println(list);
         
       list.ensureCapacity(2);
         
        list.add("C");
        list.add("D");
        list.add("E");
 
        System.out.println(list);
    }
}
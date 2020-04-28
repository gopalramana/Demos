package com.brain.software.atm;

import java.util.LinkedList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		processStrings("ABC",null);

	}
    public static List<String> processStrings(String str1, String str2) {
        String op1="";
        String op2="";
        List<String> lststr=new LinkedList<String>();   

     if(str1!=null)
        for(int i=0;i<str1.trim().length();i++){
           if(str1!=null){
            char a=str1.charAt(i);
            if(str2!=null && !str2.contains(Character.toString(a))){
                op1=op1+Character.toString(a);
               }else if(str2==null){
                   op1=str1;
               }
           }
        }
       if(str2!=null)
        for(int j=0;j<str2.trim().length();j++){
           if(str2!=null){
            char a=str2.charAt(j);
            if(str1!=null && !str1.contains(Character.toString(a))){
                op2=op2+Character.toString(a);
               }else if(str1==null){
                   op2=str2;
               }
           }

   }

   lststr.add(op1);
   lststr.add(op2);
   System.out.println(lststr);

   return lststr;

}

}

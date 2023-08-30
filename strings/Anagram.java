package com.jsp.strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1="Race";
    String s2="Care";
    
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    //check if the length is same
    if(s1.length()==s2.length()) {
    	//convert strings to array
    char c1[]=s1.toCharArray();
    char c2[]=s2.toCharArray();
    //sort the char array
    Arrays.sort(c1);
    Arrays.sort(c2);
    //if the sorted array are same then
    //the string is anagram
    boolean result=Arrays.equals(c1,c2);
    
    if(result) {
    System.out.println(s1+ " and " +s2 +" are Anagram.");
    }else {
    	System.out.println(s1+ " and " +s2 +" are not Anagram.");	
    }
    }
    else {
    	System.out.println(s1 +" and "+s2 +" are not Anagram.");
    }
}
}
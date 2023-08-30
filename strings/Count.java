package com.jsp.strings;

public class Count {
   public static int countWords(String str) {
	   int count=1;
	   for(int i=0;i<str.length();i++) {
		   if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
			   count++;
		   }
	   }
	   return count;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="Hello Good Morning Students";
     System.out.println(countWords(s));  
	}

}

package com.jsp.strings;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="hello";
  
  for(int i=0;i<s.length();i++) {
	  for(int j=i+1;i<=s.length();j++) {
		  System.out.println(s.substring(i,j));
	  }
  }
}

}

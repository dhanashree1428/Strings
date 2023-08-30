package com.jsp.strings;

public class Reverse {
//	public static String reverseString(String s) {
//	String rev=" ";
//	for(int i=0;i<s.length();i++) {
//		rev=s.charAt(i)+rev;
//	}
//	return rev;
//	}
//	public static void main(String args[]) {
//		String s1="Hello Good Morning";
//		String s2="Dhanashree";
//		System.out.println(reverseString(s1));
//		System.out.println(reverseString(s2));
//		}
	
	public static String reverseWords(String str) {
		String rev=" ";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		return rev;
	}
	public static void main(String args[]) {
		String s1="Hello Good Morning";
		 System.out.println(reverseWords(s1));
	}
}

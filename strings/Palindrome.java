package com.jsp.strings;

public class Palindrome {
  public static boolean isPalindrome(String s) {
	 int low=0;
	 int high=s.length()-1;
	while(low<high)
		if(s.charAt(low)!=s.charAt(high)) {
			return false;
		}else {
			low++;
			high--;
		}
	return true;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1="MOM";
    System.out.println(isPalindrome(s1));
	}

}

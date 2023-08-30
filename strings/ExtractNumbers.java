package com.jsp.strings;

public class ExtractNumbers {
   public static int sumFromString(String str) {
	   String num=" ";
	   for(int i=0;i<str.length();i++) {
		   if(str.charAt(i)>='0' && str.charAt(i)<='9') {
			   num=num+str.charAt(i);
		   }
	   }
	   int n=Integer.parseInt(num);
	   return sumOfDigits(n);
   }
   public static int sumOfDigits(int n) {
	   int sum=0;
	   while(n>0) {
		   int temp=n%10;
		   sum=sum+temp;
		   n=n/10;
	   }
	   return sum;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="a12bc3d4";
   System.out.println(sumFromString(s));
	}

}

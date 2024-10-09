package com.dest.basics.Strings;

import java.util.Scanner;

public class StringSegregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1=sc.nextLine();
       String letters=" ";
       String digits=" ";
       String special=" ";
       for(int i=0;i<s1.length();i++) {
    	   if(s1.charAt(i)==' ') {
    		   continue;
    	   }
    	   if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'||s1.charAt(i)>='a' && s1.charAt(i)<='z' ) {
    		   letters=letters+s1.charAt(i);
    	   }
    	   else if(s1.charAt(i)>=48 && s1.charAt(i)<=57) {
    		   digits=digits+s1.charAt(i);
    	   }else {
    		   special+=s1.charAt(i);
    	   }
       }
       System.out.println("The letters in the string are: "+letters);
       System.out.println("The digits are: "+digits);
       System.out.println("The special characters are: "+special);
	}

}

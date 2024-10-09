package com.dest.basics.Strings;

import java.util.Scanner;

public class StringCode5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a string: ");
     String str=sc.nextLine();
     int spc=0;
     for(int i=0;i<str.length();i++) {
    	 if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
    		 spc++;
    	 }
     }
     System.out.println("the word count is= "+(spc+1));
	}

}

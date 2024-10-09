package com.dest.basics.Strings;

import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s1=sc.nextLine();
        checkPangram(s1);
        
        	if(checkPangram(s1)) {
        		System.out.println("Pangram");
        	}else {
        		System.out.println("not pangrams");
        	}
        		
        
	}

	private static boolean checkPangram(String s1) {
		boolean alphabet[]=new boolean[26];
		int index=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
	    		   continue;
	    	   }
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z') {
				index=s1.charAt(i)-'A';
				alphabet[index]=true;
			}
			else if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
				index=s1.charAt(i)-'a';
				alphabet[index]=true;
			}
		}
		for(boolean letterPresent:alphabet) {
			if(!letterPresent) {
				return false;
			}
		}
		return true;
		
	}
}


/*Enter a String: 
AaBbcdefghijklmnopqrstuvwxyz
Pangram
*/

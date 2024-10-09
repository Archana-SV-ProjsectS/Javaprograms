package com.dest.basics.Strings;

public class StringComp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Rama";
		String s2="rava";
		if(s1.compareToIgnoreCase(s2)==0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println(s1.compareTo(s2));
			System.out.println("Strings are not equal");
		}
		String s3=new String("rama");
		String s4=new String("Rava");
		if(s3.compareToIgnoreCase(s4)==0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println(s3.compareTo(s4));
			System.out.println("Strings are not equal");
		}
			}
}



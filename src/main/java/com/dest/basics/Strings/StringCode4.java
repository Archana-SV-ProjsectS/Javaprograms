package com.dest.basics.Strings;

import java.util.Scanner;
class VowelOperations{
	Scanner sc=new Scanner(System.in);
	void countVowelConsonant(String s) {
	int vowel_count=0;
	int consonant_count=0;
	System.out.println("Calculating the vowel and consonant count: ");
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u'||s.charAt(i)=='A'|| s.charAt(i)=='E'||s.charAt(i)=='I' || s.charAt(i)=='O'|| s.charAt(i)=='U') {
			vowel_count++;
		}else {
			consonant_count++;
		}
	}
	System.out.println("The vowel_count is: "+vowel_count);
	System.out.println("The consonant count is: "+consonant_count);
	}
	void lowerCaseVowels(String s) {
		int lower_vowel_count=0;
		System.out.println("Calculating the lower_vowel count: ");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u') {
				lower_vowel_count++;
			}
			}
		System.out.println("The lower case vowel_count is: "+lower_vowel_count);
	}
	void upperCaseVowels(String s) {
		int upper_vowel_count=0;
		System.out.println("Calculating the upper case vowel count: ");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'|| s.charAt(i)=='E'||s.charAt(i)=='I' || s.charAt(i)=='O'|| s.charAt(i)=='U') {
				upper_vowel_count++;
			}
			}
		System.out.println("The upper case vowel_count is: "+upper_vowel_count);
	}
	void replaceVowels(String s) {
		String temp=" ";
		System.out.println("Replacing all the vowels with special character");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u'||s.charAt(i)=='A'|| s.charAt(i)=='E'||s.charAt(i)=='I' || s.charAt(i)=='O'|| s.charAt(i)=='U') {
				temp=temp+'@';
			}
			else {
				temp=temp+s.charAt(i);
			}
		}
		System.out.println("The replaced String is: "+temp);
	}
	void replaceUpperVowels(String s) {
		String temp=" ";
		System.out.println("Replacing all the upper case vowels with special character");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'|| s.charAt(i)=='E'||s.charAt(i)=='I' || s.charAt(i)=='O'|| s.charAt(i)=='U') {
				temp=temp+'@';
			}
			else {
				temp=temp+s.charAt(i);
			}
		}
		System.out.println("The replaced String is: "+temp);
	}
	void replaceLowerVowels(String s) {
		String temp=" ";
		System.out.println("Replacing all the lower case vowels with special character");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u') {
				temp=temp+'@';
			}
			else {
				temp=temp+s.charAt(i);
			}
		}
		System.out.println("The replaced String is: "+temp);
	}
	void individualVowels(String s) {
		String temp=" ";
		System.out.println("Replacing all the individual case vowels with individual special character");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='A') {
				temp=temp+'@';
			}
			else if(s.charAt(i)=='e'|| s.charAt(i)=='E') {
				temp=temp+'#';
			}
			else if(s.charAt(i)=='i'|| s.charAt(i)=='I') {
				temp=temp+'$';
			}
			else if(s.charAt(i)=='o'|| s.charAt(i)=='O') {
				temp=temp+'&';
			}
			else if(s.charAt(i)=='u'|| s.charAt(i)=='U') {
				temp=temp+'*';
			}else {
				temp=temp+s.charAt(i);
			}
			
		}
		System.out.println("The replaced string is: "+temp);
	}
	
}
public class StringCode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
VowelOperations vo=new VowelOperations();
vo.countVowelConsonant(s);
vo.lowerCaseVowels(s);
vo.upperCaseVowels(s);
vo.replaceVowels(s);
vo.replaceUpperVowels(s);
vo.replaceLowerVowels(s);
vo.individualVowels(s);
	}

}





/*
 
Hi,GOOD Morning,Have a nice DAY
Calculating the vowel and consonant count: 
The vowel_count is: 11
The consonant count is: 20
Calculating the lower_vowel count: 
The lower case vowel_count is: 8
Calculating the upper case vowel count: 
The upper case vowel_count is: 3
Replacing all the vowels with special character
The replaced String is:  H@,G@@D M@rn@ng,H@v@ @ n@c@ D@Y
Replacing all the upper case vowels with special character
The replaced String is:  Hi,G@@D Morning,Have a nice D@Y
Replacing all the lower case vowels with special character
The replaced String is:  H@,GOOD M@rn@ng,H@v@ @ n@c@ DAY
Replacing all the individual case vowels with individual special character
The replaced string is:  H$,G&&D M&rn$ng,H@v# @ n$c# D@Y

*/
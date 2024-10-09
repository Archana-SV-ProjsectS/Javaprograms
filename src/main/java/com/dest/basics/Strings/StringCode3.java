package com.dest.basics.Strings;

public class StringCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="RajaRamMohanRoy";
System.out.println("Original String: "+s1);
System.out.println("UpperCase String: "+s1.toUpperCase());
System.out.println("LowerCase String: "+s1.toLowerCase());
System.out.println(s1.startsWith("Raja"));
System.out.println(s1.endsWith("Roy"));
System.out.println(s1.endsWith("Boy"));
System.out.println(s1.contains("Mohan"));
System.out.println(s1.contains("Rohan"));
System.out.println(s1.getClass());
System.out.println(s1.charAt(5));
System.out.println(s1.concat(s1));
System.out.println(s1);
System.out.println(s1.hashCode());
System.out.println(s1.indexOf('a'));
System.out.println(s1.indexOf('z'));
System.out.println(s1.isBlank());
String s2="      ";
System.out.println(s2.isBlank());
System.out.println(s2.isEmpty());
System.out.println(s1.lastIndexOf('a'));
System.out.println(s1.length());
System.out.println(s1.replace('a', '#'));
	}

}




/*

Original String: RajaRamMohanRoy
UpperCase String: RAJARAMMOHANROY
LowerCase String: rajarammohanroy
true
true
false
true
false
class java.lang.String
a
RajaRamMohanRoyRajaRamMohanRoy
RajaRamMohanRoy
1370129857
1
-1
false
true
false
10
15
R#j#R#mMoh#nRoy

*/
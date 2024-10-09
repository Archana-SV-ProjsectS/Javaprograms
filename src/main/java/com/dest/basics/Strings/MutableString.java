package com.dest.basics.Strings;

public class MutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1=new String("Rama");
       String s2=new String("Sita");
       s1.concat(s2); //direct changes are not reflected.
       s1=s1.concat(s2);//external push gets them merged.
       System.out.println(s1);
       
       StringBuffer sb1=new StringBuffer("Rita");
       StringBuffer sb2=new StringBuffer("Sita");
       sb1.append(sb2);
       System.out.println(sb1);
       
       StringBuilder sl1=new StringBuilder("Meera");
       StringBuilder sl2=new StringBuilder("bai");
       sl1.append(sl2);
       System.out.println(sl1);
       
       
       
	}

}

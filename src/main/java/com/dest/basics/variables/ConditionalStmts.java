package com.dest.basics.variables;

import java.util.Scanner;

public class ConditionalStmts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acc_no=123;
		int pwd=121;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the acc_no: ");
		int accno_new=sc.nextInt();
		System.out.println("Enter the password: ");
		int pwd_new=sc.nextInt();
		if(acc_no==accno_new) {
			if(pwd==pwd_new) {
				System.out.println("valid credentials");
			}else {
				System.out.println("invalid credentials");
			}
		}else {
				System.out.println("invalid account number");
			}
		
		sc.close();
	}

}

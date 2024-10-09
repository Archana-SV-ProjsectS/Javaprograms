package com.dest.basics.arrayCodes;

import java.util.Scanner;

public class Array2DMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Array2Dops ao=new Array2Dops();
System.out.println("Enter the class count: ");
int cls=sc.nextInt();
System.out.println("Enter the student count: ");
int stu=sc.nextInt();
ao.createArray(cls,stu);
ao.insertData( cls, stu);
ao.displayData( cls, stu);
	
	}

}

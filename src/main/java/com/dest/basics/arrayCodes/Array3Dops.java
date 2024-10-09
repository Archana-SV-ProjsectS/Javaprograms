package com.dest.basics.arrayCodes;

import java.util.Scanner;

public class Array3Dops {
public static int arr[][][];
public Scanner sc=new Scanner(System.in);
public void createArray(int sch,int cls,int stu) {
	arr=new int[sch][cls][stu];
}
public void insertData(int sch,int cls,int stu) {
	System.out.println("collecting student marks:");
	for(int i=0;i<sch;i++) {
		System.out.println("Inside school number: "+(i+1));
		for(int j=0;j<cls;j++) {
			System.out.println("Inside class number: "+(j+1));
			for(int k=0;k<stu;k++) {
				System.out.println("Enter student marks: "+(k+1));
				arr[i][j][k]=sc.nextInt();	
	}
}
	}
	System.out.println();
}
public void displayData(int sch,int cls,int stu) {
	System.out.println("displaying student marks:");
	for(int i=0;i<sch;i++) {
		System.out.println("Inside school number: "+(i+1));
		for(int j=0;j<cls;j++) {
			System.out.println("Inside class number: "+(j+1));
			for(int k=0;k<stu;k++) {
				System.out.println("The student marks: " +(k+1)+ "is= " +arr[i][j][k] );
}}
	}
	System.out.println();
}
}

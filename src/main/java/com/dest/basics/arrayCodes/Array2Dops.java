package com.dest.basics.arrayCodes;

import java.util.Scanner;

public class Array2Dops {

	public static String arr[][];
		public Scanner sc=new Scanner(System.in);
           public void createArray(int cls,int stu) {
        	   arr=new String[cls][stu];
           }
           public void insertData(int cls,int stu) {
        		System.out.println("collecting student names:");
        		for(int i=0;i<cls;i++) {
        			System.out.println("Inside class number: "+(i+1));
        			for(int j=0;j<stu;j++) {
        				System.out.println("Inside student name: "+(j+1));
        					arr[i][j]=sc.next();	
        		}
        	}
        		
        		System.out.println();
        	}
public void displayData(int cls,int stu) {
	System.out.println("displaying student names:");
	for(int i=0;i<cls;i++) {
		System.out.println("Inside class number: "+(i+1));
		for(int j=0;j<stu;j++) {
			
				System.out.println("The student name: " +(j+1)+ " is= " +arr[i][j] );
}}
	
	System.out.println();
}

	}



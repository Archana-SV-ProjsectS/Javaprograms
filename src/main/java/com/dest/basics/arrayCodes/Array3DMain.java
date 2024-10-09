package com.dest.basics.arrayCodes;
/*
 * school   class   student
 *   0       0        3
 *           1        3
 *   1       0        3
 *           1        3
 */
import java.util.Scanner;

public class Array3DMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Array3Dops ar=new Array3Dops();
System.out.println("Enter the school count: ");
int sch=sc.nextInt();
System.out.println("Enter the class count: ");
int cls=sc.nextInt();
System.out.println("Enter the student count: ");
int stu=sc.nextInt();
ar.createArray(sch,cls,stu);
ar.insertData(sch, cls, stu);
ar.displayData(sch, cls, stu);
	}

}

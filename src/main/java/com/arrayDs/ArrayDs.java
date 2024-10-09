package com.arrayDs;

import java.util.Scanner;

public class ArrayDs {
	static int choice;
	static void ops() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter array operations to perform :"
				+ "1.Creation of an array\n"
				+ " 2.Insertion of an array\n"
				+ "3. Display an array\n"
				+ "4 Update the element of an array\n"
				+"5. Delete the element of an array\n"
				+ "6.Exit");
		choice=sc.nextInt();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations ao=new ArrayOperations();
		ops();
		switch(choice) {
		case 1:{
			ao.createArray();
			ops();
		}
		case 2:{
			ao.insertToArray();
			ops();
		}
		case 3:{
			ao.DisplayArray();
			ops();
		}
		case 4:{
			ao.updateArrayData();
			ops();
		}
		case 5:{
			ao.deleteArray();
			ops();
		}
		default:
			System.out.println("Invalid choice: "+choice);
		}
	}

}

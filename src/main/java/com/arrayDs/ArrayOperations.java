package com.arrayDs;

import java.util.Scanner;

public class ArrayOperations {
public int arr[];
Scanner sc=new Scanner(System.in);
private int size;

public void createArray() {
	System.out.println("Enter the array data: ");
	size=sc.nextInt();
	arr=new int[size];
	System.out.println("Array is created");
	System.out.println("-------------");
}
public void insertToArray() {
	System.out.println("Enter the array data: ");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Data is inserted into the array: ");
}
public void DisplayArray() {
	System.out.println("the array data is: ");
	for(int i=0;i<size;i++) {
		System.out.println(arr[i]);
	}
}
	public void updateArrayData() {
		System.out.println("Enter the position where the new data to be replaced: ");
		int pos=sc.nextInt();
		if(pos<0 || pos>size) {
			System.out.println("Invalid position mentioned");
		}
		else {
			System.out.println("Enter the new element: ");
			int ele=sc.nextInt();
			arr[pos]=ele;
			System.out.println("data is updated into an array");
			DisplayArray();
		}
		}
	public void deleteArray() {
		
		}

	// TODO Auto-generated method stub

	}



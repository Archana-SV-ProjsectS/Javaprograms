package com.arrayDs;


import java.util.Scanner;

class BubbleSortAlgo{
	int arr[];
	int size;
	Scanner sc=new Scanner(System.in);
	public void CreateArray() {
		System.out.println("Enter an array size: ");
		size=sc.nextInt();
		arr=new int[size];
	}
	public void addElements() {
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array is created!");
	}
	public void sort() {
		System.out.println("sorting process is initiated...");
		int temp=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
	}
	void display() {
		System.out.println("The elements inside the array are: ");
		for(int i=0;i<size;i++) {	
	System.out.println(arr[i]);	
	}
	}
}
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      BubbleSortAlgo bs=new BubbleSortAlgo();
      bs.CreateArray();
      bs.addElements();
      bs.sort();
      bs.display();
	}

}





/*
 
 
Enter an array size: 
5
Enter the elements of an array: 
7 4 9 2 6
Array is created!
sorting process is initiated...
The elements inside the array are: 
2
4
6
7
9

*/
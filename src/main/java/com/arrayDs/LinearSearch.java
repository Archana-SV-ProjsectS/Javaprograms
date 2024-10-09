package com.arrayDs;

import java.util.Scanner;

class Linear{
	int arr[];
	int size;
	int flag=0;
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("Enter an array size: ");
		size=sc.nextInt();
		arr=new int[size];
		
	}
	void addElements() {
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
	}
	void Search() {
		System.out.println("Enter the element to be searched: ");
		int ele=sc.nextInt();
		for(int i=0;i<size;i++) {
			if(arr[i]==ele) {
				System.out.println("Element found in position number: "+(i+1));
				flag=1;
			}
			}
			if(flag<=0) {
				System.out.println("Element not found");
			}
		}
	}

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Linear ls=new Linear();
       ls.createArray();
       ls.addElements();
       ls.Search();
	}

}

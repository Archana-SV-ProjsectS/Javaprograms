package com.arrayDs;


import java.util.Arrays;
import java.util.Scanner;

class BinaryAlgo{
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
		Arrays.sort(arr);
		System.out.println("Array is sorted");
	}
	void Binary() {
		int first=0;
		int last=size-1;
		System.out.println("Enter the element to be searched: ");
		int key=sc.nextInt();
		while(first<=last) {
			int mid=(first+last)/2;
			if(arr[mid]==key) {
				System.out.println("Element found at position: "+(mid));
				flag++;
				break;
			}
			else if(arr[mid]<key) {
				first=mid+1;
			}
			else if(arr[mid]>key) {
				last=mid-1;
			}
		}
		if(flag<=0) {
			System.out.println("Element not found");
		}
	}
}
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryAlgo bs=new BinaryAlgo();
		bs.createArray();
		bs.addElements();
		bs.Binary();
	}

}

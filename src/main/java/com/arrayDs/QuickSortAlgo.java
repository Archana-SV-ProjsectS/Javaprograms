package com.arrayDs;

import java.util.Scanner;
class QuickSort{

	public void quickSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end) {
			int pivot=partition(arr,start,end);
			quickSort(arr,start,pivot-1);
			quickSort(arr,pivot+1,end);
		}
	}

	private int partition(int[] arr, int start, int end) {
		int pivot=arr[end];
		int i=start-1;
		
		for(int j=start;j<=end-1;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=temp;
		
		return(i+1);
	}
	
}
class ArrayOps{
	int arr[];
	int size;
	Scanner sc=new Scanner(System.in);
	public void CreateArray() {
		System.out.println("Enter an array size: ");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("Array is created!");
	}
	public void addElements() {
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array data is collected!");
	}
	void display() {
		System.out.println("Array elements are: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("----------");
	}
	void sorting() {
		
		QuickSort qs=new QuickSort();
		qs.quickSort(arr,0,size-1);
	}
}
public class QuickSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayOps ao=new ArrayOps();
ao.CreateArray();     
ao.addElements();
System.out.println("before sorting");
ao.display();
ao.sorting();
System.out.println("After sorting");
ao.display();
	}

}


/*

Enter an array size: 
5
Array is created!
Enter the elements of an array: 
25 75 60 84 40
Array data is collected!
before sorting
Array elements are: 
25 75 60 84 40 ----------
After sorting
Array elements are: 
25 40 60 75 84 ----------

*/

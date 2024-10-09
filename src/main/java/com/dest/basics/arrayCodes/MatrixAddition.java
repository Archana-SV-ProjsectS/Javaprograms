package com.dest.basics.arrayCodes;

import java.util.Scanner;

class MatrixOps{
	int arr1[][];
	int arr2[][];
	int res[][];
	Scanner sc=new Scanner(System.in);
	public void collectDataForArray1(int m1[][],int n) {
		arr1=m1;
		System.out.println("Collecting data for array1...");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr1[i][j]=sc.nextInt();

			}
		}
	}
	public void collectDataForArray2(int[][] m2, int n) {
		// TODO Auto-generated method stub
		arr2=m2;
		System.out.println("Collecting data for array2...");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr2[i][j]=sc.nextInt();

			}
		}
	}
	public void calculateProduct(int[][] res1, int n) {
		// TODO Auto-generated method stub
		res=res1;
		System.out.println("Calculate the Product");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
				
				res[i][j]=res[i][j]+(arr1[i][k]*arr2[k][j]);
				}
			}
		}
	}
	public void displayResult(int n) {
		// TODO Auto-generated method stub
		System.out.println("Display the result");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(res[i][j]+ " ");

			}
			System.out.println();
		}
		
	}


}
public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		int m1[][]=new int[n][n];
		int m2[][]=new int[n][n];
		int res1[][]=new int[n][n];

		MatrixOps mo=new MatrixOps();
		mo.collectDataForArray1(m1, n);
		mo.collectDataForArray2(m2, n);
		mo.calculateProduct(res1,n);
		mo.displayResult(n);
	}

}

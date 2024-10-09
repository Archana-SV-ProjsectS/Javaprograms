package com.dest.basics.arrayCodes;

import java.util.Scanner;
class Identityops{
	Scanner sc=new Scanner(System.in);
	public void createArray(int arr[][],int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
			}
	}
	public void displayArray(int arr[][],int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
			}
	}
	static boolean display(int arr[][],int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j && arr[i][j]!=1) { //0==0 ,arr[0][0]!=1
				return false;
				}	else if(i!=j && arr[i][j]!=0) {
					return false;
				}
			}
		}
		return true;
		
	}
	
}
public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		
int arr[][]=new int[n][n];
Identityops io=new Identityops();
io.createArray(arr, n);
io.displayArray(arr, n);
boolean result=Identityops.display(arr,n);
System.out.println(result);
sc.close();
	}

}





/*

Enter the array size: 
3
1
0
0
0
1
0
0
0
1
1 0 0 
0 1 0 
0 0 1 
true

*/

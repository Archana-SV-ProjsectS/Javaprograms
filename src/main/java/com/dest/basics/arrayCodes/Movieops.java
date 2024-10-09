package com.dest.basics.arrayCodes;

import java.util.Scanner;

public class Movieops {
	public static String arr1[][][];
	public static long arr2[][][];
	public static long arr3[];
	private long overall_revenue;
	private long lang_revenue;
	public static Scanner sc=new Scanner(System.in);
    
	public void createArray(int lang, int cat, int mov) {
		// TODO Auto-generated method stub
		arr1=new String[lang][cat][mov];
		System.out.println("Array to collect movie name is ready...");
		arr2=new long[lang][cat][mov];
		System.out.println("Array to collect movie revenue is ready..");
		arr3=new long[lang];
		System.out.println("Array to collect language based revenue is ready");
		}

	public void collectData(int lang, int cat, int mov) {
		// TODO Auto-generated method stub
		System.out.println("collecting the details");
		for(int i=0;i<lang;i++) {             
			 lang_revenue=0;
			System.out.println("Inside language: "+(i+1));    
			for(int j=0;j<cat;j++) {                         
			System.out.println("Inside category: "+(j+1));    
			for(int k=0;k<mov;k++) {                          
				System.out.println("Enter the name of the movie: "+(k+1));
				arr1[i][j][k]=sc.next();
				System.out.println("Enter the revenue made by the movie: "+(k+1));
				arr2[i][j][k]=sc.nextLong();
				overall_revenue+=arr2[i][j][k];
				lang_revenue+=arr2[i][j][k];
			}
			}
			arr3[i]=lang_revenue;
		}
	}

	public void displayData(int lang, int cat, int mov) {
		// TODO Auto-generated method stub
		System.out.println("Displaying the data");
		for(int i=0;i<lang;i++) {
			System.out.println("language "+(i+1));
			for(int j=0;j<cat;j++) {
				System.out.println("category "+(j+1));
				for(int k=0;k<mov;k++) {
					System.out.println("The name of the movie is "+arr1[i][j][k]);
					System.out.println("the revenue made by movie is "+arr2[i][j][k]);
				}
			}
		}
		
	}

	public void totalRevenue() {
		// TODO Auto-generated method stub
		System.out.println("the overall revenue made by movie is "+overall_revenue);
	}

	public void totalLanguageBasedRevenue(int lang) {
		// TODO Auto-generated method stub
		for(int i=0;i<lang;i++) {
			System.out.println("language based revenue "+(i+1)+ "is: " +arr3[i]);	
		}
		
	}

	public void checkProfitable(long invested_amt) {
		// TODO Auto-generated method stub
		
		if(invested_amt>overall_revenue) {
			System.out.println("the business is profitable");
		}
		else {
			System.out.println("the business is not profitable");
		}
	}
	
	

}











/*

Enter languages count: 
3
Enter categories count: 
3
Enter movies count: 
2
Enter overall invested amount: 
1000000000
Array to collect movie name is ready...
Array to collect movie revenue is ready..
Array to collect language based revenue is ready
collecting the details
Inside language: 1
Inside category: 1
Enter the name of the movie: 1
b
Enter the revenue made by the movie: 1
12000000
Enter the name of the movie: 2
abc
Enter the revenue made by the movie: 2
90000000
Inside category: 2
Enter the name of the movie: 1
dora
Enter the revenue made by the movie: 1
50000000
Enter the name of the movie: 2
bahu
Enter the revenue made by the movie: 2
150000000
Inside category: 3
Enter the name of the movie: 1
doll
Enter the revenue made by the movie: 1
30000000
Enter the name of the movie: 2
gf
Enter the revenue made by the movie: 2
50000000
Inside language: 2
Inside category: 1
Enter the name of the movie: 1
g
Enter the revenue made by the movie: 1
890000
Enter the name of the movie: 2
h
Enter the revenue made by the movie: 2
600000
Inside category: 2
Enter the name of the movie: 1
jan
Enter the revenue made by the movie: 1
1000000
Enter the name of the movie: 2
prince
Enter the revenue made by the movie: 2
3300000
Inside category: 3
Enter the name of the movie: 1
h
Enter the revenue made by the movie: 1
1000000
Enter the name of the movie: 2
f
Enter the revenue made by the movie: 2
200000
Inside language: 3
Inside category: 1
Enter the name of the movie: 1
life
Enter the revenue made by the movie: 1
8000000
Enter the name of the movie: 2
star
Enter the revenue made by the movie: 2
100000000
Inside category: 2
Enter the name of the movie: 1
stuart
Enter the revenue made by the movie: 1
30000000
Enter the name of the movie: 2
dalmations
Enter the revenue made by the movie: 2
70000000
Inside category: 3
Enter the name of the movie: 1
jailer
Enter the revenue made by the movie: 1
80000000
Enter the name of the movie: 2
kgf
Enter the revenue made by the movie: 2
90000000
Displaying the data
language 1
category 1
The name of the movie is b
the revenue made by movie is 12000000
The name of the movie is abc
the revenue made by movie is 90000000
category 2
The name of the movie is dora
the revenue made by movie is 50000000
The name of the movie is bahu
the revenue made by movie is 150000000
category 3
The name of the movie is doll
the revenue made by movie is 30000000
The name of the movie is gf
the revenue made by movie is 50000000
language 2
category 1
The name of the movie is g
the revenue made by movie is 890000
The name of the movie is h
the revenue made by movie is 600000
category 2
The name of the movie is jan
the revenue made by movie is 1000000
The name of the movie is prince
the revenue made by movie is 3300000
category 3
The name of the movie is h
the revenue made by movie is 1000000
The name of the movie is f
the revenue made by movie is 200000
language 3
category 1
The name of the movie is life
the revenue made by movie is 8000000
The name of the movie is star
the revenue made by movie is 100000000
category 2
The name of the movie is stuart
the revenue made by movie is 30000000
The name of the movie is dalmations
the revenue made by movie is 70000000
category 3
The name of the movie is jailer
the revenue made by movie is 80000000
The name of the movie is kgf
the revenue made by movie is 90000000
the overall revenue made by movie is 766990000
language based revenue 1is: 382000000
language based revenue 2is: 6990000
language based revenue 3is: 378000000
the business is profitable

*/

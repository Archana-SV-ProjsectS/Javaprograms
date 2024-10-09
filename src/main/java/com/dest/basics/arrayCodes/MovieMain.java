package com.dest.basics.arrayCodes;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter languages count: ");
          int lang=sc.nextInt();
          System.out.println("Enter categories count: ");
          int cat=sc.nextInt();
          System.out.println("Enter movies count: ");
          int mov=sc.nextInt();
          System.out.println("Enter overall invested amount: ");
          long invested_amt=sc.nextLong();
          Movieops mo=new Movieops();
          mo.createArray(lang,cat,mov);
          mo.collectData(lang,cat,mov);
          mo.displayData(lang,cat,mov);
          mo.totalRevenue();
          mo.totalLanguageBasedRevenue(lang);
		  mo.checkProfitable(invested_amt);
	}

}

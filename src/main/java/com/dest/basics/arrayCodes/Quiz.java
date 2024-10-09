package com.dest.basics.arrayCodes;

import java.util.Scanner;
class QuizApp{
	Scanner sc=new Scanner(System.in);
	public void initializeQuestions(String[][] questions,int n){
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the questions "+(i+1));
	    		  questions[i][0]=sc.nextLine();         
	    		  System.out.println("Enter the 4 options:");
	    		  for(int j=1;j<5;j++) {
	    		   questions[i][j]=sc.nextLine();
	    		 }
	    	  }
	}
	public void display(String questions[][],int n) {
		for(int i=0;i<n;i++) {
			System.out.println("question " +(i+1)+ ": "+questions[i][0]);
	    	  for(int j=1;j<5;j++) {
	    		System.out.println(j+". "+questions[i][j]);  
	    	  }
	      }
	}
	public void correctAnswers(int answers[],int n) {
		//Enter the correct answers for each question
		for(int i=0;i<n;i++) {
			answers[i]=sc.nextInt();
		}
	}
	public void checkAnswers(String questions[][],int n,int answers[],int correct,int total_amt) {
	for(int i=0;i<n;i++) {
		System.out.println("Enter your answer(1-4) or 0 to quit");
		int choice=sc.nextInt();
		if(choice==0) {
			break;
		}else if(choice<1 || choice>4) {
			System.out.println("invalid choice! Please enter correct choice");
			i--;
			continue;
		}
		
		int userAnswers=choice;
		if(userAnswers==answers[i]) {
			System.out.println("correct answer!");
			System.out.println("you have won Rs." +getPrize(correct));
			correct++;
			total_amt=getPrize(correct);
		}else {
			System.out.println("Wrong answer!The correct answer was: "+answers[i]);
		}
		}
	System.out.println("your total winning amount is Rs."+total_amt);
	}
	private int getPrize(int correct) {
		int prizes[]= {100,200,300,400,500,600,700,800,900,1000};
		if(correct>=0 && correct<prizes.length) {
			return prizes[correct];
		}else {
		return 0;
		}
	}
}
public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Quiz competition..");
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your name");
       String name=sc.next();
       System.out.println("Enter number of questions: ");
       int n=sc.nextInt();
      String questions[][]=new String[n][5];
      int[] answers=new int[n];
      QuizApp qa=new QuizApp();
      qa.initializeQuestions(questions,n);
      qa.display(questions,n);
      qa.correctAnswers(answers,n);
      int correct=0;
      int total_amt=0;
      qa.checkAnswers(questions, n, answers,correct,total_amt);
      System.out.println("Thank you for attending the assessment");
      
      sc.close();
	}

}

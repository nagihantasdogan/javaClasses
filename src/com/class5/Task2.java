package com.class5;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		//Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
		//if the average score >=90 → grade=A
		//if the average score >= 70 and <90 → grade=B
		//if the average score>=50 and <70 → grade=C
		//	if the average score<50 → grade=F
Scanner scan;
int quiz , midTerm, finalScore, average;
  scan=new Scanner(System.in);
  System.out.println("Enter your quiz score");
  int quiz1=scan.nextInt();
  
  System.out.println("Enter your mid term score");
  int midTerm1=scan.nextInt();
 
  System.out.println("Enter your final score");
  int finalScore1=scan.nextInt();
 
  int average1=(quiz1+midTerm1+finalScore1)/3;
  
  if(average1>=90) {
	  System.out.println("You got a A");
  }else if(average1<90 && average1>=70) {
	  System.out.println("You got a B");
  }else if(average1<70 && average1>=50) {
	  System.out.println("You got a  C");
  }else if(average1<50) {
	  System.out.println("You got a F");
  }else {
	  System.out.println("unknown");
  }
  
  
  
	  
	  
	  
  
	}
	

}




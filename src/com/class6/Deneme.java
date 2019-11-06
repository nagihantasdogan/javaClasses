package com.class6;
import java.util.Scanner;
public class Deneme {
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Do you need a loan?");
	boolean loan=true;
	if(!loan) {
		System.out.println("Unknown");
	}else {
		System.out.println("What is your ceredit score?");
	}
	int score;
	score=scan.nextInt();
	String eli;
	eli=scan.nextLine();
	if(score<600 ) {
		eli="Not eligible";
	}else if(600> score&& score <700) {
	eli="Maybe eligible";	
	}else if(score>701 && score<800) {
		eli="Eligible";
	}else if(score>800) {
		eli="Definitly eligible";
	}
		
	System.out.println("The eligibity is " + eli);
		
		
	
		
		
		
		
		
		
		
		
	}
}



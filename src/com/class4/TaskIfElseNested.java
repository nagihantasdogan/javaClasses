package com.class4;

public class TaskIfElseNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean diploma=true;
double score=3.8;
if(diploma) {
	System.out.println("Congratulations!!!");
	if(score>=3.5) {
		System.out.println("You are eligible for scholarship");
	}else {
		System.out.println("You should have studied harder");
	}
	
}else {
	System.out.println("you should get a deggree");
}


	}
	

}

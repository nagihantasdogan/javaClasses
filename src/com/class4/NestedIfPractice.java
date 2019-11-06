package com.class4;

public class NestedIfPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isFriday=true;
		int day=13;
		//if today is friday only day I want to check if it day is 13
		if (isFriday) {
			System.out.println("today is friday");
			if(day==13) {
				System.out.println("I will watch scary movie");
			}
		}else {
			System.out.println("today is not friday");
		}
		

	}

}

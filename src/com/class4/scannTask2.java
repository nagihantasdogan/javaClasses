package com.class4;

import java.util.Scanner;

public class scannTask2 {

	public static void main(String[] args) {
		java.util.Scanner keyboard=new Scanner(System.in);
		System.out.println("Please enter customer age");
		int age=keyboard.nextInt();
		if(18>age) {
			System.out.println("you will issue a driver licence");
		}else {
			System.out.println("you will offer them to get a learner permit");
		}
		
	

	}

}

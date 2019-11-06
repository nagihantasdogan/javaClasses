package com.class4;

import java.util.Scanner;

public class ScannTask {
	public static void main(String[]args) {
		java.util.Scanner keyboard =new Scanner(System.in);
		System.out.println("Please enter loan");
		int loan=keyboard.nextInt();
		if(loan<200000) {
			System.out.println("you will lend the money");
		}else {
			System.out.println("you will recejt the client");
			
		}
		
	}
	
	
	

}

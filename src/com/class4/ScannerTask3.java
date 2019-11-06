package com.class4;

import java.util.Scanner;

public class ScannerTask3 {

	public static void main(String[] args) {
		java.util.Scanner scan=new Scanner(System.in);
		System.out.println("please enter your city ");
		int temp=scan.nextInt();
		System.out.println("please enter temparature");
		String cityName=scan.nextLine();
		int convertedTemp=(temp-32)*5/9;
		System.out.println(" The temperature in city "+cityName +"is"+ convertedTemp);
		
		
		
		
		

	}

}

package com.class4;

public class TaskIFElseNested2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double rate=4.3;
		long price=200000;
		if(rate>4.5) {
			System.out.println("I will not buy a house");
		}else {
			System.out.println("I will buy a house");
			if(price>200000){
				System.out.println("I wýll takee a loan");
			}else {
				System.out.println("I will pay cash");
			}
					}
	
	}

	
}

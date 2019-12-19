package com.class16;

public class IQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//take range of number from 2 to 100 and print all prime
		//2,3(2,3),4(2,3,4),5(2,3,4,5),6(2,3,4,5,6)
		
		int num=5;
		boolean isPrime=true;
		if(num ==0 || num==1) {
		
		}else {
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
			}
		}
		if(isPrime) {
			System.out.println(num+" The number is prime");
		}else {
			System.out.println(num+" The number is not prime");
		}
		
		
		
		
		
		
		
		
	}

}

package com.class7;

public class WhileLopopPractice {

	public static void main(String[] args) {
		//how to print numbers from 1 to 20
		
		int i=0;
		while(i<=20) {
			System.out.println(i);
			i++;
		}
		//ý want to print numbers from 10 to 30 all 1 line
	int y=10;
	while(y<=30) {
		System.out.print(y+" ");
		y++;
	}
	//how to print values 10 to 1
	int a=10;
	while(a>=1) {
		System.out.println(a);
		a--;
	}
	//print values from 50 to 20
	
	int x=50;
	while(x>=20) {
		System.out.println(x);
		x--;
	}
	System.out.println("****************************");
	//I want to print all even number fron 1 to 20 inclusive
	//1 way-->increment value by 2
	int z=2;
	while(z<=20){
		System.out.println(z);
		z+=2;
	}
	//2 way using modulus
	int q=1;
	while(q<=20) {
		if(q%2==0) {
			System.out.println(q);
		}
		q++;//it has to  be under
			}
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	
	
	
	//print only odd number from 50 to 100
	//print only even num from 100 to 1
	
	int n=50;
	while(n<=100) {
		if(n%2!=0) {
			System.out.println(n);
		}
		n++;
	}
	System.out.println("*************************");
	int m=100;
	while(m>=1) {
		if(m%2==0) {
			System.out.println(m);
		}
		m--;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

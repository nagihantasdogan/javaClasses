package com.class8;

public class Task {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			System.out.print(i);
		}
		System.out.println("*********************");
		for(int i=100; i>=1; i--) {
			System.out.println(i);
			
		}
		System.out.println("***********************");
		for(int i=20; i>=1;  i-=2) {
			System.out.println(i);
		}
		System.out.println("***********************");
		for(int i=21; i<=49; i+=2) {
		
			System.out.println(i);
		}
	//////////////////////////////////////////////////////////////////////////////	
		
		for(int i=21; i<=50; i+=2) {
			System.out.println(i);
		}
		
		//2 way
for(int i=20; i<=50; i++) {
	if(i%2!=0)
		System.out.println(i);
	//what is output
	
	int sum=0;
	for(int i1=1; i1<=5; i1++) {
		sum=sum+i1;
	}
	
	System.out.println(sum+"+");	//yazzz
}
System.out.println("*****************************************************************");
//what is the output
int sumAll=0;
for(int i=0; i<=20; i+=5) {// 0,5,10,15
	sumAll=sumAll+i;
}

System.out.println(sumAll);

//what is output
int total=2;
for(int y=1; y<=3; y++) {
	total=total*y;//2=2*1; 4=2*2; 12=4*3
}
System.out.println(total);
//






























	}

}

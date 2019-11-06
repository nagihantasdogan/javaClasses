package com.class7;
import java.util.Scanner;
public class HomeWork2 {

	public static void main(String[] args) {
		// you neeed to ask user to pay for coffe
		//you need to keep asking user to pay for it until entered price is eqaul =5;
		//after user paid then say "enjooy your coffe"
Scanner scan=new Scanner(System.in);

int price;
do {
	System.out.println("pay your coffe");
	 price=scan.nextInt();	
}while(price!=5) ;
System.out.println("enjoy  your coffe");
//2 way to while
int price1;
System.out.println("please pay   your coffe");
price1=scan.nextInt();
while(price1!=5) {
	System.out.println("please pay  your coffe");
	price1=scan.nextInt();
	
}
System.out.println("enjoy  your coffe");
}

		
		
		
		
		
		
			
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		


}

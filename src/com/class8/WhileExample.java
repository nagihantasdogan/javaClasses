package com.class8;
import java.util.Scanner;
public class WhileExample {

	public static void main(String[] args) {
		
		/*lets ask user to enter if it is raining or not (trye or false)
		 * as long as there is rain lets tell user to "take an umberlla" 
		 * as soon as there is no train-->you can go to the park 
		 */
		
Scanner scan;
boolean isRain;
scan=new Scanner(System.in);
do {
System.out.println("is it raining?");
isRain=scan.nextBoolean();


}while(isRain);
		
System.out.println("go to the park");
		
		
		
		
		
		
		
	}

}

package com.class5;
import java.util.Scanner;
//to import short cut is ctr+shift+o--->windows
//to ,mport mac cmd+shift+o
public class MoreLogicalExamples {

	public static void main(String[] args) {
	/*ask user to enter  daily sales 
	 * based on the sales range we want to gives comiision to the person
	 * if  sales is <100-->commssion is %10
	 * if sales if between  100-200-->commssion of %20
	 * etc
	 */ 
Scanner scan;
double salesAmount;
double commisson;

scan=new Scanner(System.in);
System.out.println("Please enter you sales amount");
salesAmount=scan.nextDouble();

if(salesAmount<100) {
	//lets gives user %10 comms of sale
	commisson=salesAmount*0.1;
}else if(salesAmount>=100 && salesAmount<200){
	commisson=salesAmount*0.2;	
}else if(salesAmount>=200 && salesAmount<500) {
	commisson=salesAmount*0.3;
}else if(salesAmount>=500) {
	commisson=salesAmount*0.5;
}else {
		commisson=0;
		
}
System.out.println("Based on the sales your commisson " + commisson);
	}
	

}

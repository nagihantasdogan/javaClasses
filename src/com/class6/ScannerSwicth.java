package com.class6;
import java.util.Scanner;
public class ScannerSwicth {

	public static void main(String[] args) {
		
		/*ask user where they are from
		 * based on the country we will specify favorite food 
		 */

		String country,foodName;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Please Enter your country");
		country=scan.nextLine();
		switch (country){
			
		case "Turkey":
		foodName="kebab";
		break;
		case "ethiopya":
	    foodName="Tibs";
	    break;
		case "morocco":
			foodName="Tajin";
			break;
		case "Kazakstan":
			foodName="Kumis";
			break;
		case "Pakistan":
			foodName="Beryani";
			break;
		case"Russia":
			foodName="Caviar";
			break;
		case "cuba":
			foodName="Sofrito";
			break;
		default:
			foodName="Unknown";
			
	}
		System.out.println("You are from");
		
	}//YAZZ

}

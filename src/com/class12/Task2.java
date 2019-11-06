package com.class12;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Accept username, password and confirmpassword and check following requirements:
		//1.Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
		//2.Password should be minimum 8 characters, if  less → message=”Password is too short”.
		//3.Password cannot contain username if so, →message=”Password cannot contain username”.
		//4.Password should match confirmed password, if not  → message=“Passwords do not match”.
		//Only after all requirements met → message“Your username and password has been created”
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please Enter Username");
		String userName=scan.nextLine();
		System.out.println("Please Enter Password");
		String passWord=scan.nextLine();
		System.out.println("Please Enter Confirm");
		String confirm=scan.nextLine();
		boolean isEmpty=true;
		
		 if(userName.isEmpty() && passWord.isEmpty()) {
			 System.out.println("Username and password cannot be empty");
		 }else if(passWord.length()<8) {
			 System.out.println("Password too short");
		 }else if(passWord.contains(userName)) {
			 System.out.println("Password cannot contain user name");
		 }else if(passWord.equals(userName)) {
			 System.out.println("Password dont match");
		 }else {
			 System.out.println("Username and Password has been created");
		 }
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}

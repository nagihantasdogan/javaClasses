package com.class28;

public class User {
/*Write program: userClass  that has a constructor
 *  that initializes name and mobile number instance variables.
 *  Create a subclass  userInfo that will have user 
 *  address variable and it also being initialized through constructor call. 
 * Print users name, mobile number and address in userDetails method. Test your code.
 * 
 */

String name;
int number;
 
   User(String name,int number){
	   this.name=name;
	   this.number=number;
   }

  

public static void main(String[]args) {
	
	Info obj=new Info("Nagehan",12345678,"DC");
	obj.DisplayInfo1();
	
}

}
class Info extends User{
String address;
	Info(String name, int number,String address) {
		super(name, number);
		this.address=address;
		
	}
	public void DisplayInfo1() {
		System.out.println("Name is : "+name+" number is :"+number+" address is: "+address);
	}
	
	
}

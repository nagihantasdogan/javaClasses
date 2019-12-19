package com.class18;
import java.util.Scanner;
public class BulitAndUserDefineMethods {

	public static void main(String[] args) {
		// built in
		String str="Hello";
		str=str.replace("Hello", "Hi");
		System.out.println(str);
		
		
	Scanner scan=new Scanner(System.in);
	String scannerString=scan.nextLine();
	System.out.println(scannerString);
	BulitAndUserDefineMethods obj=new BulitAndUserDefineMethods();
	obj.myMethod();
		}
void myMethod() //method header
{//method body
System.out.println("This is user ddefine method that i createdi");
		}
		
		
}
///yazmadi tekrar bak
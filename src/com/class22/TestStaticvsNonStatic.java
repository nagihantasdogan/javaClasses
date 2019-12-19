package com.class22;

public class TestStaticvsNonStatic {

	public static void main(String[] args) {
		/*how to accsess static members 
		 * they can be accssesed by className
		 * 
		 */
		
		
		System.out.println(StaticVsNonStatic.school);
		StaticVsNonStatic.getInfo1();
		
		
		/*how to accsses non static members they can be
		 * accssed by creating an
		 * object of that class
		 * 
		 */

		StaticVsNonStatic obj=new StaticVsNonStatic();
		obj.name="John";
		obj.grade='A';
		obj.getInfo();
		//obj.getInfo1(); possible ,not preferable
		
	}

}

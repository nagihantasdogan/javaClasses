package com.class2;

public class AritmhmeticOperations {
	public static void main(String[] args) {

		/*declare 2 variable and initilazie them display result 
		 * of addition ,subtractoin,multiplication and divison 
		 */
		
		int num1, num2;
		num1=20;
		num2=10;
		 System.out.println(num1+num2); //30
		 System.out.println(num1-num2);//10
		 System.out.println(num1*num2);//200
		 System.out.println(num1/num2);//2
		 
		 System.out.println(num1+","+num2);
		 
		 //how can be print value of num 1 and num2 together
		
		int sum= num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;	
		//the addition/sub/div of 2 number is....
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult); 
		System.out.println(div); 
		
		num1=40;
		num2=20;
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1/num2);
		System.out.println(num1*num2);
		
		num1=40;
		num2=20;
		System.out.println(" The addition of 2 number "+num1+" and " +num2+"is equal to "+"60");
		System.out.println("The subtract of 2 number "+num1+" and "+num2+" is equal to "+" 20");
	
		double a1=3.9;
		double b1=3.9;
		double mult1 = a1*b1;
				System.out.println(mult1);		
		
		int width=5;
		int height=8;
		
		
		int area=width*height;
		int perimeter=2*(width+height);
		//the perimeter of a rectangle with width.......
		//and height.a1..a1.is equal to ..and the area is ...
		System.out.println("the perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area);
		
				String message="The perimiter of rectangle with width"+width+"and height"+height+"is equal to"+perimeter+"and the is "+area;
				
						System.out.println(message);			
				
				
				
				
				
				
				
				
				
				
				
				
		
		 
}
}
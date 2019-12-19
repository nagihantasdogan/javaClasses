package com.class17;

public class ObjectOfCarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to create an object syntax is 
		//ClassName variable=new ClassName();
		
	//	Scanner scan=new Scanner(System.in);
		
		//String str=new String();
		
		Car car1=new Car();
		car1.make="Tesla";
		car1.model="S";
		car1.year=2020;
		car1.color="Black";
		car1.wheels=4;
		car1.windows=5;
        car1.speed=200;
        //accessing behavior for 1 ob
        car1.start();//calling method classs car
        car1.drive();
        car1.accelarate();
		System.out.println("________________________");
		Car car2=new Car();

    car2.make="BMW";
    car2.model="i8";
    car2.year=2019;
    car2.color="purple";
    car2.wheels=3;
    car2.windows=6;
	car2.speed=600;	
		
		//print features of the car
		//i have black tesla
		System.out.println("I have "+car1.color+" "+car1.make);
		//I drive bmw 2019
		System.out.println("I drive "+car2.make+" "+car2.year);
		
		System.out.println("I drive "+car2.make+" "+car2.year);
		//Bus bus1=new Bus();
	}

	
}

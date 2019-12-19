package com.class17;

public class ObjectOfDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a Dog Class and create 3 different
		//objects of it: Husky, Bulldog, Labrador 
		//with specific attributes and behaviours.


		Dog Husky=new Dog();
		
		Husky.color="Yellow";
		Husky.name="Hachi";
		Husky.old=12;
		Husky.weigth=30;
		Husky.height=3;
		Husky.type="Husky";
		
		Dog BullDog=new Dog();
		BullDog.color="Black";
		BullDog.name="Woo";
		BullDog.old=8;
		BullDog.weigth=50;
		BullDog.height=4;
		BullDog.type="Bulldog";
		
		Dog Labrador=new Dog();
		
		Labrador.color="White";
		Labrador.name="jii";
		Labrador.old=14;
		Labrador.weigth=78;
		Labrador.height=4;
		Labrador.type="Labrador";
		System.out.println("I have "+Labrador.color+" "+Labrador.type);
		
		
	}

}

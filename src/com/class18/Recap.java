package com.class18;

public class Recap {
	int students,teachers,classRooms;

	String name,address,wesite;

	void study(){
		
	System.out.println("Studying at "+name);

	}

	void teach(){
		System.out.println("Teacher  teaching at at "+name);
	}

	public static void main(String[]args){

	Recap school=new Recap();
	school.name="Syntax";
	school.students=200;
	 Recap school1=new Recap();
	school1.name="Pinacle";
	school1.students=150;

	school1.teach();
	school1.study();
		
	}



	}






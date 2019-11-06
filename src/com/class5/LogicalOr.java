package com.class5;

public class LogicalOr {
	public static void main(String[] args) {
		//7 days a week
		//if day is 2 or 4 -->>sdlc class
		//if day is 1 or 5 -->no class
		//if 6 or 7-->java class
		//if day =3---> review class
		
		int day =6;
		if (day==2 || day==4) {
			System.out.println("SDLC class");
		}else if (day==6|| day==7) {
	            System.out.println("Java Class");
	            // false or false-->false
	        }else if(day==1 || day==5) {
	            
	        System.out.println("No Class");
	        }else if (day==3) {
	        System.out.println("Review Class");
	        }else {
	        System.out.println("Not a valid day");
		}
		
		//7 days a week
				//if day is Tuesday or thursday -->>sdlc class
				//if day is saturday  or sunday -->no class
				//if monday or friday-->java class
				//if day is wednasdy---> review class
	String weekDay="Sunday";
	if(weekDay.equals("Tuesday")|| weekDay.equals("Thursday") ) {
		System.out.println("SDLC Class");
	}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")  ) {
		System.out.println("java class");
	} else if (weekDay.equals("monday")  || weekDay.equals("friday")) {
		System.out.println("no class");
	}else if(weekDay.equals("wednesday")) {
		System.out.println("Review day");
	}else {
		System.out.println("Not a valid day");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
				
		
		
	}

}

package com.class5;

public class TaskAndOr {
	public static void main(String []args) {
		
		int day=5;
		
		    if (day>=1 && day<=5) {
		    	System.out.println("it is aweek day ");
		    }else if (day==6 && day==7) {
		    	System.out.println("it is a weekend");
		    
		    }else {
		    	System.out.println("invalid day ");
		    }
		    
		    
		    int height=9;
		    
		    if (height<5 ) {
		    	System.out.println("The man is short");
		    }else if (height>=5 && height<=6) {
		    	System.out.println("The man is medium");
		    
		    } else if(height>6) {
		    	System.out.println( "The man is tall");
		    }
		    
		    
	}
	

}

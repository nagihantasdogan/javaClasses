package com.class19;

public class Task {

	public static void main(String[] args) {
		/*1.Create a method createEmail(). Based on provided users name,
		 *  lastName and email type, your method should return complete email Address. 
		 *  Example: johnsnow@gmail.com or johnsnow@yahoo.com*
          */
       Task t=new Task();
        String eMail=t.createEmail("nagihan","tasdogan","gmail");
      System.out.println(eMail);
	}
	
	String createEmail(String name,String lastName,String emailType) {
		String eMail=name+lastName+"@"+emailType+".com";
		return eMail;
		
	
		
		
		
		
		
		
		
		
		
		
		
	}	
	}
	


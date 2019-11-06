package com.class10;

public class Task4 {
	public static void main(String[]  args){
		
		//Create an array of countries. While retrieving all values
		//from an array print capital for each country.
		
		
	String[] countries= {"Turkey","France","UK"};
		
		for(int i=0; i<countries.length; i++) {
			if(countries[i].equals("Turkey")) {
				System.out.println("Ankara");
			}else if(countries[i].equals("France")) {
				System.out.println("Paris");
			}else if(countries[i].equals("UK")) {
				System.out.println("London");
			}else {
				System.out.println(countries[i]);
			}
		}
	    
		
	/*	String[] countries1= {"Afghanistan", "Colombia","USA", "Russia", "Turkey"};​
				for(int i=0; i< countries1.length; i++) {
					
					if(countries1[i].equals("USA")) {
						System.out.println("Washington DC");
				}else if(countries1[i].equals("Russia")) {
						System.out.println("Moscow");
					}else if(countries1[i].equals("Turkey")) {
						System.out.println("Ankara");
					}else if(countries1[i].equals("Afghanistan")) {
						System.out.println("Kabul");
					}else if(countries1[i].equals("Colombia")) {
						System.out.println("Bogota");
					}
				}
		
		
		  //   String[] countries1 = { "Turkey", "Germany", "Italy", "Brazil" };
	            for (String country : countries1) {
	                switch (country) {
	                case "Turkey":
	                    System.out.println("Ankara");
	                    break;
	                case "Germany":
	                    System.out.println("Munich");
	                    break;
	                case "Italy":
	                    System.out.println("Rome");
	                    break;
	                case "Brazil":
	                    System.out.println("Brasil");
	                    break;
	                }
	            }
		
		*/
		
		
		
	}
	

}

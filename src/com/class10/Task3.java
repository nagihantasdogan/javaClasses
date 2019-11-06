package com.class10;

public class Task3 {

	public static void main(String[] args) {
		// Create an array of words: Java, Saturday, day, coding, is.
		//Print the following sentence using element of array: “Saturday is Java coding Day”. 
		String[] names=new String[5];
		names[0]="Java";
		names[1]="Saturday";
		names[2]="is";
		names[3]="coding";
		names[4]="Day";
		
		System.out.println(names[1]+" "+names[2]+" "+names[0]+" "+names[3]+" "+names[4]);
	}

}

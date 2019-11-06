package com.class11;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a 2D array of integer type with 3 rows and 4 columns 
		//and print all values of the whole array.
		
		int[][] numbers= {
				{1,2,3,4},
				{2,4,6,8,},
				{3,6,9,12}
		};
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print( numbers[i][j]+" ");
				
			}
			System.out.println( );
			
		}
	}

}

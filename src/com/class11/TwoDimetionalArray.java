package com.class11;

public class TwoDimetionalArray {

	public static void main(String[] args) {
		// declare 2D array
	
int[][]array= new int[3][4];// 3 rows and 5 colomns
        
        //1st Row
        array [0][0]=45;
        array[0][1]= 80;
        array [0][2]=33;
        array [0][3]=20;
        
        //2nd row
        
        array [1][0]=90;
        array[1][1]= 87;
        array [1][2]=43;
        array [1][3]=33;
        //3rd Row
        array [2][0]=90;
        array[2][1]= 65;
        array [2][2]=11;
        array [2][3]=97;
        System.out.println(array[1][3]);
		
		//task :create 2D array of String with 2 and 3 columns
		String [][] name=new String[2][3];
		name[0][0]="meghan";
		name[0][1]="esra";
		name[0][2]="nur";
		
		name[1][0]="john";
		name[1][1]="tony";
		name[1][2]="jack";
		System.out.println(array[0][1]);
		
		
		int [] []number= {
				{8,7,5,3,8},
				{1,5,6,4,9},
				{3,6,8,0,7}
				
		};
		
		  System.out.println("The value in index 1 and 4 is="+number[1][4]);
	        
	        //To identify the numbers of Rows
	        System.out.println("The numbers of Rows are:= "+number.length);
	        
	        //To identify the numbers of Columns/elements in that row
	        System.out.println("The numbers of Rows are:= "+number[0].length);
	        System.out.println("========================================================");     
	
	for(int i=0; i<number.length; i++) {
	for(int j=0; j<number[i].length; j++) {
	
		System.out.print(number[i][j]+"");
	}
			
	System.out.println( );
	
	
	
	}
	
	
	
	
	}	
	
	
	
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	



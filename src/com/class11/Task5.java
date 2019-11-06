package com.class11;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
		//Develop a program which will identify/print the even numbers only.
		
		int [][]num= {
				{2,4,6,8},
				{1,3,5,7},
				{5,10,15,20}
		};
		int sum=0;
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				sum+=num[i][j];
			}
          System.out.println();
		}
		
		System.out.println("The sum of all elements in the array is= "+ sum);
		int sum1=0;
		for(int nums[]:num) {
			for(int getnum:nums) {
				sum1+=getnum;
			}
		}
		
		System.out.println("The sum of all elements in the array is= "+ sum1);
		
		
	}

}

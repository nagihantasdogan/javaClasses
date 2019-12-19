package com.class19;

public class Task3 {
	
	 /*3.Create  class Student that will have a method getGrade. 
    Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
	 */
	
	char grade(int num) {
		char gr;
		if(num>90) {
			gr='A';
		}else if(num>80 && num<=90) {
			gr='B';
		}else if(num>70 && num<=80) {
			gr='C';
		}else if(num>50 && num<=70) {
			gr='D';
		}else {
			gr='F';
		}
		return gr;
	}
	
	public static void main(String[]args) {
	Task3 obj=new Task3();
	
	char g=obj.grade(88);
	System.out.println(g);
	}	
	
}

package com.class31;

/*We have to calculate the percentage of marks obtained in three subjects (each out of 100) by
 * student A and in four subjects (each out of 100) by student B.
 * Create class ‘Marks’ with an abstract method ‘getPercentage’.
 * It is inherited by classes ‘A’ and ‘B’ each having a method with the 
 * same name which returns the percentage of the students.
 * The constructor of student A takes the marks in three subjects as its 
 * parameters and the marks in four subjects as its parameters for student B. 
 * Test your code 
 */

abstract class Mark{
	
	public abstract  double  getPercentage();
	
}
 class A extends Mark{
	double mark1,mark2,mark3;
	  A(double mark1,double mark2,double mark3){
	   this.mark1=mark1;
	   this.mark2=mark2;
	   this.mark3=mark3;
   }
   public  double getPercentage(double mark1,double mark2,double mark3){
	  double total1=(mark1+mark2+mark3)/3;
	   return total1;
   }
@Override
public double getPercentage() {
	// TODO Auto-generated method stub
	return 0;
}	
}
class B extends Mark{
	double mark1,mark2,mark3,mark4;
	  B(double mark1,double mark2,double mark3,double mark4){
		   //this.mark1=mark1;
		  // this.mark2=mark2;
		  // this.mark3=mark3;
		   this.mark4=mark4;
	   }
		
	    public  double  getPercentage(int mark1,int mark2,int mark3,int mark4) {
		  double total2=(mark1+mark2+mark3+mark4)/4;
		    return   total2;
	   }

	
	     
	     public static void main(String[] args) {
	 		
	    		A a=new A(80,90,100);
	    		B b=new B(60,60,60,60);
	    	    double total1=a.getPercentage();
	    	    double total2=b.getPercentage();
	    	   System.out.println(total1);
	    	   System.out.println(total2);
	    		}

		@Override
		public double getPercentage() {
			// TODO Auto-generated method stub
			return 0;
		}
	     
	     
}
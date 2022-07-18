package assignment_module1;


import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.lang.Math;

final class Calculater{  // here i use final keyword
	public double n1,n2;   // here i use access specifier 
	private  static char op; // here i use static keyboard
	public void twoNum(double n1,double n2)
	{
		this.n1=n1;  // here i use this keyword 
		this.n2=n2;
	}
	void forOption(char a)
	{
		op=a;
		switch(op)   
        {  
               
              case 'A': 
              System.out.println("addition of two number-> "+(n1+n2));
              break;
              case 'B':
              System.out.println("substration of two number->"+(n1-n2));
              break;
              case 'C':
              System.out.println("multiply of two number->"+(n1*n2));
              break;  
              case 'D':
              System.out.println("division of two number -> "+(n1/n2));
              break;
               
              default: System.out.println("Please enter valid input");  
         }  
	}


	

	
}

public class Cal  {
	
	    public static void main(String[] args) {
	    	double n1,n2;
	    	System.out.println("enter two number for operation");
	    	
	        
	        Scanner in = new Scanner(System.in);
	        n1=in.nextDouble();
	        n2=in.nextDouble();
	        System.out.println("enter 1 for addition"+'\n'+"enter 2 for substration"+'\n'+
	        	"enter 3 for multiply"+'\n'+"enter 4 for division"	);
	        int op;
	        op=in.nextInt();
	        op=op+64;
	        char a;
	        a=(char)op;  // here i use type casting 
	        Calculater obj=new Calculater();
	       obj.twoNum(n1, n2);
	       obj.forOption(a);
	        
	        
	    }
	


}

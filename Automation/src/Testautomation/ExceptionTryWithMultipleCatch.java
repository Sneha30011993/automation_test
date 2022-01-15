package Testautomation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTryWithMultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
	           Scanner sc=new Scanner(System.in);
	           System.out.println("Enter First number");
	           int a=sc.nextInt();
	           System.out.println("Enter Second number");
	           int b=sc.nextInt();
	              int c=a/b;
	        	   System.out.println(c);
	        	   System.out.println("Thank You");
	        	   
	           }
		catch(ArithmeticException e)
        {
       	   System.out.println("Please give valid input");
          }
		catch(InputMismatchException e)
		{
			System.out.println("Numbers Only");
		}
		
		finally{
			System.out.println("Sneha");
		}
		
		
		}
	}



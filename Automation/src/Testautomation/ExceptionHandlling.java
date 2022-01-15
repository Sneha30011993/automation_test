package Testautomation;

import java.util.Scanner;

public class ExceptionHandlling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter First number");
           int a=sc.nextInt();
           System.out.println("Enter Second number");
           int b=sc.nextInt();
           try {
        	   int c=a/b;
        	   System.out.println(c);
        	   System.out.println("Thank You");
        	   
           }
           catch(Exception e)
         {
        	   System.out.println("Numbers only");
           }
           
           }catch(Exception e){
        	   System.out.println("Numbers only");
           }
           }
           
	}



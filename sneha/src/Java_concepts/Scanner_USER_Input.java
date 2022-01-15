package Java_concepts;

import java.util.Scanner;

public class Scanner_USER_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);//This is object of scanner class
		//System.in==System is class & in is methode
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Additiion of two number is "+c);
		
		System.out.println("Enter a name");
		String name=sc.nextLine();
		System.out.print("Name  "+name);
	}

}

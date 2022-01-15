package Numbres;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num=5; //5*4*3*2*1
           int temp=1;
           
           for(int i=num;i>=1;i--)
           {
        	   temp=temp*i;//5,20,60,120,
        	  
           }
           System.out.println("factorial of "+num+" is "+temp);
	}

}

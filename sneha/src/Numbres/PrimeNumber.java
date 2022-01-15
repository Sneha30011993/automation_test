package Numbres;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int num=5;
		  int count=0;
		  for(int i=2; i<num ;i++) {
		  if(num%i==0) {//4%2=0
			  count++;//1
		  }
		  }
		      if(count==0) {
			System.out.println("Number is prime");
			
		}
		
		else {
			System.out.println("Number is not prime");
		}
	}
	
}
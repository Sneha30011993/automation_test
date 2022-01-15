package Numbres;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 10101 , 15451
		int num=15452;
		int temp=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;//1,10+5=15,150+4=154,1540+5=1545,15450+1=15451
			num=num/10;//1545,154,15,1,0
		}
		if(temp==rev) {
			System.out.println("number is palindrom");
			
		}
		else {
			System.out.println("number is not palindrom");
		}
		
		
	}

}

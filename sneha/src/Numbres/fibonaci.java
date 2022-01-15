package Numbres;

public class fibonaci {

	public static void main(String[] args) {// Output=0,1,1,2,3,5,8,13,21
		// TODO Auto-generated method stub
int a=0;
int b=1;
int c;
System.out.print(a+" "+b);//0,1
for(int i=0;i<20;i++)
{
	c=a+b;//0+1=1,1+1=2,1=2=3,3+2=5,3+5=8,5+8=13,8+13
	System.out.print(" "+c);//1,2,3,5,8,13,21
	a=b;//1,1,2,3,5,8
	b=c;//1,2,3,5,8,13
	
}

}
}





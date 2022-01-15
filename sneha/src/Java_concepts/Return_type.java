package Java_concepts;

public class Return_type {

	final int a=10;

	public static void main(String[] args) {
		
		Return_type obj=new Return_type();
		System.out.println(obj.display(10,20));
	}
	
	
	public final int display(int a,int b)
	{
	           int c;
	           c=a+b;
		//System.out.println(c);
		return 10;
	}
}

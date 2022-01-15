package Numbres;

public class arraymaxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,8,3,4};
		int len=a.length;
		int max=a[0];
		int min=a[0];
		for(int i=1;i<len;i++)
		{
			if(a[i]>=max)
			{
				max=a[i];
			}
		}
		
		for(int i=1;i<len;i++)
		{
			if(a[i]<=min)
			{
				min=a[i];
			}
		}
                System.out.println("max no  "+max);
                System.out.println("min no  "+min);
	}

}

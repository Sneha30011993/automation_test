package Numbres;

public class arraydescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1,8,3};
		int len=a.length;
		int temp;
		for(int i=0; i<len;i++) //1,8
		{
			for(int j=i+1; j<len; j++)//8,3,9,5,2
				                     //3,9,5
			{
				if(a[i]<a[j]) //8>3,8>9,8>5
				{
					temp=a[i];//8
					a[i]=a[j];//3
					a[j]=temp;//8
				              //1,3,5,8
					
				}
		}
			System.out.println(a[i]);//1,

			
	}

	}

}

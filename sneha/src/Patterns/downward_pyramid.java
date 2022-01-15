package Patterns;

public class downward_pyramid {

	public static void main(String[] args) {
	for(int i=5;i>=3;i--)
    {
     for(int k=5;k>=i;k--)
      {
          System.out.print(" ");
      }
          for(int j=1;j<=i;j++)
        	  
          {
        	 System.out.print(" ");
           System.out.print("*");
          }
          System.out.println();
        }
}
}
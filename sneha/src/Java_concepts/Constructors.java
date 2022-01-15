package Java_concepts;

public class Constructors {

	

		Constructors(int a)//parameter
		{
			System.out.println(a);
		}
		Constructors(int a,int b){
			System.out.println(a+b);
		}
		
		Constructors(String d){
			
		}
		
		
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Constructors obj = new Constructors("sneha");//argument
			//obj.add();
		}

		public void add()
		{
			int a=10;
			int b=20;
			System.out.println(a+b);
		}
	}



package Java_concepts;



public class Variables {

	
		
		int a=10;// instance variable/non static
		static int b=20; // class variable/static
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Variables obj=new Variables();
			System.out.println(obj.a);
			System.out.println(Variables.b);
		     obj.add();

		}

		public  void add() {
			
			  int x=10;//local variables
			int y=20;
			System.out.println(x+y);
			Variables obj1=new Variables();
			System.out.println(Variables.b);
			multiply();
			b=20;
		}
		public static void  multiply()
		{
			Variables obj2=new Variables();
			System.out.println(b);
			obj2.add();
			obj2.a=10;
			
			
		}
		
		
	}



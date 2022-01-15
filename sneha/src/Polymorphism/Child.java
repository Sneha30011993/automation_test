package Polymorphism;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj=new Child();
		obj.demo(200,100);
	
		Parent obj1=new Parent();
		obj1.demo(100, 200);
		
		Parent obj2=new Child();
		obj2.add();
		
	}
	public void demo(int a,int b) 
	{
		System.out.println(a-b);
	
	
}
	public void add() {
		System.out.println("sneha");
	}
	
	}
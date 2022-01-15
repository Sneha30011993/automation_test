package Interface;

public class BMW implements Car,Sneha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BMW obj=new BMW();
obj.colour();
obj.headlights();
obj.logo();
obj.engnine();
	}

	@Override
	public void colour() {
		System.out.println("Black");
		
	}

	@Override
	public void headlights() {
		System.out.println("Red");
		
	}

	@Override
	public void logo() {
		System.out.println("BMW");
		
	}

	@Override
	public void horn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void engnine() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void engnine() {
//		System.out.println("1000cc");
//		
//	}
}

	
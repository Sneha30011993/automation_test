package Testautomation;

public class StringBuffer_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("Sneha");
		System.out.println(name.concat(" Desai"));
		System.out.println(name);
		
		StringBuilder Name1 =new StringBuilder("Abhi");
		System.out.println(Name1.append(" Desai"));
		System.out.println(Name1);
		
		StringBuffer Name2=new StringBuffer("Athu");
		System.out.println(Name2.append(" Desai"));
		System.out.println(Name2);
		
		System.out.println(Name2.reverse());
		System.out.println(Name2);
		
		

	}

}

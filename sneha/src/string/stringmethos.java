package string;

public class stringmethos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//by literal-constant pool area 
		
		String a="Hello";
		String b="Hello";
		
		//By using new keyword-Heap area
		
		String c=new String("SNEHA");
		String d=new String("Sneha");
		
		
		System.out.println(a.charAt(0));
		System.out.println(c.length());
		System.out.println(c.contains("g"));
		System.out.println(c.equals("Sneha"));
		
		System.out.println(c.substring(1,4));
		System.out.println(c.concat(" Desai"));
		System.out.println(c.toLowerCase());
		System.out.println(d.toUpperCase());
		
		

	}

}

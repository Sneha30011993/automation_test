package Numbres;

public class string {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String x ="JAVA";// String literal
         String y=" java";//String constant pool area
         String a = new String("java");//By new keyword
         String b = new String ("java");//non pool area it will saved in 2 diff location
	      // java= index 0,1,2,3
         System.out.println(x.length());//4
         System.out.println(x.charAt(3));//a
         System.out.println(x.equals("test"));// false
         System.out.println(y.trim());//Remove whitespace
        // System.out.println(a.compareTo("java"));//
         System.out.println(a.toLowerCase());
         System.out.println(b.toUpperCase());
         System.out.println(x.equalsIgnoreCase("Java"));//true
         System.out.println(x.concat(" Home"));
         System.out.println();
         //String is non primitive data type
         //Size of string can not be determined
         //String is immutable
         //store set of character/ array of character
         //java.languague.package
	}
	
	

}



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataRead2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File fr=new File("C:\\\\Users\\\\admin\\\\Desktop\\\\File.txt");
		Scanner sc=new Scanner(fr);
		
		while(sc.hasNextLine()) {
		System.out.println(sc.nextLine());	
		}

	}

}

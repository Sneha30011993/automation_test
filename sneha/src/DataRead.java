import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	FileReader fr=new FileReader("C:\\Users\\admin\\Desktop\\File.txt");
	BufferedReader br= new BufferedReader(fr);
		String str=" ";
		
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
            br.close();
	}

}

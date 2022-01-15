import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DataWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw=new FileWriter("C:\\Users\\admin\\Desktop\\File.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        fw.write("Vrushali Pandit");
        System.out.println("Finish");
        bw.close();
	}

}

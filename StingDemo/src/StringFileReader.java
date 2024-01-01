import java.io.BufferedReader;
import java.io.FileReader;

public class StringFileReader {

	public static void main(String[] args) throws Exception {
		FileReader f1=new FileReader("data.txt");
		BufferedReader b1=new BufferedReader(f1);
		System.out.println(b1.readLine());
		System.out.println(b1.readLine());
		System.out.println(b1.readLine());
		System.out.println(b1.readLine());
		System.out.println(b1.readLine());
		System.out.println(b1.readLine());

	}

}

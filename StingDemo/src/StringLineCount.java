import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.FileNotFoundException;
public class StringLineCount {

	public static void main(String[] args)throws Exception {
		FileReader f1=new FileReader("data.txt");
		BufferedReader b1=new BufferedReader(f1);
		String s="";
		int ln=0;
		while((s=b1.readLine())!=null) {
			ln++;
		}
		System.out.println(ln);

	}

}

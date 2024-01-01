import java.io.BufferedReader;
import java.io.FileReader;

public class StringCharCount {

	public static void main(String[] args)throws Exception {
		FileReader f1=new FileReader("data.txt");
		BufferedReader b1=new BufferedReader(f1);
		
		String s="";
		int ln=0;int wd=0;
		while((s=b1.readLine())!=null) {
			String [] arr=s.split("");
			wd=wd+arr.length;
		}
		System.out.println(wd);

	}

}

import java.util.Scanner;
public class PartialReverse {
	public static void main(String[] args) {
		String s="knowledge";
//		char[] arr=s.toCharArray();
//		int len=0;
//		for(char ele:arr) {
//			len++;
//		}
		int len=0;
		try {
			while(true) {
				s.charAt(len);
				len++;
			}
		}
		catch (Exception e) {
		}
		String ans="";
		for(int i=0;i<len/2;i++) {
			ans=ans+s.charAt(i);
		}
		for(int i=len-1;i>=len/2;i--) {
			ans=ans+s.charAt(i);
		}
		System.out.println(ans);
	}

}




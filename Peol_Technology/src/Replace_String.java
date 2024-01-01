
public class Replace_String {
	public static void main(String[] args) {
		String s="Jspiders";
		int in=2;
		String sub="Tech";
			
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
		for(int i=0;i<len;i++) {
			if(i==in) {
				//ans=ans+sub;
				ans=ans+sub+s.charAt(i);
			}
			else {
				ans=ans+s.charAt(i);
			}
		}
		System.out.println(ans);
			
	}
	
}




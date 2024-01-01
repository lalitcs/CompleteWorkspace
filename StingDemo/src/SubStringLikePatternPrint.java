
public class SubStringLikePatternPrint {

	public static void main(String[] args) {
		String s="ABCDE";
		for(int i=0;i<s.length();i++) {
			String sub="";
			for(int j=0;j<s.length();j++) {
				sub=sub+s.charAt(j);
				System.out.println(sub);
			}
		}

	}

}

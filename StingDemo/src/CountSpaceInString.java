
public class CountSpaceInString {

	public static void main(String[] args) {
		String s="Hello Bye Hi Bye";
		int sp=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				sp++;
			}
		}
		System.out.println(sp);

	}

}

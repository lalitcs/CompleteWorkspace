
public class BracketBlance {

	public static void main(String[] args) {
		String s="(())()()()";
		int count=0;
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				count++;
			}
			if(s.charAt(i)==')') {
				count--;
			}
			if(count<0) {
				flag=false;
				break;
			}
		}
		if(count==0 && flag==true) {
			System.out.println("Blance Bracket");
		}
		else {
			System.out.println("Unblance Bracket");
		}

	}

}

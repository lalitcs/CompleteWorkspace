
public class BinaryToDecimal {

	public static void main(String[] args) {
		int n=1;
		String s="1101";
		int ans=0;
		for(int i=s.length()-1;i>=0;i--) {
			ans=ans+((s.charAt(i)-48)*n);
			n=n*2;
		}
		System.out.println(ans);
	}

}

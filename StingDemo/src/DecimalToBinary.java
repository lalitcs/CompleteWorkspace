
public class DecimalToBinary {

	public static void main(String[] args) {
		int n=13;
		String ans="";
		int rem=0;
		while(n!=0) {
			rem=n%2;
			ans=rem+ans;
			n=n/2;
		}
		System.out.println(ans);
		int Bi=Integer.parseInt(ans);
		System.out.println(Bi);
		

	}

}

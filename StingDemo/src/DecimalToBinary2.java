
public class DecimalToBinary2 {

	public static void main(String[] args) {
		int n=13,rem=0,ans=0,m=1;
		while(n!=0) {
			rem=n%2;
			ans=(rem*m)+ans;
			m*=10;
			n=n/2;
		}
		System.out.println(ans);

	}

}

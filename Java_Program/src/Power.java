
public class Power {
	static int power(int base,int exp) {
		int pow=1;
		for(int i=1;i<=exp;i++) {
			pow=pow*base;
		}
		return pow;

		
	}

	public static void main(String[] args) {
		System.out.println(power(2,3));

	}

}

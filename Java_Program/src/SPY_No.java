
public class SPY_No {

	public static void main(String[] args) {
		int n = 22;
		int rem = 0;
		int sum =0;
		int product =1;
		while(n!=0)
		{
			rem =n%10;
			sum = sum+rem;
			product =product*rem;
			n=n/10;
		}
		System.out.println(sum==product?"SPY_NO":"NOT SPY_NO");

	}

}

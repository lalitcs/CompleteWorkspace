
public class Sum_Of_Even_Digit {

	public static void main(String[] args) {
		int n=2756;
		int rem =0;
		int sum =0;
		while(n!=0)
		{
			rem =n%10;
			if(n%2==0)
			{
				sum=sum+rem;
			}
			n=n/10;
			System.out.println(sum);
		}

	}

}

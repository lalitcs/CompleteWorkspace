
public class Reverce_No {

	public static void main(String[] args) {
		int n = 5678;
		int rem =0;
		while(n!=0)
		{
			rem = rem%10;
			System.out.println(rem);
			n=n/10;
		}
		

	}

}

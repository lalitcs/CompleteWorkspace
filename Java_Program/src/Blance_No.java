
public class Blance_No {

	public static void main(String[] args) {
		int n = 19091;
		int rem =0;
		int esum = 0;
		int osum = 0;
		while(n!=0)
		{
			rem=rem%10;
			if(rem%2==0)
			{
				esum =esum+rem;
			}
			else {
				osum =osum+rem;
			}
			n=n/10;
		}
		System.out.println(esum-osum ==0?"Blance_NO":"Unbalance");
		// TODO Auto-generated method stub

	}

}


public class Nth_Prime_no_after_Kth_Key_Prime_no {
	static boolean IsPrime(int n) {
		int count =0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count==2?true:false;
	}

	public static void main(String[] args) {
		int SP =5;
		int Key =3;
		int c=0;
		for(int i=SP;;i++)
		{
			if(IsPrime(i))
			{
				c++;
			}
			if(c==Key)
			{
				System.out.println(i);
				break;
			}
		}
		
		// TODO Auto-generated method stub

	}

}

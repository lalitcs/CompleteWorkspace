public class Nth_Prime_No {
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
		int i =1;
		int Key =8;
		int c=0;
		while(true)
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
			i++;
		}
		

	}

}
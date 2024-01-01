public class Nth_Prime_No_For_Loop {
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
		//int i =1;
		int Key =5;
		int c=0;
		for(int i=2;;i++)
		{   boolean ans =IsPrime(i);
			if(ans==true)
			{
				c++;
			}
			if(c==Key)
			{
				System.out.println(i);
				break;
			}
			//i++;
		}
		

	}

}


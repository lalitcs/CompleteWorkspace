public class StrongNo {
	static int fact(int n) {
		int f=1;
		for(int i=1;i<n;i++) {
			f=f*i;
		}
		return f;
	}

	public static void main(String[] args) {
		int n = 153;int n1=n;
		int rem=0;int sum=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+fact(rem);
			n=n/10;
		}
		System.out.println(n1==sum?"StrongNO":"NOT A STRONGNO");
		

	}


}


public class BinaryArrayElementToDecimal {
	static int dec(String s) {
		int ans=0;
		int n=1;
		for(int i=s.length()-1;i>=0;i--) {
			ans=ans+((s.charAt(i)-48)*n);
			n=n*2;
		}
		return ans;
	}

	public static void main(String[] args) {
		String[] arr= {"1000","1100","0111","1011"};
		int sum=0;
		for(String ele:arr) {
			sum=sum+dec(ele);
		}
		System.out.println(sum);
		

	}

}

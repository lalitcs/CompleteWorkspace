public class DigitToString {

	public static void main(String[] args) {
		String[] arr= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
		int n=12562;
		String ans="";
		while(n!=0) {
			ans=arr[n%10]+" "+ans;
			n=n/10;
		}
		System.out.println(ans);

	}

}

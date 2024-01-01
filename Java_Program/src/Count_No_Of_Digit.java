
public class Count_No_Of_Digit {

	public static void main(String[] args) {
		int n=2345;int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		System.out.println(count);

	}

}

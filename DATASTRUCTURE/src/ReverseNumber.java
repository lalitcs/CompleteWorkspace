public class ReverseNumber {
	static void Display(int n) {
		if(n>=1) {
			Display(n-1);
			System.out.print(n);
		}
	}

	public static void main(String[] args) {
		Display(10);

	}

}

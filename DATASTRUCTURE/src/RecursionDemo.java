public class RecursionDemo {
	static void Display(int n) {
		if(n>=1) {
			System.out.print(n);
			Display(n-1);
		}
	}

	public static void main(String[] args) {
		Display(5);
		

	}

}

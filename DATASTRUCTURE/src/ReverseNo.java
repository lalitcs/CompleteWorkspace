public class ReverseNo {
	static int i=1;
	static void Display(int n) {
		if(i<=n) {
			System.out.print(i);
			i++;
			Display(n);
		}
	}

	public static void main(String[] args) {
		Display(15);

	}

}

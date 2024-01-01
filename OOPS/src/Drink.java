
public class Drink {
	// Direct Initialization
	String Brand = "Boost";
	double QTY = 0.5;
	int price  = 136;

	public static void main(String[] args) {
		Drink d1 = new Drink();
		System.out.println(d1.Brand);
		System.out.println(d1.QTY);
		System.out.println(d1.price);
		
		Drink d2 = new Drink();
		System.out.println(d2.Brand);
		System.out.println(d2.QTY);
		System.out.println(d2.price);
		

	}

}


public class Lipstick {
	
	String Brand;
	String Color;
	int Price;


	public static void main(String[] args) {
		Lipstick L1 = new Lipstick();
		L1.Brand = "Lakeme";
		L1.Color = "Hot_Pink";
		L1.Price = 300;
		System.out.println(L1.Brand);
		System.out.println(L1.Color);
		System.out.println(L1.Price);
		
		Lipstick L2 = new Lipstick();
		L2.Brand = "Suger";
		L2.Color = "Crimson Red";
		L2.Price = 499;
		System.out.println(L2.Brand);
		System.out.println(L2.Color);
		System.out.println(L2.Price);

	}

}

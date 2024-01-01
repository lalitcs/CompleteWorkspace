
public class Laptop {
	String Brand;
	String Processor;
	int Price;

	public static void main(String[] args) {
		Laptop L1 = new Laptop();
		L1.Brand = "Dell";
		L1.Processor = "I3";
		L1.Price = 78665;
		System.out.println(L1.Brand);
		System.out.println(L1.Processor);
		System.out.println(L1.Price);
		
		Laptop L2 = new Laptop();
		L2.Brand = "Pavallion";
		L2.Processor = "I7";
		L2.Price = 62999;
		System.out.println(L2.Brand);
		System.out.println(L2.Processor);
		System.out.println(L2.Price);
		
		Laptop L3 = new Laptop();
		L3.Brand = "apple";
		L3.Processor = "Book";
		L3.Price = 110000;
		System.out.println(L3.Brand);
		System.out.println(L3.Processor);
		System.out.println(L3.Price);

	}

}

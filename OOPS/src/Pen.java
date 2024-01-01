public class Pen {
	String name ="Linc";
	String color;
	int Price = 40;

	public static void main(String[] args) {
		Pen P1 = new Pen();
		P1.color = "RED";
		System.out.println(P1.name);
		System.out.println(P1.color);
		System.out.println(P1.Price);
		
		Pen P2 = new Pen();
		P2.color = "Black";
		System.out.println(P2.name);
		System.out.println(P2.color);
		System.out.println(P2.Price);

	}

}

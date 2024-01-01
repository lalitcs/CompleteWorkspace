
public class Mobile {
	String Model;
	String Color;
	int Price;


void details()
{
	System.out.println(this.Model);
	System.out.println(this.Color);
	System.out.println(this.Price);
}
public class Apple extends Mobile
{
	public static void main(String[] args) {
		Apple A1 = new Apple();
		A1.Model = "Iphone 14";
		A1.Color = "Silver";
		A1.Price = 85000;
		A1.details();

	}
}
public class Samsung extends Mobile
{
	public static void main(String[] args) {
		Samsung s1 = new Samsung();
		s1.Model = "S7";
		s1.Color = "blue";
		s1.Price = 15000;
		s1.details();
	}
}
}

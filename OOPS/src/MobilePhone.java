public class MobilePhone {
	String Brand;
	String Model;
	String Color;
	int Price;

	public static void main(String[] args) {
		MobilePhone M1 = new MobilePhone();
		M1.Brand = "apple";
		M1.Model = "Iphone Pro 11";
		M1.Color = "White";
		M1.Price = 150000;
		System.out.println(M1.Brand);
		System.out.println(M1.Model);
		System.out.println(M1.Color);
		System.out.println(M1.Price);
		
		MobilePhone M2 = new MobilePhone();
		M2.Brand = "One Plus";
		M2.Model = "Pro Max";
		M2.Color = "silver";
		M2.Price = 50000;
		System.out.println(M2.Brand);
		System.out.println(M2.Model);
		System.out.println(M2.Color);
		System.out.println(M2.Price);
		
		MobilePhone M3 = new MobilePhone();
		M3.Brand = "Redme";
		M3.Model = "Y2";
		M3.Color = "Black";
		M3.Price = 15000;
		System.out.println(M3.Brand);
		System.out.println(M3.Model);
		System.out.println(M3.Color);
		System.out.println(M3.Price);

	}

}

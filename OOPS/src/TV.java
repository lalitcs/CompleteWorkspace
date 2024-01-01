
public class TV {
	String Brand;
	String Type;
	int Price;

	public static void main(String[] args) {
		TV t1 = new TV();
		t1.Brand = "Sony";
		t1.Type = "ICD";
		t1.Price  = 45000;
		System.out.println(t1.Brand);
		System.out.println(t1.Type);
		System.out.println(t1.Price);
		
		TV t2 = new TV();
		t2.Brand = "MI";
		t2.Type = "LED";
		t2.Price = 2800;
		System.out.println(t2.Brand);
		System.out.println(t2.Type);
		System.out.println(t2.Price);
		
		TV t3 = new TV();
		t3.Brand = "One Plus";
		t3.Type = "LED";
		t3.Price = 32000;
		System.out.println(t3.Brand);
		System.out.println(t3.Type);
		System.out.println(t3.Price);

	}

}

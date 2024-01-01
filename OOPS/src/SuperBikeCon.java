public class SuperBikeCon {
	String Brand;
	String Model;
	String Color;
	int Price;
	SuperBikeCon(String B,String M,String C,int P)
	{
		this.Brand = B;
		this.Model = M;
		this.Color = C;
		this.Price = P;
	}

	public static void main(String[] args) {
		SuperBikeCon B1 = new SuperBikeCon("YAMAHA","FZ5","white",150000);
		SuperBikeCon B2 = new SuperBikeCon("TVS","APACHE","Silver",95000);
		SuperBikeCon B3 = new SuperBikeCon("KTM","DUKE","RED",150000);
		System.out.println(B1.Brand);
		System.out.println(B1.Model);
		System.out.println(B1.Color);
		System.out.println(B1.Price);
		
		System.out.println(B2.Brand);
		System.out.println(B2.Model);
		System.out.println(B2.Color);
		System.out.println(B2.Price);
		
		System.out.println(B3.Brand);
		System.out.println(B3.Model);
		System.out.println(B3.Color);
		System.out.println(B3.Price);
		
		System.out.println(B1.Brand+"   "+B1.Model+"   "+B1.Color+"   "+B1.Price);
		System.out.println(B2.Brand+"   "+B2.Model+"   "+B2.Color+"   "+B2.Price);
		System.out.println(B3.Brand+"   "+B3.Model+"   "+B3.Color+"   "+B3.Price);

	}

}



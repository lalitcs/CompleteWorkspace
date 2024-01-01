public class LaptopCon {
	String Brand;
	String Model;
	String Color;
	String Rom;
	int Price;
	LaptopCon(String B,String M,String C,String R,int P)
	{
		this.Brand = B;
		this.Model = M;
		this.Color = C;
		this.Rom = R;
		this.Price = P;
	}

	public static void main(String[] args) {
		LaptopCon L1 = new LaptopCon("Acer","Aspire","white","4GB",50000);
		LaptopCon L2 = new LaptopCon("HP","I7","Silver","6GB",65000);
		LaptopCon L3 = new LaptopCon("DELL","I9","black","8GB",100000);
		System.out.println(L1.Brand);
		System.out.println(L1.Model);
		System.out.println(L1.Color);
		System.out.println(L1.Rom);
		System.out.println(L1.Price);
		
		System.out.println(L2.Brand);
		System.out.println(L2.Model);
		System.out.println(L2.Color);
		System.out.println(L2.Rom);
		System.out.println(L2.Price);
		
		System.out.println(L3.Brand);
		System.out.println(L3.Model);
		System.out.println(L3.Color);
		System.out.println(L3.Rom);
		System.out.println(L3.Price);
		
		System.out.println(L1.Brand+"   "+L1.Model+"   "+L1.Color+"   "+L1.Rom+"   "+L1.Price);
		System.out.println(L2.Brand+"   "+L2.Model+"   "+L2.Color+"   "+L2.Rom+"   "+L2.Price);
		System.out.println(L3.Brand+"   "+L3.Model+"   "+L3.Color+"   "+L3.Rom+"   "+L3.Price);

	}

}


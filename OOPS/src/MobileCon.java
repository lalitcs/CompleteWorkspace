public class MobileCon {
	String Brand;
	String Model;
	String Color;
	String Rom;
	int Price;
	MobileCon(String B,String M,String C,String R,int P)
	{
		this.Brand = B;
		this.Model = M;
		this.Color = C;
		this.Rom = R;
		this.Price = P;
	}

	public static void main(String[] args) {
		MobileCon M1 = new MobileCon("Redmi","Y2","white","4GB",20000);
		MobileCon M2 = new MobileCon("Real Me","I7","Silver","6GB",15000);
		MobileCon M3 = new MobileCon("Vivo","V9","black","8GB",10000);
		System.out.println(M1.Brand);
		System.out.println(M1.Model);
		System.out.println(M1.Color);
		System.out.println(M1.Rom);
		System.out.println(M1.Price);
		
		System.out.println(M2.Brand);
		System.out.println(M2.Model);
		System.out.println(M2.Color);
		System.out.println(M2.Rom);
		System.out.println(M2.Price);
		
		System.out.println(M3.Brand);
		System.out.println(M3.Model);
		System.out.println(M3.Color);
		System.out.println(M3.Rom);
		System.out.println(M3.Price);
		
		System.out.println(M1.Brand+"   "+M1.Model+"   "+M1.Color+"   "+M1.Rom+"   "+M1.Price);
		System.out.println(M2.Brand+"   "+M2.Model+"   "+M2.Color+"   "+M2.Rom+"   "+M2.Price);
		System.out.println(M3.Brand+"   "+M3.Model+"   "+M3.Color+"   "+M3.Rom+"   "+M3.Price);

	}

}

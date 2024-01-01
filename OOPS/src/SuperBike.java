public class SuperBike {
	String Model;
	String Engine;
	int ToSpeed;
	int Price;

	public static void main(String[] args){
		SuperBike B1 = new SuperBike();
		B1.Model = "Kawaski";
		B1.Engine = "649CC";
		B1.ToSpeed = 210  ;
		B1.Price = 594000;
		System.out.println(B1.Model);
		System.out.println(B1.Engine);
		System.out.println(B1.ToSpeed);
		System.out.println(B1.Price);
		
		SuperBike B2 = new SuperBike();
		B2.Model = "Stnet Triple RR";
		B2.Engine = "765CC";
		B2.ToSpeed = 250;
		B2.Price = 500000;
		System.out.println(B2.Model);
		System.out.println(B2.Engine);
		System.out.println(B2.ToSpeed);
		System.out.println(B2.Price);
		
		SuperBike B3 = new SuperBike();
		B3.Model = "FZ5";
		B3.Engine = "250CC";
		B3.ToSpeed = 160;
		B3.Price = 150000;
		System.out.println(B3.Model);
		System.out.println(B3.Model);
		System.out.println(B3.ToSpeed);
		System.out.println(B3.Price);
		

	}

}

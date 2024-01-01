public class CarConstructor {
	CarConstructor()
	{
		System.out.println("C_Start");
		System.out.println("Car");
		System.out.println("C_END");
	}

	public static void main(String[] args) {
		System.out.println("Start");
		CarConstructor C1 = new CarConstructor();
		System.out.println("Car");
		CarConstructor C2 = new CarConstructor();
		System.out.println("END");
		
	}
	

}

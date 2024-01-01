
public class Vehicle {
	String Name;
	String Color;
	int Price;

	void details()
	{
		System.out.println(this.Name);
		System.out.println(this.Color);
		System.out.println(this.Price);
	}
	public class Bike extends Vehicle
	{
		public static void main(String[] args) {
			Bike B1 = new Bike();
			B1.Name = "Duke";
			B1.Color = "Orange";
			B1.Price = 280000;
			B1.details();
		}
	}
	public class Car extends Vehicle
	{
		public static void main(String[] args) {
			Car C1 = new Car();
			C1.Name = "verna";
			C1.Color = "Black";
			C1.Price = 1895000;
			C1.details();
		}
		
	}
	class Cycle extends Vehicle
	{
		public static void main(String[] args) {
			Cycle C1 = new Cycle();
			C1.Name = "DBT";
			C1.Color = "Red";
			C1.Price = 7000;
			C1.details();
		}
	}
}




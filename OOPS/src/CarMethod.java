public class CarMethod {
	String Name;
	String Color;
	int Price;
	int CC;
	float insurance = 0;
	float tax =0;
	float total = 0;
	CarMethod(String N,String C,int P,int CC)
	{
		this.Name = N;this.Color =C;
		this.Price = P;this.CC =CC;
		
	}
	void Tax()
	{
		
		if(Price<500000)
		{
			tax = Price*0.13f;
		}
		if(Price>=500000 &&Price <= 1000000)
		{
			tax =Price*0.14f;
		}
		if(Price >=1000000 &&Price<=2000000)
		{
			tax =Price*0.17f;
		}
		if(Price > 2000000)
		{
			tax =Price*0.18f;
		}
	}
	void Insurance()
	{
		
		if(CC<=800)
		{
			insurance = 1350*5;
		}
		if(CC>800 && CC<=1500)
		{
			insurance = 2850*5;
		}
		if(CC>1500 && CC<=3000)
		{
			insurance = 4350*5;
		}
		if(CC>3000)
		{
			insurance = 5550*5;
		}
		
	}
	void Total()
	{
		total = this.Price+this.tax+this.insurance;
	}
	void Details()
	{
		System.out.println("namme  ="+Name);
		System.out.println("cc = "+CC);
		System.out.println("Price = " +Price);
		System.out.println("Color = "+Color);
		System.out.println("Tax = "+tax);
		System.out.println("Insurance = "+insurance);
		System.out.println("Total ="+total);
		
	}
	public static void main(String[] args) {
		CarMethod C1 = new CarMethod(C1.Name = "verna",C1.Color = "Black",C1.Price = 1395000,C1.CC= 1500);
		C1.Details();
		C1.Tax();
		C1.Insurance();
	}
	

}

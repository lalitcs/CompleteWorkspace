
public class Car {

	public static void main(String[] args) {
		String name = "Honda";
		int exshroomPrice = 1500000;
		int cc = 1500;
		float tax = 0;
		int insurance = 0;
		float OnRoadPrice = 0;
		if(exshroomPrice<500000)
		{
			tax = exshroomPrice*0.13f;
		}
		if(exshroomPrice>=500000 && exshroomPrice <= 1000000)
		{
			tax = exshroomPrice*0.14f;
		}
		if(exshroomPrice >=1000000 && exshroomPrice<=2000000)
		{
			tax = exshroomPrice*0.17f;
		}
		if(exshroomPrice > 2000000)
		{
			tax = exshroomPrice*0.18f;
		}
		//calculate insurance
		if(cc<=800)
		{
			insurance = 1350*5;
		}
		if(cc>800 && cc<=1500)
		{
			insurance = 2850*5;
		}
		if(cc>1500 && cc<=3000)
		{
			insurance = 4350*5;
		}
		if(cc>3000)
		{
			insurance = 5550*5;
		}
		OnRoadPrice = exshroomPrice+tax+insurance;
		System.out.println("namme  ="+name);
		System.out.println("cc = "+cc);
		System.out.println("exshroomPrice = " + exshroomPrice);
		System.out.println("tax = "+tax);
		System.out.println("insurance = "+insurance);
		System.out.println("OnRoadPrice = "+ OnRoadPrice);

	}

}

public class IceCream {

	public static void main(String[] args) {
		int flavourCode = 1;
		float price = 0;
		boolean topping = false;
		boolean dryfruit = true;
		if(flavourCode ==1)
		{
			price = 100;
		}
		if(flavourCode == 2)
		{
			price = 120;
		}
		if(flavourCode == 3)
		{
			price = 145;
		}
		if(topping == true)
		{
			price =price+15;
		}
		if(dryfruit==true)
		{
			price = price+22;
		}
		float GST = price*0.18f;
		System.out.println("price = " + price);
		System.out.println("GST = "+GST);
		price= price + GST;
		System.out.println("total = "+price);

	}

}

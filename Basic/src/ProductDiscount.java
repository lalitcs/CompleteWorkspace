
public class ProductDiscount {

	public static void main(String[] args)
	{
		int p1 = 500;int p2 = 1000;
		int p3 = 1500;int p4 = 2000;
		float discount = 0;
		int total = p1+p2+p3+p4;
		System.out.println("Before added discount = "+ total);
		if(total<1500)
		{
			System.out.println("add"+(1500-total)+"/-"+"+to get 10% discount");
			System.out.println("add"+(1500-total)+"/-"+"+to get 15% discount");
			System.out.println("add"+(1500-total)+"/-"+"+to get 20% discount");
			System.out.println("add"+(1500-total)+"/-"+"+to get 30% discount");
		}
		if(total>=1500 && total<=2000)
		{
			discount = total*0.10f;
			System.out.println("add"+(2000-total)+"/-"+"+to get 15% discount");
			System.out.println("add"+(2000-total)+"/-"+"+to get 20% discount");
			System.out.println("add"+(2000-total)+"/-"+"+to get 30% discount");
		}
		if(total>=2001 && total<=2500)
		{   
			discount = total*0.15f;
			System.out.println("add"+(2501-total)+"/-"+"+to get 20% discount");
			System.out.println("add"+(3000-total)+"/-"+"+to get 30% discount");
		}
		if(total<=2501 && total<=3000)
		{
			discount = total*0.20f;
			System.out.println("add"+(3000-total)+"/-"+"+to get 30% discount");
		}
		if(total>300)
		{
			discount = total*0.30f;
		}
		float bill = total+discount;
		System.out.println("Product = " +p1);
		System.out.println("Product = " +p2);
		System.out.println("Product = " +p3);
		System.out.println("Product = " +p4);
		System.out.println("total = " +total);
		System.out.println("Bill = "+ bill);
		System.out.println("Discount = " +discount);
		System.out.println("total = " +(total-discount));
		
		
		
		

	}

}

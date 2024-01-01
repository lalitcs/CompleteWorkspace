
public class Test3 {

	public static void main(String[] args) {
		int p1=199;int p2=499;
		int p3=299;int p4=999;
		int Bill= p1+p2+p3+p4;
		float discount = Bill*0.15f;
		float total = Bill-discount;
		System.out.println("product = "+p1);
		System.out.println("product = "+p2);
		System.out.println("product = "+p3);
		System.out.println("product = "+p4);
		System.out.println("Bill = "+Bill);
		System.out.println("discount = "+discount);
		System.out.println("total = "+total);
	}

}

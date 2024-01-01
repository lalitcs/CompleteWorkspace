
public class SwapeNo {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before Swaping");
		System.out.println("a:="+a);
		System.out.println("b:="+b);
		a=a-b;
		b=a+b;
		a=a-b;
		System.out.println("After Swaping");
		System.out.println("a:="+a);
		System.out.println("b:="+b);
		
//********************************************
		int temp=a;
		a=b;
		b=temp;
		System.out.println("A:="+a);
		System.out.println("B:="+b);
//*********************************************
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}

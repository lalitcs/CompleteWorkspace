
public class Sum_Element {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int sum = a[0];
		for(int i=1;i<a.length;i++)
		{
			sum=a[i]+sum;
		}
		System.out.println("Sum Of Element is " + sum);
	}

}

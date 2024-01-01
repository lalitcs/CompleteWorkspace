
public class Min_Element {

	public static void main(String[] args) {
		int[] a= {20,40,10,35,50,45};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum element in array "+min);

	}

}


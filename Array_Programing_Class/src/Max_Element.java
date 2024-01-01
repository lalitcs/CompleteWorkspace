
public class Max_Element {

	public static void main(String[] args) {
		int[] a= {20,40,10,35,50,45};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum element in array "+max);

	}

}

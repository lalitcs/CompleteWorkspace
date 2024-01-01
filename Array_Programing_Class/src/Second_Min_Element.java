
public class Second_Min_Element {

	public static void main(String[] args) {
		int[] a= {10,20,40,45,25,60};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			/*
			if(i==1)
			{
				break;
			}*/
		}
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"");
		}*/
		System.out.println("Second min Element " + a[1]);

	}

}


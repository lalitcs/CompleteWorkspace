
public class Kth_Max_Element {

	public static void main(String[] args) {
		int[] a= {10,20,40,45,25,60};
		int k=2;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]< a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==k-1)
			{
				System.out.println("Kth_max_element " + a[i]);
				break;
			}
			/*
			if(i==1)
			{
				break;
			}*/
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"");
		}
		

	}

}




public class Missing_Element_array3 {

	public static void main(String[] args) {
		int n=5;
		int[] arr= {3,5,1,2};
		int sum1=0;
		for(int i=1;i<=n;i++) {
			sum1=sum1+i;
		}
		int sum2=0;
		for(int ele:arr) {
			sum2=sum2+ele;
			System.out.println(sum1-sum2);
		}

	}

}

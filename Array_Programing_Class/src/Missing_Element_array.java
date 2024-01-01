
public class Missing_Element_array {

	public static void main(String[] args) {
		int n=5;
		int[] arr= {3,5,2,1};
		for(int i=1;i<=n;i++) {
			boolean flag=false;
			for(int ele:arr) {
				if(i==ele) {
					flag=true;
					break;
					}
			}
			if(flag==false) {
				System.out.println(i);
				break;
		}
		
		}

	}

}

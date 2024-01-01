
public class Missing_Element_array2 {

	public static void main(String[] args) {
		int n=5;
		int[] arr= {3,5,2,1};
		int[] temp =new int[n+1];
		for(int ele:arr) {
			temp [ele]++;
		}
		for(int i=1;i<temp.length;i++) {
			if(temp[i]==0) {
				System.out.println(i);
				break;
			}
		}

	}

}

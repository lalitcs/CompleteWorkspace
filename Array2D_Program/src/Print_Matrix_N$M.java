
public class Print_Matrix_N$M {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5},{7,8,9,10},{3,7,8}};
		System.out.println(arr.length);
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			int max=0;
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
			sum=sum+max;
			
		}
		System.out.println(sum);
		}

}


public class Print_Address_Length {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("================");
		for(int[] ele:arr) {
			System.out.println(ele);
		}

	}

}

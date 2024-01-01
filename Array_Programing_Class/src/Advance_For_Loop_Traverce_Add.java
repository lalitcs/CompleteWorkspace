
public class Advance_For_Loop_Traverce_Add {

	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50};
		for(int ele:arr) {
			System.out.println(ele);
		}
		System.out.println("===============");
		int sum=0;
		for(int ele:arr) {
			sum=sum+ele;
		}
		System.out.println(sum);

	}

}


public class StringSumOnlyNum {

	public static void main(String[] args) {
		String s="Hello 350 Bye 600 Hi 900";
		String[] arr=s.split(" ");
		int sum=0;
		for(String ele:arr) {
			try {
				sum=sum+Integer.parseInt(ele);
			}
			catch(Exception e) {
				
			}
		}
		System.out.println(sum);

	}

}

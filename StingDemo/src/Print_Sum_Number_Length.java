
public class Print_Sum_Number_Length {

	public static void main(String[] args) {
		String s="Hello 1 2 2 Hi 5 6 BYE 1 2 3";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0' && c<='9') {
				sum =sum+(c-48);
			}
		}
		System.out.println(sum);

	}

}

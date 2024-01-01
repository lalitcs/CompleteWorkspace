
public class StingNoToInt {
	static int StringToNum(String s) {
		int num=0;
		char[] arr=s.toCharArray();
		for(char ele:arr) {
			num=(num*10)+(ele-48);
		}
		return num;
		
	}
	public static void main(String[] args) {
		String s1="23";
		String s2="13";
		int sum=StringToNum(s1)+StringToNum(s2);
		System.out.println(sum);
		

	}

}

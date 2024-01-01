
public class PalindromeString {
	public static void main(String[] args) {
		String s ="madam";
		String Rev ="";
		for (int i=s.length()-1;i>=0;i--) {
			Rev = Rev+s.charAt(i);
		}
		System.out.println(Rev);
		if(s.equals(Rev))
		{
			System.out.println("Palindrom String");
		}
		else
		{
			System.out.println("NOT Palindrome String");
		}
		
	}

}




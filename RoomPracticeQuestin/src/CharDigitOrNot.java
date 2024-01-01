import java.util.Scanner;
public class CharDigitOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String s = sc.next();
		char ch =s.charAt(0);
		if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " is a digit.");
	        }
		else 
		{
			System.out.println(ch + " is not a digit.");
	        }

	       
	    }
	}
	









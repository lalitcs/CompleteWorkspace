import java.util.*;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rem=0;
		int rev=0;
		int temp=n;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}

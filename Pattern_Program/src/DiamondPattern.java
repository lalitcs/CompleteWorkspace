import java.util.*;
public class DiamondPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=0;i<=num;i++) {
			for(int j=1;j<=num-i;j++) 
				System.out.print(" ");
				for(int j=1;j<=2*i-1;j++) 
					System.out.print("*");
					System.out.println();
				
			
		}
		for(int i=num-1;i>=1;i--) {
			for(int j=1;j<=num-i;j++) 
				System.out.print(" ");
				for(int j=1;j<=2*i-1;j++) 
					System.out.print("*");
					System.out.println();
				
			
		}

	}

}

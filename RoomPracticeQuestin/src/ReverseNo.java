public class ReverseNo {

		public static void main(String[] args) {
			int n = 5678;
			int rev=0;
			while(n!=0)
			{
		    int rem = n%10;
				//rev =rev*10+rem;
				n=n/10;
				System.out.print(rem);
			}
			

		}

	}




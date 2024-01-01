
public class PerfectSquareNo {

	public static void main(String[] args) {
		int n =4;boolean flag=false;
		for(int i=1;i<=n;i++) {
			if(n==i*i) {
				flag=true;
			}
		}
		if(flag==true) {
			System.out.println("Perfect Square Number");
		}
		else {
			System.out.println("Not Perfect Square");
		}

	}

}

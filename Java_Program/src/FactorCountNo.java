
public class FactorCountNo {

	public static void main(String[] args) {
		int n=24;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count=count+i;
			}
			System.out.println(i);
		}

	}

}

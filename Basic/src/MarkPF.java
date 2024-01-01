
public class MarkPF {

	public static void main(String[] args) {
		int p = 62;int c = 75;
		int m = 90;int o = 95;
		int total = p+c+m+o;
		float perc = total/400.0f*100.0f;
		if(perc<35)
		{
			System.out.println("Fail");
		}
		if(perc>=35 && perc <=59)
		{
			System.out.println("Secoun_class");
		}
		if(perc>=60 && perc<=79)
		{
			System.out.println("First_class");
		}
		if(perc>=80)
		{
			System.out.println("Distinction_class");
		}

	}

}

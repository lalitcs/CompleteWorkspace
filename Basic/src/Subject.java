public class Subject {

	public static void main(String[] args) {
		int math = 100;int phys = 85;
		int che = 90;int hindi = 80;
		int sum = math+phys+che+hindi;
		float perc = sum/400.0f*100;
		if(perc>35)
		{
			System.out.println(" Pass");
		}
		else
		{
			System.out.println("faill");
		}

	}

}

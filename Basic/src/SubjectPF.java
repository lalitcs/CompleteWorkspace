
public class SubjectPF {

	public static void main(String[] args) {
		int phys= 80;int che=70;
		int math= 100;int option =0;
		int total = phys+che+math+option;
		float perc = total/400.f*100;
		if(phys<35||che<35||math<35||option<35)
		{
			System.out.println("fail");
		}
		else
		{
		 System.out.println("pass");
		 System.out.println(perc);
		}

	}

}

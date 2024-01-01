
public class WeekWeekend {

	public static void main(String[] args) {
		int day=5;
				
		if( day == 1 || day == 7)
		{
			System.out.println("day = Weekend");
		}
		if(day==2||day==3||day==4||day==5||day==6)
		{
			System.out.println("day = Weekday");
		}
		if(day>7||day<1)
		{
			System.out.println("invalid input");
		}
		

	}

}

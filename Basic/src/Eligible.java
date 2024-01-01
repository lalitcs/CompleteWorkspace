
public class Eligible {

	public static void main(String[] args) {
		int qCode = 1;int sCode = 5;
		int YOP = 2023;float perc = 65.0f;
		if(qCode ==1||qCode ==3||qCode==4)
		{
			if(sCode>=1 && sCode <=4)
			{
				if(YOP == 2021 && YOP ==2022)
				{
					if(perc>=55)
					{
						System.out.println("Eligible");
					}
					else
					{
						System.out.println("NOT Eligible");
					}
					
				}
				
			}
		}
		else
		{
			System.out.println("NOT eligible for interview");
		}
		if(qCode!=1 && qCode!=3 && qCode!=4)
		{
			System.out.println("Quelification not matching");
		}
		if(sCode<1||sCode>4)
		{
			System.out.println("Stream not matching");
		}
		if(YOP!=2021 && YOP!=2022)
		{
			System.out.println("YOP not matching");
		}
		if(perc<55)
		{
			System.out.println("Percentage not matching");
		}

	}

}

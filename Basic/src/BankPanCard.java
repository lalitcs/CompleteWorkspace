public class BankPanCard {

	public static void main(String[] args) {
		int balance = 50000;
		int amount = 75000;
		int Cpin = 1234;
		int Epin = 1234;
		boolean PanCard = false;
		if(Cpin == Epin)
		{
			if(amount>50000 && PanCard == true ||(amount>50000))
			{
				balance = balance+amount;
				System.out.println(balance);
			}
			else
			{
				System.out.println("Link Pancard");
			}
		}
		else
		{
			System.out.println("Incorrect");
		}
		
		

	}

}

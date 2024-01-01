
public class Bank {

	public static void main(String[] args) {
		int balance = 250000;
		int amount = 75000;
		int bankCode = 1;
		int Cpin = 1234;int Epin = 1234;
		//check pin
		if(Cpin==Epin)
		{
			if(amount<balance)
			{
				System.out.println("Balance before withrow = "+balance);
				balance = balance-amount;
				System.out.println("Balance after withrow ="+balance);
				//to verify minimum balance
				if(bankCode==1 || bankCode==3)
				{
					if(balance<10000)
					{
						System.out.println("Low minimum balance");
						System.out.println(10000-balance+"must be deposite");
					}
				}
			}
			else
			{
				System.out.println("insufficient balance");
			}
		}
		else
		{
			System.out.println("incorrect pin");
		}

	}
	

}


public class Player {
	String Name;
	String Team;
	int JerseyNo;
	
	Player(String N,String T,int J)
	{
		this.Name = N;
		this.Team = T;
		this.JerseyNo = J;
	}
	void Details()
	{
		System.out.println("Name = "+this.Name);
		System.out.println("Team = "+this.Team);
		System.out.println("JerseyNo = "+this.JerseyNo);
	}

	public static void main(String[] args) {
		Player P1 = new Player("MSD","CSK",7);
		Player P2 = new Player("Virat","RCB",18);
		P1.Details();P2.Details();

	}

}

public class StudentCon {
	String Name;
	String Qualification;
	int YOP;
	StudentCon(String N,String Q,int Y)
	{
		this.Name =N;
		this.Qualification =Q;
		this.YOP =Y;
	}

	public static void main(String[] args) {
		StudentCon S1 = new StudentCon("Lalit","B.Tech",2023);
		StudentCon S2 = new StudentCon("Ajit","B.SC",2023);
		System.out.println(S1.Name);
		System.out.println(S1.Qualification);
		System.out.println(S1.YOP);
		System.out.println(S2.Name);
		System.out.println(S2.Qualification);
		System.out.println(S2.YOP);
		System.out.println(S1.Name+"  "+S1.Qualification+"  "+S1.YOP);
		System.out.println(S2.Name+"  "+S2.Qualification+"  "+S2.YOP);
		

	}

}

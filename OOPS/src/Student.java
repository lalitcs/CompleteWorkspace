public class Student {
	String Name;
	int Physics;
	int Chemistry;
	int Maths;
	int Optional;
	int Total;
	float Perc;
	Student(String N,int P,int C,int M,int O)
	{
		this.Name = N;
		this.Physics = P;
		this.Chemistry = C;
		this.Maths = M;
		this.Optional = O;
		
	}
	void Details()
	{
		System.out.println("Name = "+Name);
		System.out.println("Physics = "+Physics);
		System.out.println("Chemistry = "+Chemistry);
		System.out.println("Maths = "+Maths);
		System.out.println("Optional = "+Optional);
	}
	void Total()
	{
		Total = (Physics+Chemistry+Maths+Optional);
		System.out.println(Total);
	}
	void Perc()
	{
		Perc = (Physics+Chemistry+Maths+Optional)/500.0f*100.0f;
		System.out.println(Perc);
	}

	public static void main(String[] args) {
		Student S1 = new Student("Lalit",95,90,99,140);
		Student S2 = new Student("Jagarnathan",90,80,95,130);
		S1.Details();
		S1.Total();
		S1.Perc();
		S2.Details();
		S2.Total();
		S2.Perc();
		

	}

}

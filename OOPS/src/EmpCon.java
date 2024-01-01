public class EmpCon {
	String Name;
	int salary;
	EmpCon(String N,int S)
	{
		this.Name = N;
		this.salary = S;
	}

	public static void main(String[] args) {
		EmpCon E1 = new EmpCon("Lalit",30000);
		EmpCon E2 = new EmpCon("Ajit",20000);
		System.out.println(E1.Name);
		System.out.println(E1.salary);
		System.out.println(E2.Name);
		System.out.println(E2.salary);

	}

}

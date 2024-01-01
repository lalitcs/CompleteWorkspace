public class Employee {
	String Name;
	String Company = "Capgemini";
	float salary = 27000;

	public static void main(String[] args) {
		Employee E1 = new Employee();
		E1.Name = "Lalit";
		System.out.println(E1.Name);
		System.out.println(E1.Company);
		System.out.println(E1.salary);
		
		Employee E2 = new Employee();
		E2.Name = "Ajit";
		System.out.println(E2.Name);
		System.out.println(E2.Company);
		System.out.println(E2.salary);
		
		E1.salary = E1.salary+(E1.salary*0.20f);
		E2.salary = E2.salary+(E2.salary*0.25f);
		System.out.println(E1.salary);
		System.out.println(E2.salary);
		

	}

}

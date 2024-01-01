class Bike{
	String name;
	String color;
	int price;
	public Bike(String name,String color,int price) {
		this.name=name;
		this.color=color;
		this.price=price;
	}
}
class Employee{
	String name;
	String company;
	int salary;
	public Employee(String name,String company,int salary) {
		this.name=name;
		this.company=company;
		this.salary=salary;
	}
}
public class UpCasting_DownCasting_ClassCast {
	public static void main(String[] args) {
		Bike B1=new Bike("FZ5","blue",150000);
		Bike B2=new Bike("KTM","Orange",200000);
		
		Employee E1=new Employee("Lalit","TCS",30000);
		Employee E2=new Employee("ASHU","Wipro",25000);
		
		Object x[]= {B1,B2,E1,E2};
		
		for(Object ob:x) {
			if(ob instanceof Bike) {
				Bike bike=(Bike)ob;
				System.out.println("Bike Name:"+bike.name);
			}
			else if(ob instanceof Employee) {
				Employee emp=(Employee)ob;
				System.out.println("Employee Name:"+emp.name);
			}
		}
		for(Object ob:x) {
			try {
				Employee emp=(Employee)ob;
				System.out.println("Employee Name:"+emp.name);
			}
			catch(ClassCastException e) {
				System.out.println("ClassCastException caught:"+e.getMessage());
			}
		}
	}

}

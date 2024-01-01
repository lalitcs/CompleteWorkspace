public class ENCAPSULATION_EXAMPLE {
	private String name;
	private int age;
	private double perc;
	public void setname(String n) {
		this.name=n;
	}
	public void setage(int a) {
		if(a>1 && a<=100) {
			this.age=a;
		}
		else {
			System.out.println("invalid age");
		}
	}
	public void setperc(double p) {
		if(p>=0 && p<=100) {
			this.perc=p;
		}
		else {
			System.out.println("invalid percentage");
		}
	}
	public String getname() {
		return this.name;
	}
	public int getage() {
		return this.age;
	}
	public double getperc() {
		return this.perc;
	}
//	public class demo{
//		
//	}

	public static void main(String[] args) {
		ENCAPSULATION_EXAMPLE e1=new ENCAPSULATION_EXAMPLE();
		e1.setname("Lalit");
		e1.setage(22);
		e1.setperc(81.5);
		System.out.println(e1.getname());
		System.out.println(e1.getage());
		System.out.println(e1.getperc());
	

	}

}

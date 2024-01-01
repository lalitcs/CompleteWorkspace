public class MethodOverriding {
	void run() {
		System.out.println("Running-1");
	}

}
class child extends MethodOverriding{
	void run() {
		super.run();
		System.err.println("Running-2");
		
	}
	public static void main(String[] args) {
		child c1=new child();
		c1.run();
	}
}

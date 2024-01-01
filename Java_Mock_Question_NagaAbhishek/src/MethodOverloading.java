
public class MethodOverloading {
		void run(){
		System.out.println("Running-1");
		}
		void run(int x){
		System.out.println("Running-2");
		}

	public static void main(String[] args) {
		MethodOverloading a = new MethodOverloading();
		a.run();
		a.run(5);
	}
	
}



	



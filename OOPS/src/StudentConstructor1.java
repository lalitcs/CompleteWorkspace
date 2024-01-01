
public class StudentConstructor1 {
	StudentConstructor1()
	{
		System.out.println(this);
	}

	public static void main(String[] args) {
		StudentConstructor1 s1 = new StudentConstructor1();
		StudentConstructor1 s2 = new StudentConstructor1();

	}

}

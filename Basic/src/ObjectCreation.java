public class ObjectCreation {
	//Object Initilization
	//1.Direct  Initilization
	class student
	{
	String name="Lalit";
	int id=101;
	public static void main (String[] args){
	student s=new student();
	System.out.println(s.name);
	System.out.println(s.id);
	}
	}

	//2.Using Object Reference
	class student
	{
	String namee;
	int id;
	public static void main(String[] args){
	student s1=new student();
	s1.name="lalit";
	s1.id=202;
	System.out.println(s1.name);
	System.out.println(s1.id);
	}
	}

	//3.using Constructor
	class student
	{
	String name;
	int id;
	student(String n,int i){
	this.name=n;
	this.id=i;
	}
	public static void main(String[] args){
	student s2=new student("lalit",303);
	System.out.println(s1.name);
	System.out.println(s1.id);
	}
	}
	//4.using method
	class student
	{
	String name;
	int id;
	student(String n,int i){
	this.name=n;
	this.id=i;
	}
	void details(){
	System.out.println("name ="+this.name);
	System.out.println("id ="+this.id);
	}
	public static void main(String[] args){
	student s4=new student("lalit",404);
	s4.details();
	}
	}
	//5.using block
	class student
	{
	String name;
	int id;
	{
	this.name="Lalit";
	this.id=505;
	}
	public static void main(String[] args){
	student s5=new student();
	System.out.println(s1.name);
	System.out.println(s1.id);
	}
	}



}

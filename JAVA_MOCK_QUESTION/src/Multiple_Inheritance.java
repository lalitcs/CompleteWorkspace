interface Animal{
	void makeSound();
	}
interface Flyable {
	void fly();
	}

class Bird implements Animal, Flyable {
	@Override
    public void makeSound() {
        System.out.println("Chirp chirp!");
    }

    @Override
    public void fly() {
        System.out.println("Flying high!");
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }
}
public class Multiple_Inheritance {

	public static void main(String[] args) {
		 Bird bird = new Bird();
		 bird.makeSound();
		 bird.fly();
		 Dog dog = new Dog();
		 dog.makeSound();
		

	}

}

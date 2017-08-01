
public class InterfaceTest {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		Animal b = new Cat();
		
		System.out.println("New Dog'll eats and makes sound!");
		a.eat();
		a.makeSound();
		
		System.out.println("New Cat'll eats and makes sound!");
		b.eat();
		b.makeSound();

	}

}

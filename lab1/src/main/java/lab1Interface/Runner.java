package lab1Interface;

public class Runner {

	public static void main(String[] args) {
		Bird bird = new Bird();
		System.out.println(bird.canFly());
		System.out.println(bird.speak());
		
		Dog dog = new Dog();
		System.out.println(dog.canFly());
		System.out.println(dog.speak());
		
		Cat cat = new Cat();
		System.out.println(cat.canFly());
		System.out.println(cat.speak());
	}

}

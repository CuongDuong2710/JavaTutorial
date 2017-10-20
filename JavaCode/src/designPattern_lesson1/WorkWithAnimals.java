package designPattern_lesson1;

public class WorkWithAnimals {
	
	int justANum = 10;
	
	public static void main(String[] args) {
		
		// Define new Dog
		Dog fido = new Dog();
		
		// set and get name
		fido.setName("Fido");
		System.out.println(fido.getName());
		
		// set weight < 0 and error
		fido.setWeight(-1);
		
		// print out sound and digHole of Dog
		System.out.println(fido.getSound());
		fido.digHole();
		
		// Define new cat
		Cat mimi = new Cat();
		
		// set and get name
		mimi.setName("Mimi");
		System.out.println(mimi.getName());
		
		// print out sound
		System.out.println(mimi.getSound());
		
		// call changeVar
		int randNum = 10;
		fido.changeVar(randNum);
		
		System.out.println("randNum after method: " + randNum);
		
		// change name
		changeObjectName(fido);
		System.out.println(fido.getName());
		
		// video 2
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		// Doggy and kitty call right method is defined inside of their individual classes
		System.out.println("Doggy says: " + doggy.getSound());
		System.out.println("Kitty says: " + kitty.getSound());
		
		// add to array
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		
		// call right method
		System.out.println("Doggy says: " + animals[0].getSound());
		System.out.println("Kitty says: " + animals[1].getSound());
		
		speakAnimal(kitty);
		
		// can't reference methods or fields that are not inside of animal.
		// The method digHole() is undefined for the type Animal. So
		// 1. create a method digHolde() in Animal
		// 2. Cast to Dog
		((Dog)doggy).digHole();
		
		// Cannot make a static reference to the non-static field 'justANum'
		// System.out.println(justANum);
		
		// Cannot make a static reference to the non-static method 'sayHello()' from the type 'WorkWithAnimals'
		// sayHello();
		
		// The method bePrivate() from the type Dog is not visible
//		fido.bePrivate();
		fido.accessPrivate();
		
		Giraffe giraffe = new Giraffe();
		giraffe.setName("Frank");
		System.out.println(giraffe.getName());
	}
	
	/**
	 * This method is not tied to an object. It is own of class
	 */
	public static void changeObjectName(Dog fido) {
		fido.setName("Marcus");
	}
	
	public static void speakAnimal(Animal randAnimal) {
		System.out.println("Animal says: " + randAnimal.getSound());
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
}

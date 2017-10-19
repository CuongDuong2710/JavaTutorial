package designPattern_lesson1;

public class WorkWithAnimals {
	
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
	}
	
	/**
	 * This method is not tied to an object. It is own of class
	 */
	public static void changeObjectName(Dog fido) {
		fido.setName("Marcus");
	}
}

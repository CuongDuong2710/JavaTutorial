package lesson15_Interface_Abstract;

import lesson14_Polymorphism.Animals;

/**
 * This class to test protected 'color' fields in 'Animals' class in package 'lesson14_Polymorphism'.
 * Another package
 * @author QUOC CUONG
 *
 */
public class Cat extends Animals{
	
	// Cat can access 'color'
	public Cat(String color) {
		this.color = color;
	}
	
	public static void main(String[] args) {
		Animals genericAnimal = new Animals();
		
		System.out.println(genericAnimal.favFood);
		genericAnimal.eatStuff();
		
		// genericAnimal cannot access 'protected' fields & method in another package 
		
		// The field Animals.color is not visible
		// genericAnimal.color;
		// The method getName() from the type Animals is not visible
//		genericAnimal.getName();
		
		Cat cat = new Cat("Blue");
		System.out.println(cat.color);
		
	}
}

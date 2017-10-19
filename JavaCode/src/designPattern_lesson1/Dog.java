package designPattern_lesson1;

/**
 * Dog is a Animal. It is a subclass of Animal
 * @author QUOC CUONG
 *
 */
public class Dog extends Animal{
	
	/**
	 * Define method of Dog
	 */
	public void digHole() {
		System.out.println("Dug a hole");
	}
	
	public Dog() {
		super();
		
		// setting sound of Dog
		setSound("Bark");
	}
	
	public void changeVar(int randNum) {
		randNum = 12;
		
		System.out.println("randNum in method: " + randNum);
	}
	
}

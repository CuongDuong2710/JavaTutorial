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
	
	// change value
	public void changeVar(int randNum) {
		randNum = 12;
		
		System.out.println("randNum in method: " + randNum);
	}
	
	// private method
	private void bePrivate() {
		System.out.println("In a private method");
	}
	
	// access private method
	public void accessPrivate() {
		bePrivate();
	}
	
}

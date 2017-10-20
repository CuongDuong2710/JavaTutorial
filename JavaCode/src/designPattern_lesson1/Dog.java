package designPattern_lesson1;

import strategy_pattern.CantFly;

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
		
		// Strategy Pattern
		// We set the Flys interface polymorphically
		        // This sets the behavior as a non-flying Animal

		flyingType = new CantFly();
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
	
	// Strategy pattern - bad code. It duplicate if have a lot of animals can not fly.
	/* BAD
	    * You could override the fly method, but we are breaking
	    * the rule that we need to abstract what is different to
	    * the subclasses
	    */
//	@Override
//	public void fly() {
//		System.out.println("Cannot fly");
//	}
	
}

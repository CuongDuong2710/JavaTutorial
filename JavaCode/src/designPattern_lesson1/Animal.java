package designPattern_lesson1;

import strategy_pattern.Flys;

/**
 * Super class defines general fields of Animal
 * @author QUOC CUONG
 *
 */
public class Animal {
	private String name;
	private double height;
	private int weight;
	private String sound;
	
	// Strategy Design Pattern
	// Instead of using an interface in a traditional way
	// we use an instance variable that is a subclass
	// of the Flys interface.

	// Animal doesn't care what flying type.
	// But it just knows the behavior is available to all of subclasses.
	
	// This is known as Composition : Instead of inheriting
	    // an ability through inheritance the class is composed
	    // with Objects with the right ability
	    // Composition allows you to change the capabilities of
	    // objects at run time!

	public Flys flyingType;
	
	/**
	 * No 'static' means every single object is going to have
	 * its own special setName() method
	 * @param newName
	 */
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return this.name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	/**
	 * Encapsulation to secure data. If weight < 0, we out error
	 * @param newWeight
	 */
	public void setWeight(int newWeight) {
		if (newWeight > 0) {
			this.weight = newWeight;
		} else {
			System.out.println("Weight must be bigger than 0");
		}
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	// Strategy Design Pattern - bad code if we have a lot of animals (fly and can't fly) override. Fly() over and over.
	/* BAD
	    * You don't want to add methods to the super class.
	    * You need to separate what is different between subclasses
	    * and the super class
	*/
	//	public void fly() {
	//		System.out.println("I'm flying");
	//	}
	
	// fly type
	// Animal pushes off the responsibility for flying to flyingType
	public String tryToFly() {
		return flyingType.fly();
	}
	
	// set new fly type
	// If you want to be able to change the flyingType dynamically
	    // add the following method

	public void setFlyingAbility(Flys newFlyType) {
		flyingType = newFlyType;
	}
}

package lesson14_Polymorphism;

/**
 * Animals is a super class. 
 * It expect to make subclasses or copies it to change actions.
 * @author QUOC CUONG
 *
 */
public class Animals {
	// Blue print for all animals
	private String name = "Animal";
	public String favFood = "Food";
	
	/**
	 * Subclass can access 'protected' function. 
	 * It is possible to override at the same name.
	 * NOTE: If you want to block a subclass from being able to do that, put 'final' word.
	 * This means this method cannot be changed by any subclasses (cannot override).
	 * @param newName
	 */
	protected final void changeName(String newName) {
		this.name = newName;
	}
	
	/**
	 * Get the name of this animal
	 * @return name
	 */
	protected final String getName() {
		return this.name;
	}
	
	/**
	 * Animals how to eat
	 */
	public void eatStuff() {
		System.out.println("Yum" + favFood);
	}
	
	/**
	 * Animals how to walk
	 */
	public void walkAround() {
		System.out.println(this.name + " walks around");
	}
	
	/**
	 * The constructor method is executed when an Object is created
	 */
	public Animals() {
	}
	
	public Animals(String name, String favFood) {
		this.changeName(name);
		this.favFood = favFood;
	}
	
}

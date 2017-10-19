package lesson14_Polymorphism;

/**
 * Cat is subclass 'extends' from Animals. It is copy of the Animal class (all the methods and all the fields).
 * Cat is inherited from Animals.
 * @author QUOC CUONG
 *
 */
public class Cat extends Animals{
	// Can define new fields. Animals cannot access it.
	public String favToy = "Yarn";
	
	public void playWith() {
		System.out.println("Yeah " + favToy);
	}
	
	@Override
	public void walkAround() {
		System.out.println(this.getName() + " stalks around" );
	}
	
	/**
	 * Return favorite toy
	 * @return
	 */
	public String getToy() {
		return this.favToy;
	}
	
	public Cat() {
		
	}
	
	public Cat(String name, String favFood, String favToy) {
		// passing fields in super Animals. 
		// If don't call super, it always return 'name = Animal' and 'favFood = Food'
		 super(name, favFood);
		// favorite toy does not exist in Animals class. 
		// So we define it in this constructor. 
		this.favToy = favToy;
	}
}

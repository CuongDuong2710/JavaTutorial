package designPattern_lesson1;

/**
 * Abstract class
 * 1. No abstract fields
 * 2. Can have static methods
 * @author QUOC CUONG
 *
 */
abstract public class Creature {
	
	// 'protected' fields are like 'private' fields except subclasses.
	protected String name;
	protected int weight;
	protected String sound;
	public static final double PI = 3.14;
	
	// All methods don't have to be abstract
	public abstract void setName(String newName);
	public abstract String getName();
	
	public abstract void setWeight(String newWeight);
	public abstract void getWeight();
}

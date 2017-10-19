package designPattern_lesson1;

/**
 * Super class define general fields of Animal
 * @author QUOC CUONG
 *
 */
public class Animal {
	private String name;
	private double height;
	private int weight;
	private String sound;
	
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
}

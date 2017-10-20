package designPattern_lesson1;

/**
 * This 'Giraffe' extends to implement abstract methods from Creature.
 * @author QUOC CUONG
 *
 */
public class Giraffe extends Creature{
	
	private String name;

	@Override
	public void setName(String newName) {
		name = newName;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setWeight(String newWeight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getWeight() {
		// TODO Auto-generated method stub
		
	}

}

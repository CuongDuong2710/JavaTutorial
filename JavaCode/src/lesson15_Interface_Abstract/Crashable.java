package lesson15_Interface_Abstract;

/**
 * Whenever you want to create a class in which 
 * every method doesn't necessarily have to be implemented to use abstract class.
 * @author QUOC CUONG
 *
 */
public abstract class Crashable {
	boolean carDrivable = true;
	
	public void youCrashed() {
		this.carDrivable = false;
	}
	
	public abstract void setCarStrength(int carStrength);
	
	public abstract int getCarStrength();

}

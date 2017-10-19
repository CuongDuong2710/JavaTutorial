package lesson15_Interface_Abstract;

/**
 * Vehicle will grab all methods of 'Drivable' interface.
 * Make sure all methods is 'public'
 * @author QUOC CUONG
 *
 */
public class Vehicle extends Crashable implements Drivable{

	int numOfWheels = 2;
	double theSpeed = 0;
	
	int carStrength = 0;
	
	@Override
	public int getWheel() {
		return this.numOfWheels;
	}

	@Override
	public void setWheels(int numWheels) {
		this.numOfWheels = numWheels;
	}

	@Override
	public double getSpeed() {
		return this.theSpeed;
	}

	@Override
	public void setSpeed(double speed) {
		this.theSpeed = speed;
	}
	
	public Vehicle(int wheels, double speed) {
		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}

	/**
	 * Override normal method
	 */
	@Override
	public void youCrashed() {
		// TODO Auto-generated method stub
		super.youCrashed();
	}
	
	/**
	 * Implement abstract method
	 */
	@Override
	public void setCarStrength(int carStrength) {
		this.carStrength = carStrength;
	}

	/**
	 * Implement abstract method
	 */
	@Override
	public int getCarStrength() {
		return this.carStrength;
	}

}

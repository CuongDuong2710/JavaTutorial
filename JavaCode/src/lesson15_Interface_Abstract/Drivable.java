package lesson15_Interface_Abstract;

/**
 * Java does not allow you to inherit from multiple different classes.
 * Whenever you want to add additional functionality to a class that already is inheriting from another class.
 * In this situation, you'd probably use an interface.
 * ====================================================
 * Interface is just an empty class that provides or tells someone 
 * what methods they must implement if they want to use. 
 * @author QUOC CUONG
 *
 */
public interface Drivable {
	// You can put fields in Interface but you have to understand that
	// they are final (constants). They are never going to change
	
	double PI = 3.14;
	
	// Method in interface is 'public' and 'abstract' so don't need to write
	// public abstract int getWheel();
	int getWheel();
	
	void setWheels(int numWheels);
	
	double getSpeed();
	
	void setSpeed(double speed);
}

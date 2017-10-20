package observer_pattern;

import java.util.ArrayList;

/**
 * Implements all methods from Subject.
 * It maintains a list of observers (stock grabber) and notify any state changes to them.
 * @author QUOC CUONG
 *
 */
public class StockGrabber implements Subject{
	
	// Maintain a list of its dependents
	private ArrayList<Observer> observers;
	
	// Price of each stock
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	// Constructor initialize list of observers
	public StockGrabber() {
		this.observers = new ArrayList<>();
	}

	/**
	 * Register new observer and notify to them any state changes
	 */
	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	/**
	 * Unregister observer and DO NOT notify to them any state changes
	 */
	@Override
	public void unregister(Observer deleteObserver) {
		// get index of delete observer
		int observerIndex = observers.indexOf(deleteObserver);
		
		System.out.println("Observer " + (observerIndex + 1) + " deleted");
		// delete
		observers.remove(observerIndex);
	}

	/**
	 * Notify all register observers about update stock price
	 */
	@Override
	public void notifyObserver() {
		
		for(Observer observer : observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
	}

	/**
	 * Set new IBM stock price and notify to all register observers
	 * @param newIbmPrice
	 */
	public void setIbmPrice(double newIbmPrice) {
		this.ibmPrice = newIbmPrice;
		notifyObserver(); // notify
	}

	/**
	 * Set new Apple stock price and notify to all register observers
	 * @param newAaplPrice
	 */
	public void setAaplPrice(double newAaplPrice) {
		this.aaplPrice = newAaplPrice;
		notifyObserver(); // notify
	}

	/**
	 * Set new Google stock price and notify to all register observers
	 * @param newGoogPrice
	 */
	public void setGoogPrice(double newGoogPrice) {
		this.googPrice = newGoogPrice;
		notifyObserver(); // notify
	}
	
	
}

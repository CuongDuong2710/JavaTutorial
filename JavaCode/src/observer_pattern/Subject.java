package observer_pattern;

/**
 * Declaring all necessary methods to register, unregister 
 * and notify for all observer (stock grabber)
 * @author QUOC CUONG
 *
 */
public interface Subject {
	
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();

}

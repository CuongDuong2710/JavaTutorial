package observer_pattern;

/**
 * Declaring update method for all observers
 * @author QUOC CUONG
 *
 */
public interface Observer {

	public void update(double ibmPrice, double aaplPrice, double googPrice);
}

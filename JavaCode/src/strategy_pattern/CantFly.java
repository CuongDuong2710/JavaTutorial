package strategy_pattern;

/**
 * // Classes that implement new Flys interface
// subclasses can allow other classes to use
// that code eliminating code duplication
 * // Class used if the Animal can't fly
 * @author QUOC CUONG
 *
 */

public class CantFly implements Flys{

	@Override
	public String fly() {
		return "I can't fly";
	}
}

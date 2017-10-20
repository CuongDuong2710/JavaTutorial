package strategy_pattern;

/**
 * Class used if the Animal can fly
 * @author QUOC CUONG
 *
 */
public class ItFlys implements Flys {

	@Override
	public String fly() {
		return "Flying High";
	}
}

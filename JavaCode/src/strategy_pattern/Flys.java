package strategy_pattern;

/**
 * This interface is implemented by many other different subclasses.
 * Allow us to create many different types of flying without affecting animal or any subclasses.
 * Eliminating code duplication.
 * @author QUOC CUONG
 *
 */
public interface Flys {
	String fly();
}

// The public type CantFly must be defined in its own file

//public class CantFly implements Flys {
//
//	@Override
//	public String fly() {
//		return "I can't fly";
//	}
//	
//}

// It's protected so Dog is not received CantFly
//class CantFly implements Flys {
//
//	@Override
//	public String fly() {
//		return "I can't fly";
//	}
//	
//}
package singleton_pattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Only have one instance of a class created.
 * @author QUOC CUONG
 *
 */
public class Singleton {

	// 'firstInstance' is going to hold the one and only instance for the class.
	// And 'static' means need to be available on global basis
	private static Singleton firstInstance = null;
	
	String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
			"b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
			"e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
			"h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
			"l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
			"o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
			"r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
			"u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",}; 

	private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));
	
	static boolean firstThread = true;
	
	// Constructor is 'private' to make sure that there is only one instance of class.
	private Singleton(){}
	
	public static Singleton getInstance() {
		if(firstInstance == null) {
			
			// if 'firstInstance' isn't exist so created.
			firstInstance = new Singleton();
		}
		return firstInstance;
	}
}

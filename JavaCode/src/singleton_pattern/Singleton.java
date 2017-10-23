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
	
	// Used to slow down 1st thread
	static boolean firstThread = true;
	
	// Constructor is 'private' to make sure that there is only one instance of class.
	private Singleton(){}
	
	// We could make getInstance a synchronized method to force
	// every thread to wait its turn. That way only one thread
    // can access a method at a time. This can really slow everything
	// down though
	// public static synchronized Singleton getInstance()

	public static Singleton getInstance() {
		if(firstInstance == null) {
			
			 // This is here to test what happens if threads try
			 // to create instances of this class

			if(firstThread) {
				
				firstThread = false;
				
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			// Here we just use synchronized when the first object
			// is created

			synchronized (Singleton.class) {
				if(firstInstance == null) {
					// If the instance isn't needed it isn't created
					// This is known as lazy instantiation
					firstInstance = new Singleton();
					
					// shuffle letter list
					Collections.shuffle(firstInstance.letterList);
				}
			}
		}
		
		return firstInstance;
	}
	
	public LinkedList<String> getLetterList() {
		return firstInstance.letterList;
	}
	
	public LinkedList<String> getTiles(int howManyTiles) {
		LinkedList<String> tilesToSend = new LinkedList<>();
		
		for(int i = 0; i <= howManyTiles; i++) {
			// remove string at index zero (letterList)
			// and then add to tilesToSend
			tilesToSend.add(firstInstance.letterList.remove(0));
		}
		return tilesToSend;
	}
}

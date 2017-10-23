package singleton_pattern;

import java.util.LinkedList;

public class ScrabbleTest {
	
	public static void main(String[] args) {
		
		// get instance 1 of Singleton
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance 1 ID: " + System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		System.out.println("First thread: " + newInstance.firstThread);
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("Player 1: " + playerOneTiles);
		
		System.out.println(newInstance.getLetterList());
		
		// get instance 2 of Singleton.
		
		// The instances for these two objects event though two separate objects
		// were trying to be created. You can see that the same object
		// Instance 1 ID: 1829164700
		// Instance 2 ID: 1829164700
		Singleton instanceTwo = Singleton.getInstance();
		
		System.out.println("Instance 2 ID: " + System.identityHashCode(newInstance));
		
		System.out.println(instanceTwo.getLetterList());
		
		System.out.println("First thread: " + instanceTwo.firstThread);
		
		LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
		
		System.out.println("Player 2: " + playerTwoTiles);
		
		System.out.println(newInstance.getLetterList());
	}

}

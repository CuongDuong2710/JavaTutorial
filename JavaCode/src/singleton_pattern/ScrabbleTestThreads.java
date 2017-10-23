package singleton_pattern;

public class ScrabbleTestThreads {
	
	public static void main(String[] args) {
		// Creating separate two objects with different instance ID
		Runnable getTiles = new GetTheTiles();
		
		Runnable getTilesAgain = new GetTheTiles();
		
		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();
	}

}

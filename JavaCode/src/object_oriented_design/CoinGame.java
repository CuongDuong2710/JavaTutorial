package object_oriented_design;

/**
 * Starting the game
 * @author QUOC CUONG
 *
 */
public class CoinGame {
	
	Player[] players = new Player[2];
	
	Coin theCoin = new Coin();
	
	CoinGame(String player1Name, String player2Name) {
		
		players[0] = new Player(player1Name);
		players[1] = new Player(player2Name);
		
	}
	
	/**
	 * Starting the game
	 */
	public void startGame() {
		
		// get random player
		int randIndex = (Math.random() < 0.5 ) ? 0 : 1;
		String playersPick = players[randIndex].getRandCoinOption();
		
		System.out.println("randIndex: " + randIndex);
		
		// get other player
		int opponentsIndex = (randIndex == 0) ? 1 : 0;
		players[opponentsIndex].setCoinOption(playersPick);
		
		// get winning flip
		String winningFlip = theCoin.getCoinOption();
		System.out.println("winningFlip: " + winningFlip);
		
		// check winning player
		players[0].didPlayerWin(winningFlip);
		players[1].didPlayerWin(winningFlip);
	}

}

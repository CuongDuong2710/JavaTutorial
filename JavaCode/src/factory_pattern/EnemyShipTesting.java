package factory_pattern;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		EnemyShip theEnemy = null;
		
//		UFOEnemyShip ufoShip = new UFOEnemyShip();
//		ufoShip.setABC();
		
		Scanner userInput = new Scanner(System.in);
		
		String enemyOption = "";
		
		System.out.println("What type of ship? (U/ R/ B)");
		
		if(userInput.hasNextLine()) {
			
			enemyOption = userInput.nextLine();
			
			theEnemy = shipFactory.makeEnemyShip(enemyOption);
			
		}
		
		if(theEnemy != null) {
			doStuffEnemy(theEnemy);
		} else {
			System.out.println("Enter a U, R or B next time!");
		}
		
		userInput.close();
		
	}
	
	public static void doStuffEnemy(EnemyShip enemyShip) {
		
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}
}

package factory_pattern;

public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String newShipType) {
		
		EnemyShip newShip = null;
		
		if(newShipType.equalsIgnoreCase("U")) {
			
			newShip = new UFOEnemyShip();
			
		} else if(newShipType.equalsIgnoreCase("R")) {
			
			newShip = new RocketEnemyShip();
			
		} else if(newShipType.equalsIgnoreCase("B")) {
			
			newShip = new BigUFOEnemyShip();
			
		}
		
		return newShip;
		
	}

}

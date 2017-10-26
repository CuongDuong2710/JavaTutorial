package factory_pattern;

public class UFOEnemyShip extends EnemyShip{
	
	public UFOEnemyShip() {
		
		setName("UFO Enemy Ship");
		setAmtDamage(20.0);
		
	}
	
	public void setABC() {
		System.out.println("ABC");
	}

}

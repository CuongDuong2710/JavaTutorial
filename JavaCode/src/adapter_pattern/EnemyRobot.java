package adapter_pattern;

import java.util.Random;

//This is the Adaptee. The Adapter sends method calls
//to objects that use the EnemyAttacker interface
//to the right methods defined in EnemyRobot

//square peg
public class EnemyRobot {
	
	Random generator = new Random();
	
	public void smashWithHands(){
		
		int attackDamage = generator.nextInt(10) + 1;
		
		System.out.println("Enemy Robot Causes " + attackDamage + " Damage With It Hands");
	}
	
	public void walkForward(){
		
		int movement = generator.nextInt(5) + 1;
		
		System.out.println("Enemy Robot Walks Forward " + movement + " Spaces");
	}
	
	public void reactToHuman(String driverName){
		
		System.out.println("Enemy Robot Tramps on " + driverName);
	}

}

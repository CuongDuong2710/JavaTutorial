package factory_method_pattern;

public class App {

	private final BlackSmith blackSmith;
	
	public App(BlackSmith blackSmith) {
		this.blackSmith = blackSmith;
	}
	
	public static void main(String[] args) {
		// Lets go to war with Orc weapons
		App app = new App(new OrcBlackSmith());
		app.manufactureWeapons();
		
		// Lets go to war with Elf weapons
		app = new App(new ElfBlackSmith());
		app.manufactureWeapons();
		
	}

	private void manufactureWeapons() {
		Weapon weapon;
		weapon = blackSmith.manufactureWeapon(WeaponType.SPEAR);
		System.out.println(weapon.toString());
		weapon = blackSmith.manufactureWeapon(WeaponType.AXE);
		System.out.println(weapon.toString());
	}
}

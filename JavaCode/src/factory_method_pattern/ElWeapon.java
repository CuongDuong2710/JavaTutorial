package factory_method_pattern;

public class ElWeapon implements Weapon {
	
	private WeaponType weaponType;
	
	public ElWeapon(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public WeaponType getWeaponType() {
		return weaponType;
	}
	
	@Override
	public String toString() {
		return "Elven " + weaponType;
	}

}

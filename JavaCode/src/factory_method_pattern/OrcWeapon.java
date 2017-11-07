package factory_method_pattern;

public class OrcWeapon implements Weapon {
	
	private WeaponType weaponType;
	
	public OrcWeapon(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public WeaponType getWeaponType() {
		return weaponType;
	}
	
	@Override
	public String toString() {
		return "Orc " + weaponType;
	}

}

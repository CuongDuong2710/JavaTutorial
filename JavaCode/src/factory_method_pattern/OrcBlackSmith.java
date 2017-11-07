package factory_method_pattern;

public class OrcBlackSmith implements BlackSmith{

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new OrcWeapon(weaponType);
	}

}

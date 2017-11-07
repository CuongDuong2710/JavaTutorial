package factory_method_pattern;

/**
 * Concrete subclass for creating new objects.
 * @author QUOC CUONG
 *
 */
public class ElfBlackSmith implements BlackSmith {

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new ElWeapon(weaponType);
	}

}

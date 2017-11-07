package factory_method_pattern;

/**
 * The interface containing method for producing objects.
 */

public interface BlackSmith {
	
	Weapon manufactureWeapon(WeaponType weaponType);

}

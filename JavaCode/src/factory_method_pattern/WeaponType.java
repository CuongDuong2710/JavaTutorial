package factory_method_pattern;

public enum WeaponType {
	
	SHORT_SWORD("short word"), SPEAR("spear"), AXE("axe"), UNDEFINED("");
	
	private String title;
	
	private WeaponType(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return title;
	}
}

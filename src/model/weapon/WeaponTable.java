package model.weapon;

import core.Scaling;

public enum WeaponTable {
	
	BARE_HOOVES("None", 1, 0, 0, Scaling.ATT_SCALING, "", false),
	KNIFE("Knife", 5, 0, 0, Scaling.ATT_SCALING, "Basic knife.", false),
	MAGIC_BOOK("Magic Book", 5, 0, 0, Scaling.SP_ATT_SCALING, "Basic knife.", false),
	ULTIMA_WEAPON("Ultima Weapon", 255, 0, 100, Scaling.DUO_SCALING, "OMFG! BROKEN AS FUCK!", true);
	
	private Weapon weapon;
	
	private WeaponTable(String name, int damage, int critChance, 
			int deadlyChance, Scaling scalling, 
			String description, boolean special){
		this.weapon = new Weapon(
		name,
		damage,
		critChance,
		deadlyChance,
		scalling,
		description,
		special);
	}
	
	public Weapon getWeapon(){
		return this.weapon;
	}
}

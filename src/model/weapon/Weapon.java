package model.weapon;

import core.Scaling;

public class Weapon {
	
	protected String name;
	protected int damage;
	protected String description;
	protected Scaling scallingType;
	protected int critChance;
	protected int deadlyChance;
	protected boolean specialWeapon;
	
	public Weapon(String name, int damage, int critChance, 
			int deadlyChance, Scaling scalling, 
			String description, boolean special){
		this.name = name;
		this.damage = damage;
		this.critChance = critChance;
		this.deadlyChance = deadlyChance;
		this.scallingType = scalling;
		this.description = description;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getDamage() {
		return damage;
	}

	public String getDescription() {
		return description;
	}

	public Scaling getScallingType() {
		return scallingType;
	}

	public int getCritChance() {
		return critChance;
	}

	public int getDeadlyChance() {
		return deadlyChance;
	} 
}

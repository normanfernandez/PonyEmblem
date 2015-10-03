package model.weapon;

public abstract class Weapon {
	
	protected String name;
	protected int damage;
	protected String description;
	protected int scallingType;
	protected int critChance;
	protected int deadlyChance;
	
	public Weapon(String name){
		this.name = name;
		initWeapon();
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

	public int getScallingType() {
		return scallingType;
	}

	public int getCritChance() {
		return critChance;
	}

	public int getDeadlyChance() {
		return deadlyChance;
	}

	protected abstract void initWeapon(); 
}

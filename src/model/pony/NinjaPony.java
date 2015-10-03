package model.pony;

import model.attack.*;

public class NinjaPony extends Pony {
	private final int BASE_HP = 5;
	private final int BASE_ATT = 3;
	private final int BASE_DEF = 2;
	private final int BASE_SPATT = 1;
	private final int BASE_SPDEF = 1;
	private final String BASE_TYPE = "Ninja";
	
	protected void initStats(){
		this.maxHitpoints = BASE_HP;
		this.attack = BASE_ATT;
		this.defense = BASE_DEF;
		this.spAttack = BASE_SPATT;
		this.spDefefense = BASE_SPDEF;
		this.mainType = BASE_TYPE;
		this.attacks.insert(new Tackle());
		this.attacks.insert(new Spark());
		this.removeWeapon();
	}
	
	public NinjaPony(String name, GenderType gender){
		super(name, gender);
	}
	
	public NinjaPony(String name, GenderType gender, int level){
		super(name, gender, level);
	}

	public void lvlUp() {
		if(level >= 100)
			return;
		
		this.level++;
		this.maxHitpoints = BASE_HP + level * 1;
		this.attack = BASE_ATT + level * 3;
		this.defense = BASE_DEF + level * 2;	
	}
}

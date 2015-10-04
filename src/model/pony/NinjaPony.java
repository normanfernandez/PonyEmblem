package model.pony;

import model.attack.*;

public class NinjaPony extends Pony {
	private final int BASE_HP = 18;
	private final int BASE_ATT = 3;
	private final int BASE_DEF = 2;
	private final int BASE_SPATT = 1;
	private final int BASE_SPDEF = 1;
	private final String BASE_TYPE = "Ninja Pony";
	
	protected void initStats(){
		this.maxHitpoints = BASE_HP;
		this.currentHitpoints = maxHitpoints;
		this.attack = BASE_ATT;
		this.defense = BASE_DEF;
		this.spAttack = BASE_SPATT;
		this.spDefefense = BASE_SPDEF;
		this.mainType = BASE_TYPE;
		this.attacks.insert(AttackTable.TACKLE.getAttack());
		this.removeWeapon();
	}
	
	public NinjaPony(String name, PonyGender gender){
		super(name, gender);
	}
	
	public NinjaPony(String name, PonyGender gender, int level){
		super(name, gender, level);
	}

	public void lvlUp() {
		if(level >= 100)
			return;
		
		this.level++;
		this.maxHitpoints = BASE_HP + level * 1;
		this.attack = BASE_ATT + level * 5;
		this.defense = BASE_DEF + level * 2;	
	}

}

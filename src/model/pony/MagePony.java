package model.pony;

public abstract class MagePony extends Pony{
	private final int BASE_HP = 15;
	private final int BASE_ATT = 2;
	private final int BASE_DEF = 2;
	private final int BASE_SPATT = 3;
	private final int BASE_SPDEF = 2;
	private final String BASE_TYPE = "Ninja";
	
	protected void initStats(){
		this.maxHitpoints = BASE_HP;
		this.attack = BASE_ATT;
		this.defense = BASE_DEF;
		this.spAttack = BASE_SPATT;
		this.spDefefense = BASE_SPDEF;
		this.mainType = BASE_TYPE;
		this.removeWeapon();
	}
	
	public MagePony(String name, PonyGender gender){
		super(name, gender);
	}
	
	public MagePony(String name, PonyGender gender, int level){
		super(name, gender, level);
	}

	public void lvlUp() {
		if(level >= 100)
			return;
		
		this.level++;
		this.maxHitpoints = BASE_HP + level * 1;
		this.attack = BASE_SPATT + level * 3;
		this.defense = BASE_SPDEF + level * 2;	
	}
}

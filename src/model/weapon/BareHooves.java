package model.weapon;

import core.Scalling;

public class BareHooves extends Weapon{
	public BareHooves(){
		super("None!");
	}
	
	public void initWeapon(){
		this.damage = 1;
		this.scallingType = Scalling.ATT_SCALLING;
		this.critChance = 0;
		this.deadlyChance = 0;
		this.description = "No weapons!";
	}
}

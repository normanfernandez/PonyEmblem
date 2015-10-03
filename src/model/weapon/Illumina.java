package model.weapon;

import core.Scalling;

public class Illumina extends Weapon{
	
	public Illumina(){
		super("Illumina");
	}
	
	public void initWeapon(){
		this.damage = 32;
		this.scallingType = Scalling.ATT_SCALLING;
		this.critChance = 55;
		this.deadlyChance = 40;
		this.description = "OMG! PLZ NERF!";
	}
}

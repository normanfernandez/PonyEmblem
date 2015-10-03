package model.weapon;

import core.Scalling;

public class Ultima extends Weapon{
	public Ultima(){
		super("Ultima");
	}
	
	public void initWeapon(){
		this.damage = 32;
		this.scallingType = Scalling.DUO_SCALLING;
		this.critChance = 0;
		this.deadlyChance = 100;
		this.description = "Real damage fucking everywhere!";
	}
}

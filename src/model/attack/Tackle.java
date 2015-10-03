package model.attack;

import core.Scalling;

public final class Tackle extends Attack {
	public Tackle(){
		super("Tackle");
	}
	
	protected void initAttack(){
		this.accuracy = 85;
		this.baseCrit = 5;
		this.baseDeadly = 3;
		this.mainScalling = Scalling.ATT_SCALLING;
		this.description = "Basic shit!";
	}
}

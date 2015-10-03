package model.attack;

import core.Scalling;

public class Spark extends Attack {
	public Spark(){
		super("Spark");
	}
	
	protected void initAttack(){
		this.accuracy = 85;
		this.baseCrit = 5;
		this.baseDeadly = 3;
		this.mainScalling = Scalling.SP_ATT_SCALLING;
		this.description = "Basic shit!";
	}
}

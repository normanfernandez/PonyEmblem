package model.attack;

import core.Scaling;

public final class Attack {
	protected String name;
	protected int baseAttack;
	protected int baseCrit;
	protected int baseDeadly;
	protected int accuracy;
	protected Scaling mainScalling;
	protected String description;
	
	Attack(String name, int baseAttack, 
			int baseCrit, int baseDeadly, int accuracy, 
			Scaling scalling, String description){
		this.name = name;
		this.baseAttack = baseAttack;
		this.baseCrit = baseCrit;
		this.baseDeadly = baseDeadly;
		this.accuracy = accuracy;
		this.mainScalling = scalling;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}

	public int getBaseCrit() {
		return baseCrit;
	}

	public int getBaseDeadly() {
		return baseDeadly;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public Scaling getMainScalling() {
		return mainScalling;
	}

	public String getDescription() {
		return description;
	}

	public int getBaseAttack() {
		return baseAttack;
	}
}

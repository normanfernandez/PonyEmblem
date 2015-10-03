package model.attack;

public abstract class Attack {
	protected String name;
	protected int baseCrit;
	protected int baseDeadly;
	protected int accuracy;
	protected int mainScalling;
	protected String description;
	
	public Attack(String name){
		this.name = name;	
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

	public int getMainScalling() {
		return mainScalling;
	}

	public String getDescription() {
		return description;
	}

	protected abstract void initAttack();
}

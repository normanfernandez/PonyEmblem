package model.attack;

import core.Scaling;

public enum AttackTable {
	TACKLE("Tackle", 35, 5, 3, 85, Scaling.ATT_SCALING, "Basic tackle againts the opponent."),
	SPARK("Spark", 35, 5, 3, 85, Scaling.SP_ATT_SCALING, "Basic spark againts the opponent."),
	OMNI_IMPACT("OmniImpact", 120, 10, 20, 70, Scaling.ATT_SCALING, "Ultimate Physical Attack."),
	FALLEN_STAR("Fallen Star", 120, 10, 20, 70, Scaling.SP_ATT_SCALING, "Ultimate Magic Attack."),
	ULTIMA("Ultima", 160, 75, 100, 100, Scaling.DUO_SCALING, "Best Attack! PLZ NERF!")
	;
	
	private Attack attack;
	
	private AttackTable(String name, int baseAttack, 
			int baseCrit, int baseDeadly, int accuracy, 
			Scaling scalling, String description){
		this.attack = new Attack(
		name,
		baseAttack,
		baseCrit,
		baseDeadly,
		accuracy,
		scalling,
		description);
	}
	
	public Attack getAttack(){
		return this.attack;
	}
}

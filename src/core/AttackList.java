package core;

import java.util.ArrayList;
import model.attack.Attack;

public final class AttackList extends ArrayList<Attack>{

	public void insert(Attack a){
		if(this.size() >= 4)
			return;
		this.add(a);
	}
	
	public String getAttacks(){
		String result = "";
		for(Attack a : this){
			result += a.getName() + " - ";
		}
		return result;
	}
}

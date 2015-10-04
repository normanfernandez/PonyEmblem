package core;

import model.attack.Attack;
import model.pony.Pony;

public interface Fight {
	public int attack(Pony defendingPony, Attack attack);
	public void defend(Pony attackingPony, int damage);
}

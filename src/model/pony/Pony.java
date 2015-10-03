package model.pony;

import core.AttackList;
import core.EquipWeapon;
import core.Fight;
import model.weapon.BareHooves;
import model.weapon.Weapon;

public abstract class Pony implements Fight, EquipWeapon{
 
	public enum GenderType {GENDER_MALE, GENDER_FEMALE, GENDER_UNKNOWN;};
	protected String name;
	protected int maxHitpoints;
	protected int currentHitpoints;
	protected int level;
	protected int attack;
	protected int defense;
	protected int spAttack;
	protected int spDefefense;
	protected String mainType;
	protected Weapon currentWeapon;
	protected GenderType gender;
	protected AttackList attacks = new AttackList();
	
	protected Pony(String name, GenderType g){
		this.name = name;
		this.gender = g;
		this.level = 1;
		initStats();
	}
	
	protected Pony(String name,  GenderType g, int level){
		this(name, g);
		this.level = level;
	}

	protected final void die(){
		System.out.println("OH NOES! " + name + " just died!");
	}
	
	protected abstract void initStats();
	
	public abstract void lvlUp();
	
	public void fight(Pony p){
		
	}
	
	public void equipWeapon(Weapon w){
		this.currentWeapon = w;
	}
	
	public void removeWeapon(){
		this.currentWeapon = new BareHooves();
	}
	
	public void showStats(){
		System.out.println("Main stats for: " + name);
		System.out.println("Current Level: " + level);
		System.out.println("Max Hitpoints: " + maxHitpoints);
		System.out.println("Attack: " + attack);
		System.out.println("Defense: " + defense);
		System.out.println("Sp. Attack: " + spAttack);
		System.out.println("Sp. Defense: " + spDefefense);
		System.out.println("Main Type: " + mainType);
		System.out.println("Current Weapon: " + currentWeapon.getName());
		System.out.println("Attacks: " + attacks.getAttacks());
		
	}
}

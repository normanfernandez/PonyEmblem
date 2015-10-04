package model.pony;

import java.util.Random;
import core.AttackList;
import core.EquipWeapon;
import core.Fight;
import core.Scaling;
import model.attack.Attack;
import model.weapon.Weapon;
import model.weapon.WeaponTable;

public abstract class Pony implements Fight, EquipWeapon{
 
	public enum PonyGender {GENDER_MALE, GENDER_FEMALE, GENDER_UNKNOWN;};
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
	protected PonyGender gender;
	protected AttackList attacks = new AttackList();
	
	protected Pony(String name, PonyGender g){
		this.name = name;
		this.gender = g;
		this.level = 1;
		initStats();
	}
	
	protected Pony(String name,  PonyGender g, int level){
		this(name, g);
		this.level = level;
	}
	
	public String getName(){
		return this.name;
	}

	protected final void die(){
		System.out.println("OH NOES! " + name + " just died!");
	}
	
	protected abstract void initStats();
	
	public abstract void lvlUp();
	
	public int attack(Pony p, Attack a){
		Random randomizer = new Random();
		
		if(a.getAccuracy() < randomizer.nextInt(99)){
			System.out.println("MISS!");
			return 0;
		}
		
		int baseCrit = a.getBaseCrit();
		int baseDeadly = a.getBaseDeadly();
		
		int attackDamage = (int) ((level*0.5) + 
				(0.55*(a.getMainScalling() == Scaling.ATT_SCALING ? this.attack : 
					a.getMainScalling() == Scaling.SP_ATT_SCALING ? this.spAttack :
						this.spAttack > this.attack ? this.spAttack : this.attack)));
		
		if(a.getMainScalling() == this.currentWeapon.getScallingType() || 
				this.currentWeapon.getScallingType() == Scaling.DUO_SCALING){
			attackDamage += (int)(a.getBaseAttack() * 1.25);
			baseCrit += a.getBaseCrit();
			baseDeadly += a.getBaseDeadly();
		}
		
		if(baseCrit > randomizer.nextInt(99)){
			attackDamage *= 2;
			System.out.println("CRITICAL!");
		}
		
		int defense = (int)(p.defense*0.8);
		
		if(baseDeadly > randomizer.nextInt(99)){
			defense = 0;
			System.out.println("DEADLY!");
		}
		
		int total = defense > attackDamage ? 0 : attackDamage - defense;
		
		return total;
	}
	
	public void defend(Pony p, int d) {
		this.currentHitpoints -= d;
		if(this.currentHitpoints <= 0){
			this.currentHitpoints = 0;
			die();
		}
		System.out.println("Recieved: " + d + " damage from " + p.getName() + "!");
	}
	
	public void equipWeapon(Weapon w){
		this.currentWeapon = w;
	}
	
	public void removeWeapon(){
		this.currentWeapon = WeaponTable.BARE_HOOVES.getWeapon();
	}
	
	public void showStats(){
		System.out.println("Main stats for: " + name);
		System.out.println("Current Level: " + level);
		System.out.println("Max Hitpoints: " + maxHitpoints);
		System.out.println("Current Hitpoints: " + currentHitpoints);
		System.out.println("Attack: " + attack);
		System.out.println("Defense: " + defense);
		System.out.println("Sp. Attack: " + spAttack);
		System.out.println("Sp. Defense: " + spDefefense);
		System.out.println("Main Type: " + mainType);
		System.out.println("Current Weapon: " + currentWeapon.getName());
		System.out.println("Attacks: " + attacks.getAttacks());
		
	}
	
	public void showHealth(){
		System.out.println("Main health stats for: " + name);
		System.out.println("Max Hitpoints: " + maxHitpoints);
		System.out.println("Current Hitpoints: " + currentHitpoints);		
	}
}

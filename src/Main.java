import model.*;
import model.attack.AttackTable;
import model.pony.MagePony;
import model.pony.NinjaPony;
import model.pony.Pony.PonyGender;
import model.weapon.WeaponTable;


public class Main {

	public static void main(String[] args) {
		NinjaPony p1 = new NinjaPony("Ayumi", PonyGender.GENDER_FEMALE);
		NinjaPony p2 = new NinjaPony("Blanca", PonyGender.GENDER_FEMALE);
		for(int i = 0; i < 98; i++)
			p1.lvlUp();
		p1.equipWeapon(WeaponTable.ULTIMA_WEAPON.getWeapon());
		int dmg = p1.attack(p2, AttackTable.ULTIMA.getAttack());
		p2.defend(p1, dmg);
		p2.showHealth();
	}

}

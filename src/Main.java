import model.*;
import model.pony.NinjaPony;
import model.pony.Pony.GenderType;

public class Main {

	public static void main(String[] args) {
		NinjaPony p1 = new NinjaPony("Ayumi", GenderType.GENDER_FEMALE);
		p1.showStats();
	}

}

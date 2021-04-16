package Population;

import Country.Settlement;
import Location.Point;

public class Vaccinated extends Person {
	
	public Vaccinated(int age, Point locantion, Settlement settlement) {
		super(age, locantion, settlement);
		// TODO Auto-generated constructor stub
	}

	private long vaccinationTime;

	@Override
	public double contagionProbability() {
		// TODO Auto-generated method stub
		return 0;
	}


}

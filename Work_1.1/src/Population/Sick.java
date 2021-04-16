package Population;

import Country.Settlement;
import Location.Point;
import Virus.IVirus;

public class Sick extends Person{
	private long contagiousTime=now; // clock
	private IVirus virus;

	public Sick(int age, Point locantion, Settlement settlement,IVirus virus) {
		super(age, locantion, settlement);
		this.virus=virus;
	}
	
	
	@Override
	public double contagionProbability() {
		// TODO Auto-generated method stub
		return 1;
	}
	public Person recover() {
		
	}
	public boolean tryToDie() {
			return this.virus.tryToKill(this);
	}
}
	
package Virus;

import Population.Person;
import Population.Sick;

public class BritishVariant implements IVirus{

	@Override
	public double contagionProbability(Person a) {
		return 0.7*a.contagionProbability();
	}

	@Override
	public boolean tryToContagion(Person a, Person b) {
		if(b instanceof Sick) {
			return false;
		}
		double p=contagionProbability(a);

		double distance=Math.sqrt(((a.GetPointX())-b.GetPointX())*(a.GetPointX())-b.GetPointX() +
						(a.GetPointY()-b.GetPointY())*(a.GetPointY()-b.GetPointY()));

		double min=Math.min(1, 0.14*Math.pow(Math.E, 2-0.25*distance));	
		if((min*p)>Math.random()) {
			return true;
			
		}
		return false;
	}

	@Override
	public boolean tryToKill(Person a) {
		final double die_0_18=0.01;
		final double die_18_plus=0.1;
		
		double=Math.max(0, 0)
	}
	
	

}

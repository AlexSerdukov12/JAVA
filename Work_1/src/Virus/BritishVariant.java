package Virus;

import Population.Person;

public class BritishVariant implements IVirus{

	@Override
	public double contagionProbability(Person a) {
		return 0.7*a.contagionProbability();
	}

	@Override
	public boolean tryToContagion(Person a, Person b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean tryToKill(Person a) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}

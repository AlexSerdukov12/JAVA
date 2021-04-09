package Virus;

import Population.Person;

public class SouthAfricanVariant implements IVirus{

	@Override
	public double contagionProbability(Person a) {
		int age=a.getAge();
		if(age<18) {
			return 0.6*a.contagionProbability();
		}
		else {
			return 0.5*a.contagionProbability();

		}

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

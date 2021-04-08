package Virus;

import Population.Person;

public interface IVirus {
	
	public double contagionProbability(Person a);
	public boolean tryToContagion(Person a, Person b);
	public boolean tryToKill(Person a);


}

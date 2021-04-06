package Virus;

public interface IVirus {
	
	public double contagionProbability(Person);
	public boolean tryToContagion(Person, Person);
	public boolean tryToKill(Person);

	
}

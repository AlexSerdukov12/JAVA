package Virus;

import Population.Person;

public class ChineseVariant implements IVirus{
	
	public double contagionProbability(Person a) {
		int age=a.getAge();
		if (age<18) {
			return 20/100*a.contagionProbability();
			}
		else if (age>=18 && age<55) {
			return 50/100*a.contagionProbability();
			} 
		else {
			return 70/100*a.contagionProbability();
			}
		
	}
	public boolean tryToContagion(Person a, Person b) {
		double p=contagionProbability(a);
		///check if b sick
		
		double distance=Math. sqrt((a.getLocation().getX()-b.getLocation().getX())*(a.getLocation().getX()-b.getLocation().getX()) +
				(a.getLocation().getY()-b.getLocation().getY())*(a.getLocation().getY()-b.getLocation().getY()));
		
		
		 
		return false;
		
	}
	public boolean tryToKill(Person a) {
		return false;
		
	}
}

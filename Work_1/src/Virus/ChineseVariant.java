package Virus;

import Population.Person;

public class ChineseVariant implements IVirus{
	
	public double contagionProbability(Person a) {
		int age=a.getAge();
		if (age<18) {
			return 20/100;
			}
		else if (age>=18 && age<55) {
			return 50/100;
			} 
		else {
			return 70/100;
			}
		
	}
	public boolean tryToContagion(Person a, Person b) {
	
		
	}
	public boolean tryToKill(Person a) {
		return false;
		
	}
}

package Virus;

import java.sql.Time;

import Population.Person;
import Population.Sick;

public class ChineseVariant implements IVirus{
	
	public double contagionProbability(Person a) {
		int age=a.GetAge();
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
	
	public boolean tryToKill(Person a) {
		
		final double die_0_18=0.1;
		final double die_18_55=0.05;
		final double die_55_plus=0.1;
		double P=Math.random();
		double t= end-start of time;
		double tryToKill=Math.max(0, P-0.01*P*Math.pow((t-15), 2));
		if(tryToKill >0) {
			return true;
		}
		return false;
	}
}

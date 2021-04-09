package Population;

import Country.Settlement;
import Location.Point;
import Virus.IVirus;

public class Sick extends Person{
	private long contagiousTime;
	private IVirus virus;
	
	public Sick(int age,Point locantion , Settlement settlement,long contagiousTime,IVirus virus) {
		super(age,locantion,settlement);
		this.setContagiousTime(contagiousTime);
		this.setVirus(virus);
	}

	@Override
	public double contagionProbability() {
		return 1;
	}

	/// sets and gets //
	public IVirus getVirus() {
		return virus;
	}

	public void setVirus(IVirus virus) {
		this.virus = virus;
	}

	public long getContagiousTime() {
		return contagiousTime;
	}

	public void setContagiousTime(long contagiousTime) {
		this.contagiousTime = contagiousTime;
	}
	
	
	//methods//
	
	public Person recover() {
		
	}
	
	public boolean tryToDie() {
			
	}
		
	


}
	
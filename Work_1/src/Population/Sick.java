package Population;

import Country.Settlement;
import Location.Point;
import Virus.IVirus;

public class Sick extends Person{
	private long contagiousTime;
	private IVirus virus;
	
	public Sick(long contagiousTime,IVirus virus) {
		super();
		this.setContagiousTime(contagiousTime);
		this.setVirus(virus);
	}

	@Override
	public double contagionProbability() {
		// TODO Auto-generated method stub
		return 0;
	}

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
	
	public Person recover() {
		
	}
	
	public boolean tryToDie() {
			
	}
		
	


}
	
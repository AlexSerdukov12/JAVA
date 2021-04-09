package Population;

import Country.Settlement;
import Location.Point;
import Virus.IVirus;

public abstract class Person {
	
	private int age;
	private  Point location;
	private  Settlement settlement;
	public Person(int age,Point locantion , Settlement settlement) {
		this.age=age;
		this.location=locantion;
		this.settlement=settlement;
	}
	/// sets and gets///
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Point getLocation() {
		return location;
	}
	public void setLocation(Point location) {
		this.location = location;
	}
	public Settlement getSettlement() {
		return settlement;
	}
	public void setSettlement(Settlement settlement) {
		this.settlement = settlement;
	}

	/// methods///
	public abstract double contagionProbability();
	
	public Person contagion(IVirus virus) {
		
		
		
	}
	


}

package Population;

import Country.Settlement;
import Location.Point;
import Virus.IVirus;

public abstract class Person {
	
	private int age;
	private  Point location;
	private  Settlement settlement;
	
	public Person(int age,Point location , Settlement settlement) {
		this.age=age;
		this.location=location;
		this.settlement=settlement;
	}
	public Person(Person a) {
		this.age=a.age;
		this.location=a.location;
		this.settlement=a.settlement;
	}

	/// methods///
	public abstract double contagionProbability();
	
	public Person contagion(IVirus virus) {
		return new Sick(this.age,this.location,this.settlement,virus);	
	}
	public int GetAge() {
		return this.age	;
	}
	public double GetPointX() {
		return location.getX();
	}
	public double GetPointY() {
		return location.getY();
	}

}

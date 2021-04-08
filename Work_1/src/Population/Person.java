package Population;

import Country.Settlement;
import Location.Point;
import Virus.IVirus;

public abstract class Person {
	
	private int age;
	private  Point location;
	private  Settlement settlement;

	
	public Person(int age, Point location, Settlement settlementy) {
		this.setAge(age);
		this.location=location;
		this.settlement=settlementy;
	}
	public abstract double contagionProbability();
	public Person contagion(IVirus p) {
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}

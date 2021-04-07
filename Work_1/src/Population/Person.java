package Population;

import Country.Settlement;
import Location.Point;
import Virus.IVirus;

public abstract class Person {
	
	private static int age;
	private static Point location;
	private static Settlement settlement;
	
	public abstract static double contagionProbability();
	public  static Person contagion(IVirus p) {
	}
	

}

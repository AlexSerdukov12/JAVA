package Country;

import java.util.List;

import Location.Location;
import Population.Person;
import Country.RamzorColor;
public class Moshav extends Settlement {

	public Moshav(String name, Location location, List<Person> people, RamzorColor ramzorColor) {
		super(name, location, people, ramzorColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RamzorColor calculateRamzorGrade() {
		double P=contagiousPercent();
        double C=0.3+3*Math.pow((Math.pow(1.2,ramzorColor.getColor())*(P-0.35)),5);
        return RamzorColor();
    }
	
	
	


}

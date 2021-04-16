package Country;

import java.util.List;

import Location.Location;
import Population.Person;

public class City extends Settlement {

	public City(String name, Location location, List<Person> people, RamzorColor ramzorColor) {
		super(name, location, people, ramzorColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RamzorColor calculateRamzorGrade() {
		// TODO Auto-generated method stub
		double P=contagiousPercent();
		
		
		
		
	}
	

}

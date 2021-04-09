package Country;

import java.util.List;

import Location.Location;
import Location.Point;
import Population.Person;
import Population.Sick;

import java.util.Randoml;
import java.util.*;

public class Settlement {
	
	
	private static  String name;
	private static  Location location;
	private static  List<Person> people;
	private static  RamzorColor ramzorColor;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		Settlement.name = name;
	}
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		Settlement.location = location;
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		Settlement.people = people;
	}

	public RamzorColor getRamzorColor() {
		return ramzorColor;
	}

	public void setRamzorColor(RamzorColor ramzorColor) {
		Settlement.ramzorColor = ramzorColor;
	}
	////methods
	public RamzorColor calculateRamzorGrade() {
		
	}
	public double contagiousPercent() {

		int sick=0;
		for (int i = 0;i<people.size();++i) {
			//// i am not sure about people.get(i)
			if(people.get(i) instanceof Sick) {
				sick+=1;
			}
		}
		return (sick/people.size())*100;
	}
	
	public Point randomLocation() {
		double x=Math.random()
	}
	public boolean addPerson(Person a) {
		return people.add(a);
	}
	public boolean transferPerson(Person a,Settlement b) {
		return a.setSettlement(b);
		
	}
}

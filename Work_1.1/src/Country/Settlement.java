package Country;

import java.util.List;
import java.util.Random;

import Location.Location;
import Location.Point;
import Population.Person;
import Population.Sick;

public abstract class Settlement {
	
	
	private String name;
	private Location location;
	private List<Person> people;
	protected RamzorColor ramzorColor;



	public Settlement(String name,Location location,List<Person> people,RamzorColor ramzorColor) {
		this.name=name;
		this.location=location;
		this.people=people;
		this.ramzorColor=ramzorColor;
	}
	
	////methods
	public abstract RamzorColor calculateRamzorGrade() ;
	
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
		Random random = new Random();
        int x= random.nextInt(100);
        int y= random.nextInt(100);
        return new Point(x,y);
	}
	public boolean addPerson(Person a) {
		return people.add(a);
	}
    public boolean transferPerson(Person a,Settlement b) {
		return true; //a.setSettlement(b);
		
    }
}

package Population;


public class Vaccinated extends Person {
	
	private long vaccinationTime;

	public Vaccinated(long vaccinationTime) {
		super();
		this.vaccinationTime=vaccinationTime;
	}
	@Override
	public double contagionProbability() {
		// TODO Auto-generated method stub
		return 0;
	}

}

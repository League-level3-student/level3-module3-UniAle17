package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		
		
		double taxes;
		
		taxes= population*growthRate;
		taxes= taxes*(growthRate*.5);
		
		
		return taxes;
	}
	
}

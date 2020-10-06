package _01_AnimalFarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
	
	
	public static void main(String[] args) {
		
		List <Animal> farm = new ArrayList <Animal>();
		
		Cow moo = new Cow();
		Cow movie = new Cow();
		Chicken ruffles = new Chicken();
		Pig Alexander = new Pig();
		Pig herbert = new Pig();
		Sheep fluff = new Sheep();
		
		farm.add(moo);
		farm.add(ruffles);
		farm.add(Alexander);
		farm.add(fluff);
		farm.add(herbert);
		farm.add(movie);
		
		
		for (int i = 0; i < args.length; i++) {
			
			
			moo.makeNoise();
			movie.makeNoise();
			ruffles.makeNoise();
			Alexander.makeNoise();
			herbert.makeNoise();
			fluff.makeNoise();
			
			
		}
		
		
	}

}

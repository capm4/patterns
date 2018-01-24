package patters.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 22.01.2018.
 */
public class Team implements Developer {
	private List<Developer> developers = new ArrayList<>();
	public void addDevveloper (Developer developer){
		developers.add(developer);
	}
	public void remove(Developer developer){
		developers.remove(developer);
	}

	@Override
	public void operation() {
		System.out.println("create project....");
		for(Developer developer: developers){
			developer.operation();
		}
	}

}

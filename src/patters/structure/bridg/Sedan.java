package patters.structure.bridg;

/**
 * Created by Alex on 20.01.2018.
 */
public class Sedan extends Car {
	public Sedan(Made made) {
		super(made);
	}

	@Override
	void showType() {
		System.out.println("Sedan");
	}
}

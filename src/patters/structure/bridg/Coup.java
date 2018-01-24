package patters.structure.bridg;

/**
 * Created by Alex on 20.01.2018.
 */
public class Coup extends Car {
	public Coup(Made made) {
		super(made);
	}

	@Override
	void showType() {
		System.out.println("Coup");
	}
}

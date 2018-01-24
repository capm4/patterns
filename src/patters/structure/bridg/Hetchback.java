package patters.structure.bridg;

/**
 * Created by Alex on 20.01.2018.
 */
public class Hetchback extends Car {
	public Hetchback(Made made) {
		super(made);
	}

	@Override
	void showType() {
		System.out.println("hetchback");
	}
}

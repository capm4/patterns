package patters.structure.bridg;

/**
 * Created by Alex on 20.01.2018.
 */
public abstract class Car {
	Made made;

	public Car(Made made) {
		this.made = made;
	}
	abstract void showType();
	public void showDetails(){
		showType();
		made.setMade();
	}

}

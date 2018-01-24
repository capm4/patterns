package patters.structure.bridg;

/**
 * Created by Alex on 20.01.2018.
 */
public class Main {
	public static void main(String[] args) {
		Car car = new Hetchback(new BMW());
		car.showDetails();
	}
}

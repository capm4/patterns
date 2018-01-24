package patters.structure.decorator;

/**
 * Created by Alex on 22.01.2018.
 */
public abstract class CarDecorator extends Driver {
	Driver driver;

	public CarDecorator(Driver driver) {
		this.driver = driver;
	}

	@Override
	public void doo() {
			driver.doo();
	}
}

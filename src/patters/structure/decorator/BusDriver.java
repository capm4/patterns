package patters.structure.decorator;

/**
 * Created by Alex on 22.01.2018.
 */
public class BusDriver extends CarDecorator{

	public BusDriver(Driver driver) {
		super(driver);
	}
	private void oneMore(){
		System.out.println("I'm a bus driver");
	}
	public void doo(){
		driver.doo();
		oneMore();
	}

}

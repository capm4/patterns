package patters.structure.decorator;

/**
 * Created by Alex on 22.01.2018.
 */
public class Main {
	public static void main(String[] args) {
		CarDriver carDriver = new CarDriver();
		Main runner = new Main();
//		runner.doDrive(carDriver);
//		runner.doDrive(new BusDriver(carDriver));
		Driver driver = new BusDriver(new CarDriver());
		driver.doo();
	}
	public void doDrive(Driver driver){
		driver.doo();
	}
}

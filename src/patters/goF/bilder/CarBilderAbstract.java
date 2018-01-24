package patters.goF.bilder;

/**
 * Created by Alex on 19.01.2018.
 */
public abstract class CarBilderAbstract {
	Car car;
	void buildCar(){
		car = new Car();
	}
	abstract void setMark();
	abstract void setTranssmision();
	abstract void setSpeed();
	Car getCar(){return this.car;}
}

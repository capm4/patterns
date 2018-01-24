package patters.goF.bilder;

/**
 * Created by Alex on 19.01.2018.
 */
public class CarBilder {
	String mark  = "BMW";
	Transsmision transsmision = Transsmision.AUTO;
	int speed = 123;

	public CarBilder setMark(String mark) {
		this.mark = mark;
		return this;
	}

	public CarBilder setTranssmision(Transsmision transsmision) {
		this.transsmision = transsmision;
		return this;
	}

	public CarBilder setSpeed(int speed) {
		this.speed = speed;
		return this;
	}

	public Car carBilder(){
		Car car = new Car();
		car.setMark(mark);
		car.setTranssmision(transsmision);
		car.setSpeed(speed);
		return car;
	}
}

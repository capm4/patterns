package patters.goF.bilder;

/**
 * Created by Alex on 19.01.2018.
 */
public class Car {
	String mark;
	Transsmision transsmision;
	int speed;

	public void setMark(String mark) {
		this.mark = mark;
	}

	public void setTranssmision(Transsmision transsmision) {
		this.transsmision = transsmision;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car{" +
				"mark='" + mark + '\'' +
				", transsmision=" + transsmision +
				", speed=" + speed +
				'}';
	}
}

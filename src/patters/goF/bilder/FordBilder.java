package patters.goF.bilder;

/**
 * Created by Alex on 19.01.2018.
 */
public class FordBilder extends CarBilderAbstract {
	@Override
	void setMark() {
		car.setMark("Ford");
	}

	@Override
	void setTranssmision() {
		car.setTranssmision(Transsmision.MANUAL);
	}

	@Override
	void setSpeed() {
		car.setSpeed(150);
	}
}

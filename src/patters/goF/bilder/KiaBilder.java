package patters.goF.bilder;

/**
 * Created by Alex on 19.01.2018.
 */
public class KiaBilder extends CarBilderAbstract {
	@Override
	void setMark() {
		car.setMark("Kia");
	}

	@Override
	void setTranssmision() {
		car.setTranssmision(Transsmision.AUTO);
	}

	@Override
	void setSpeed() {
		car.setSpeed(200);
	}
}

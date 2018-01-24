package patters.goF.bilder;

/**
 * Created by Alex on 19.01.2018.
 */
public class Main {
	public static void main(String[] args) {
//		Car car = new CarBilder()
//				.setMark("as")
//				.setTranssmision(Transsmision.MANUAL)
//				.setSpeed(230)
//				.carBilder();
//		System.out.println(car);
		Director director = new Director();
		director.setCar(new KiaBilder());
		Car car = director.greatCar();
		System.out.println(car);
	}
}

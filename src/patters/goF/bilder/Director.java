package patters.goF.bilder;

/**
 * Created by Alex on 19.01.2018.
 */
public class Director {
	CarBilderAbstract carBilder;
	void setCar(CarBilderAbstract b){carBilder = b;}
	Car greatCar(){
		carBilder.setMark();
		carBilder.setTranssmision();
		carBilder.setSpeed();
		return carBilder.getCar();
	}

}

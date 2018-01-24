package patters.goF.factoryMethod;

/**
 * Created by Alex on 22.01.2018.
 */
public class Main {
	public static void main(String[] args) {
		WatchMaker makre = getWatchMaker("Rom");
		Watch watch = makre.createWatch();
		watch.showTime();
	}

	public static WatchMaker getWatchMaker(String s){
		if(s.equalsIgnoreCase("digital")){
			return new DigitalWatchMaker();
		}else if(s.equalsIgnoreCase("rome")){
			return new RomeWatchMaker();
		}
		throw new RuntimeException("No such Watch maker :"+s);
	}
}

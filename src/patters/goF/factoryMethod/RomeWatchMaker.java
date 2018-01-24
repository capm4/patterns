package patters.goF.factoryMethod;

/**
 * Created by Alex on 22.01.2018.
 */
public class RomeWatchMaker implements WatchMaker {
	@Override
	public Watch createWatch() {
		return new RomeWatch();
	}
}

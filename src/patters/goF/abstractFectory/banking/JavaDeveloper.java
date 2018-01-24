package patters.goF.abstractFectory.banking;

import patters.goF.abstractFectory.Developer;

/**
 * Created by Alex on 22.01.2018.
 */
public class JavaDeveloper implements Developer {
	@Override
	public void writeCode() {
		System.out.println("java developer writes code");
	}
}

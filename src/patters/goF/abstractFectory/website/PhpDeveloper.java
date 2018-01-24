package patters.goF.abstractFectory.website;

import patters.goF.abstractFectory.Developer;

/**
 * Created by Alex on 22.01.2018.
 */
public class PhpDeveloper implements Developer {
	@Override
	public void writeCode() {
		System.out.println("php developer wrotes code..");
	}
}

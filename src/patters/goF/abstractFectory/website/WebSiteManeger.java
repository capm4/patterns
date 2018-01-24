package patters.goF.abstractFectory.website;

import patters.goF.abstractFectory.Maneger;

/**
 * Created by Alex on 22.01.2018.
 */
public class WebSiteManeger implements Maneger {
	@Override
	public void writeCode() {
		System.out.println("Web site maneger manegers ...");
	}
}

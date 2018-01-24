package patters.goF.abstractFectory.website;

import patters.goF.abstractFectory.Developer;
import patters.goF.abstractFectory.Maneger;
import patters.goF.abstractFectory.ProgectTeamFactory;
import patters.goF.abstractFectory.Tester;

/**
 * Created by Alex on 22.01.2018.
 */
public class WebsiteTEamFactory implements ProgectTeamFactory {
	@Override
	public Developer createDeveloper() {
		return new PhpDeveloper();
	}

	@Override
	public Tester createTester() {
		return new MenualTester();
	}

	@Override
	public Maneger createMAnager() {
		return new WebSiteManeger();
	}
}

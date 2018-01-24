package patters.goF.abstractFectory.banking;

import patters.goF.abstractFectory.Developer;
import patters.goF.abstractFectory.Maneger;
import patters.goF.abstractFectory.ProgectTeamFactory;
import patters.goF.abstractFectory.Tester;

/**
 * Created by Alex on 22.01.2018.
 */
public class BankingTeamFactory implements ProgectTeamFactory {
	@Override
	public Developer createDeveloper() {
		return new JavaDeveloper();
	}

	@Override
	public Tester createTester() {
		return new QATester();
	}

	@Override
	public Maneger createMAnager() {
		return new BankingPM();
	}
}

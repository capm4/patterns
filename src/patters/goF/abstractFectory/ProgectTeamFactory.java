package patters.goF.abstractFectory;

/**
 * Created by Alex on 22.01.2018.
 */
public interface ProgectTeamFactory {
	Developer createDeveloper();
	Tester createTester();
	Maneger createMAnager();
}

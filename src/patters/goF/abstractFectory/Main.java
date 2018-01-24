package patters.goF.abstractFectory;

import patters.goF.abstractFectory.banking.BankingTeamFactory;
import patters.goF.abstractFectory.website.WebsiteTEamFactory;

/**
 * Created by Alex on 22.01.2018.
 */
public class Main {
	public static void main(String[] args) {
		ProgectTeamFactory team = createTeam("sit");
		Developer developer = team.createDeveloper();
		Tester tester = team.createTester();
		Maneger maneger = team.createMAnager();

		developer.writeCode();
		tester.writeCode();
		maneger.writeCode();
	}
	private static ProgectTeamFactory createTeam(String team){
		switch(team){
			case "banking":
				return new BankingTeamFactory();
			case "site":
				return new WebsiteTEamFactory();
			default: throw new RuntimeException("not such team " + team);
		}
	}
}

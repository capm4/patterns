package patters.structure.composite;

/**
 * Created by Alex on 22.01.2018.
 */
public class Main {
	public static void main(String[] args) {
		Developer javaFirst = new JavaDeveloper();
		Developer javaSecond = new JavaDeveloper();
		Developer cppDeveloper = new CppDeveloper();
		Team team = new Team();
		team.addDevveloper(javaFirst);
		team.addDevveloper(javaSecond);
		team.addDevveloper(cppDeveloper);
		Team team1 = new Team();
		team1.addDevveloper(new CppDeveloper());
		team1.addDevveloper(new CppDeveloper());
		team1.addDevveloper(new CppDeveloper());
		team.addDevveloper(team1);
		team.operation();
	}
}

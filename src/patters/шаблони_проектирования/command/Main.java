package patters.шаблони_проектирования.command;

/**
 * Created by Alex on 23.01.2018.
 */
public class Main {
	public static void main(String[] args) {
		Comp c = new Comp();
		User user = new User(new StartComputer(c), new StopComputer(c), new ResetComputer(c));
		user.start();
	}
}

package patters.шаблони_проектирования.visitors;

/**
 * Created by Alex on 24.01.2018.
 */
public class Main {
	public static void main(String[] args) {
		Project project = new Project();
		System.out.println("Junior works");
		project.beWritten(new JuniorDeveloper());
		System.out.println("Senior works");
		project.beWritten(new SeniorDeveloper());
	}
}

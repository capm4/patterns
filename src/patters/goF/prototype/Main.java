package patters.goF.prototype;

/**
 * Created by Alex on 22.01.2018.
 */
public class Main {
	public static void main(String[] args) {
		Project pr = new Project(1, "SRC", "Main");
		ProjectFactory pf = new ProjectFactory(pr);
		Project project = pf.cloneProject();
		System.out.println(pr);
		System.out.println(project);
	}
}

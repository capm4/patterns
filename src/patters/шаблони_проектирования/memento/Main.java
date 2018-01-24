package patters.шаблони_проектирования.memento;

/**
 * Created by Alex on 23.01.2018.
 */
public class Main {
	public static void main(String[] args) throws InterruptedException {
		Project project = new Project();
		GitHubPro gitHubPro = new GitHubPro();
		System.out.println("Writing code : version 1.0");
		project.setVersionAndDate("Version 1.0");
		System.out.println(project);
		System.out.println("Save on Git");
		gitHubPro.setSave(project.save());
		System.out.println("Writing new code...");
		System.out.println("save Version 2.0");
		Thread.sleep(5000);
		project.setVersionAndDate("Version 2.0.");
		System.out.println(project);
		System.out.println("Something went wrong ");
		System.out.println("Rolling back to Version 1.0");
		project.load(gitHubPro.getSave());
		System.out.println(project);
		System.out.println("new CODE !!!");
		project.setVersionAndDate("Version 3.0");
		gitHubPro.setSave(project.save());
		System.out.println("Save " + gitHubPro.getSave());
	}
}

package patters.goF.prototype;

/**
 * Created by Alex on 22.01.2018.
 */
public class ProjectFactory {
	Project project;

	public ProjectFactory(Project project) {
		this.project = project;
	}

	Project cloneProject(){
		return (Project) project.cope();
	}
}

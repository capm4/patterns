package patters.шаблони_проектирования.visitors;

/**
 * Created by Alex on 24.01.2018.
 */
public class Project implements ProjectElement {
	ProjectElement [] projectElements;

	public Project() {
		this.projectElements = new ProjectElement[]{
				new ProjectClass(), new DataBase(), new Test()};
	}

	@Override
	public void beWritten(Developer developer) {
		for (ProjectElement projectElement : projectElements){
			projectElement.beWritten(developer);
		}
	}
}

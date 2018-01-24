package patters.шаблони_проектирования.visitors;

/**
 * Created by Alex on 24.01.2018.
 */
public class ProjectClass implements ProjectElement {
	@Override
	public void beWritten(Developer developer) {
		developer.create(this);
	}
}

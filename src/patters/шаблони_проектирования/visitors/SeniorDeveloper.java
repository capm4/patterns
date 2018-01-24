package patters.шаблони_проектирования.visitors;

/**
 * Created by Alex on 24.01.2018.
 */
public class SeniorDeveloper implements Developer {
	@Override
	public void create(ProjectClass projectClass) {
		System.out.println("Senior writs ProjectClass");
	}

	@Override
	public void create(DataBase dataBase) {
		System.out.println("Sunior writs dataBase");
	}

	@Override
	public void create(Test test) {
		System.out.println("Senior writs Test");
	}
}

package patters.шаблони_проектирования.visitors;

/**
 * Created by Alex on 24.01.2018.
 */
public class JuniorDeveloper implements Developer {
	@Override
	public void create(ProjectClass projectClass) {
		System.out.println("Junior writes ProjectClass");
	}

	@Override
	public void create(DataBase dataBase) {
		System.out.println("Junior writs dataBase");
	}

	@Override
	public void create(Test test) {
		System.out.println("Junior writs Test");
	}
}

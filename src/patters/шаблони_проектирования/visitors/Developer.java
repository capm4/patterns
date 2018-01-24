package patters.шаблони_проектирования.visitors;

/**
 * Created by Alex on 24.01.2018.
 */
public interface Developer {
	void create(ProjectClass projectClass);
	void create(DataBase dataBase);
	void create(Test test);
}

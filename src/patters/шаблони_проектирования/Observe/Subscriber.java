package patters.шаблони_проектирования.Observe;

import java.util.List;

/**
 * Created by Alex on 23.01.2018.
 */
public class Subscriber implements Observer {
	String name;

	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void handlerEvend(List<String> vacancies) {
		System.out.println("Dear "+name+"\nWe have some vacancies"+vacancies);
	}
}

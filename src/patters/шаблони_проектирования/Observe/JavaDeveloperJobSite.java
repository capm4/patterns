package patters.шаблони_проектирования.Observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 23.01.2018.
 */
public class JavaDeveloperJobSite implements Observable {
	List<String> vacancies = new ArrayList<>();
	List<Observer> subscriebs = new ArrayList<>();
	public void addVacancie(String vacancie){
		this.vacancies.add(vacancie);
		notifyObservers();
	}
	public void removeVacancie(String vacancie){
		this.vacancies.remove(vacancie);
		notifyObservers();
	}

	@Override
	public void addObserver(Observer observer) {
		this.subscriebs.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.subscriebs.remove(observer);
	}

	@Override
	public void notifyObservers() {
	 for(Observer observer: subscriebs){
	 	observer.handlerEvend(vacancies);
	 }
	}
}

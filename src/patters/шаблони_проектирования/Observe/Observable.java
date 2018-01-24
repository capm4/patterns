package patters.шаблони_проектирования.Observe;

/**
 * Created by Alex on 23.01.2018.
 */
public interface Observable {
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
}

package patters.шаблони_проектирования.Observe;

/**
 * Created by Alex on 23.01.2018.
 */
public class Main {
	public static void main(String[] args) {
		JavaDeveloperJobSite site = new JavaDeveloperJobSite();
		site.addVacancie("V 1");
		site.addVacancie("V 2");
		site.addObserver(new Subscriber("Alex"));
		site.addObserver(new Subscriber("Oleg"));
		site.addObserver(new FileObserver());
		site.addVacancie("V 3");
		site.removeVacancie("V 2");

	}
}

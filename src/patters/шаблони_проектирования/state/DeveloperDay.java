package patters.шаблони_проектирования.state;

/**
 * Created by Alex on 24.01.2018.
 */
public class DeveloperDay {
	public static void main(String[] args) {
		Activity activity = new Sleep();
		Developer developer = new Developer();
		developer.setActivity(activity);
		for (int i = 0; i< 5; i++){
			developer.changeActivity();
		}
	}
}

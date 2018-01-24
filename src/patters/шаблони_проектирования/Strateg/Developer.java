package patters.шаблони_проектирования.Strateg;

/**
 * Created by Alex on 24.01.2018.
 */
public class Developer {
	Activity activity;

	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	public void justDoIt(){
		activity.justDoIt();
	}

}

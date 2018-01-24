package patters.шаблони_проектирования.state;

/**
 * Created by Alex on 24.01.2018.
 */
public class Developer {
	Activity activity;

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public void changeActivity(){
		if(activity instanceof Sleep){
			justDoIt();
			setActivity(new Trainig());
		}else if(activity instanceof Trainig){
			justDoIt();
			setActivity(new Coding());
		}else if(activity instanceof Coding){
			justDoIt();
			setActivity(new Reading());
		}else if(activity instanceof Reading){
			justDoIt();
			setActivity(new Sleep());
		}
	}
	public void justDoIt(){
		activity.justDoIt();
	}

}

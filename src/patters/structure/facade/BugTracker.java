package patters.structure.facade;

/**
 * Created by Alex on 22.01.2018.
 */
public class BugTracker {
	private boolean activeSpring;
	public boolean isActiveSpring(){
		return activeSpring;
	}
	public void startSpring(){
		System.out.println("Spring is start");
		activeSpring = true;
	}
	public void endSpring(){
		System.out.println("Spring is end");
		activeSpring = false;
	}

}

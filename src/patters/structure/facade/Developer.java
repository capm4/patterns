package patters.structure.facade;

/**
 * Created by Alex on 22.01.2018.
 */
public class Developer {
	public void doJobBeforDeadLinr(BugTracker bugTracker){
		if(bugTracker.isActiveSpring()){
			System.out.println("Developer is solving problems....");
		}else {
			System.out.println("developer reads....");
		}
	}

}

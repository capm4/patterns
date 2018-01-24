package patters.structure.facade;

/**
 * Created by Alex on 22.01.2018.
 */
public class WorkFlow {
	Job job = new Job();
	BugTracker bugTracker = new BugTracker();
	Developer developer = new Developer();

	public void solveProblems(){
		job.doJob();
		bugTracker.startSpring();
		developer.doJobBeforDeadLinr(bugTracker);
	}
}

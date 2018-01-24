package patters.шаблони_проектирования.command;

/**
 * Created by Alex on 23.01.2018.
 */
public class StopComputer implements Comand {
	Comp comp;

	public StopComputer(Comp comp) {
		this.comp = comp;
	}

	@Override
	public void execute() {
		comp.stop();
	}
}

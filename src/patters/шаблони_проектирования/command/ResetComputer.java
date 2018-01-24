package patters.шаблони_проектирования.command;

/**
 * Created by Alex on 23.01.2018.
 */
public class ResetComputer implements Comand {
	Comp comp;

	public ResetComputer(Comp comp) {
		this.comp = comp;
	}

	@Override
	public void execute() {
		comp.reset();
	}
}

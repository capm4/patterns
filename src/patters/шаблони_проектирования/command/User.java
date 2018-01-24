package patters.шаблони_проектирования.command;

/**
 * Created by Alex on 23.01.2018.
 */
public class User {
	Comand start;
	Comand stop;
	Comand reset;

	public User(Comand start, Comand stop, Comand reset) {
		this.start = start;
		this.stop = stop;
		this.reset = reset;
	}
	void start(){
		start.execute();
	}
	void stop(){stop.execute();}
	void reset(){reset.execute();}
}

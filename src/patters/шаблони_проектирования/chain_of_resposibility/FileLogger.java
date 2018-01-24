package patters.шаблони_проектирования.chain_of_resposibility;

/**
 * Created by Alex on 23.01.2018.
 */
public class FileLogger extends Logger {
	public FileLogger(int priority) {
		super(priority);
	}
	void write(String msg){
		System.out.println("Write file :"+msg);
	}
}

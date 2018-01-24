package patters.шаблони_проектирования.chain_of_resposibility;

/**
 * Created by Alex on 23.01.2018.
 */
public class SMSLogger extends Logger {
	public SMSLogger(int priority) {
		super(priority);
	}
	@Override
	void write(String msg) {
		System.out.println("SMS :"+msg);
	}

}

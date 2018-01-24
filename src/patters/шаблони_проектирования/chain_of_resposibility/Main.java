package patters.шаблони_проектирования.chain_of_resposibility;

/**
 * Created by Alex on 23.01.2018.
 */
public class Main {
	public static void main(String[] args) {
		Logger logger0 = new SMSLogger(Level.ERROR);
		Logger logger1 = new FileLogger(Level.DEBUG);
		Logger emailLogger = new EmailLogger(Level.INFO);
		logger1.setNextLogger(emailLogger);
		logger0.setNextLogger(logger1);

		logger0.writeMessage("Good ", Level.INFO);
		logger0.writeMessage("Debuging ", Level.DEBUG);
		logger0.writeMessage("Chux puh", Level.ERROR);
	}
}

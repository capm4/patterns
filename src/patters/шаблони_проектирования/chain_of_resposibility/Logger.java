package patters.шаблони_проектирования.chain_of_resposibility;

/**
 * Created by Alex on 23.01.2018.
 */
public abstract class Logger {
	public int priority;
	Logger nextLogger;

	public Logger(int priority) {
		this.priority = priority;
	}

	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void writeMessage(String msg, int level) {
		if (level <= priority) {
			write(msg);
		}
		if (nextLogger != null) {
			nextLogger.writeMessage(msg, level);
		}
	}
	abstract void write(String msg);
}

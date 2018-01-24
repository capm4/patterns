package patters.шаблони_проектирования.memento;

import java.util.Date;

/**
 * Created by Alex on 23.01.2018.
 */
public class Save {
	private final String version;
	private final Date date;

	public Save(String version) {
		this.version = version;
		this.date = new Date();
	}

	public String getVersion() {
		return version;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Save{" +
				"version='" + version + '\'' +
				", date=" + date +
				'}';
	}
}

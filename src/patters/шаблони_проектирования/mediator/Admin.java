package patters.шаблони_проектирования.mediator;

/**
 * Created by Alex on 23.01.2018.
 */
public class Admin implements User {
	Chat chat;
	String name;

	public Admin(Chat chat, String name) {
		this.chat = chat;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sendMessage(String message) {
		chat.sendMessage(message, this);
	}

	@Override
	public void getMessage(String message) {
		System.out.println(this.name+" get message : "+ message+".");
	}
}

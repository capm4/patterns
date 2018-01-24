package patters.шаблони_проектирования.mediator;

/**
 * Created by Alex on 23.01.2018.
 */
public class Main {
	public static void main(String[] args) {
		TextChat chat = new TextChat();
		Admin admin = new Admin(chat,"admin");
		User user1 = new SimpleUser(chat, "User1");
		User user2 = new SimpleUser(chat, "user2");
		chat.setAdmin(admin);
		chat.addUser(user1);
		chat.addUser(user2);
		chat.sendMessage("Ha ha ", user1);

	}
}

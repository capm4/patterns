package patters.шаблони_проектирования.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 23.01.2018.
 */
public class TextChat implements Chat {
	Admin admin;
	List<User> users = new ArrayList<>();

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public void addUser(User user){
		users.add(user);
	}

	@Override
	public void sendMessage(String message, User user) {
		for(User u: users){
			if(u != user){
				u.getMessage("user " + user.getName()+" send message : " + message);
			}
		}
		admin.getMessage(message);
	}
}

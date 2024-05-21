package model;

import java.util.List;

public class RegisteredUser {
	private List<User> listOfUser;
	public void addUser(User u) {
		listOfUser.add(u);
	}
	public void removeUser(User u) {
		listOfUser.remove(u);
	}
}

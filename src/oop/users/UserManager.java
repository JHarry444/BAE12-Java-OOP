package oop.users;

import java.util.ArrayList;

public class UserManager {

	public ArrayList<User> users = new ArrayList<>();

	public boolean addUser(User user) {
		boolean added = this.users.add(user);
		return added;
	}

//	public void addUser(int id, String username, String email) {
//		this.users.add(new User(id, username, email));
//	}

	public void removeUser(User user) {
		this.users.remove(user);
	}

	public void removeUserByName(String name) {
//		Bad example
//		for (User user : this.users) {
//			if (user.username == name) {
//				this.users.remove(user);
//			}
//		}

		ArrayList<User> toRemove = new ArrayList<>();
		for (User user : this.users) {
			if (user.username == name) {
				toRemove.add(user);
			}
		}
		this.users.removeAll(toRemove);
	}

	public User getUser(int index) {
		return this.users.get(index);
	}

	public User findByName(String name) {
		for (int i = 0; i < this.users.size(); i++) {
			if (this.getUser(i).username == name) {
				return this.getUser(i);
			}
		}
		return null;
	}

	public void print() {
		for (int i = 0; i < this.users.size(); i++) {
			this.getUser(i).print();
		}
	}
}

package oop.app;

import java.util.ArrayList;

import oop.users.User;

public class App {

	public static void main(String[] args) {
		User user1 = new User(1, "JHarry", "j@h.com"); // User line 15

		System.out.println("USER1: " + user1);

		ArrayList<User> users = new ArrayList<>();

		users.add(user1);
		users.add(new User(2, "JBizzle", "j@b.com"));
		users.add(new User(3, "Bloop", "bl@oop.com"));

		for (int i = 0; i < users.size(); i++) {
			User currentUser = users.get(i); // get users at index i from users list
			currentUser.print(); // User line 22-29
		}

	}
}

package oop.app;

import oop.users.User;

public class App {

	public static void main(String[] args) {
		User user1 = new User();
		user1.id = 1;
		user1.username = "JHarry";
		user1.email = "j@h.com";

		System.out.print("ID: ");
		System.out.println(user1.id);
		System.out.print("Username: ");
		System.out.println(user1.username);
		System.out.print("Email: ");
		System.out.println(user1.email);

		User user2 = new User();
		user2.id = 2;
		user2.username = "JBizzle";
		user2.email = "j@b.com";

		System.out.print("ID: ");
		System.out.println(user2.id);
		System.out.print("Username: ");
		System.out.println(user2.username);
		System.out.print("Email: ");
		System.out.println(user2.email);

		System.out.print("ID: ");
		System.out.println(user1.id);
		System.out.print("Username: ");
		System.out.println(user1.username);
		System.out.print("Email: ");
		System.out.println(user1.email);
	}
}

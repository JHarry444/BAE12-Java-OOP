package oop.app;

import java.util.ArrayList;
import java.util.List;

import oop.users.User;
import oop.users.UserManager;

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

		for (User user : users) {
//			users.remove(user); NEVER CHANGE THE LENGTH MID LOOP
			user.print();
		}

		ArrayList<Integer> nums = new ArrayList<>(List.of(3, 6, 9));

		nums.add(27);

		System.out.println(nums);

		UserManager manager = new UserManager();

		User user2 = new User(21, "bloop", "b@loop.com");
		System.out.println("MANAGER:");
		manager.addUser(user2);
		manager.addUser(user1);
		manager.addUser(new User(3, "paul", "paul@chuckle.com"));
		manager.removeUserByName("bloop");

		manager.print();
	}
}

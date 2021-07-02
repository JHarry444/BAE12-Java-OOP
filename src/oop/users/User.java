package oop.users;

public class User {

	public int id; // MY id

	public String username;

	public String email;

	public User() {
		System.out.println("W00t");
	}

	public User(int id, String username, String email) {
		this.id = id; // set MY id equal to the incoming id
		this.username = username;
		this.email = email;
		System.out.println("THIS: " + this);
	}

	public void print() {
		System.out.print("ID: ");
		System.out.println(this.id);
		System.out.print("Username: ");
		System.out.println(this.username);
		System.out.print("Email: ");
		System.out.println(this.email);
	}
}

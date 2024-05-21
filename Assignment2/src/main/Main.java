package main;

import java.util.Scanner;

import model.RegisteredUser;
import model.User;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		RegisteredUser list = new RegisteredUser();
		while (c!=3) {
			User user = new User();
			System.out.println("1. Create User");
			System.out.println("2. Reset Password");
			System.out.println("3. Exit");
			c = sc.nextInt();
			switch (c) {
			case 1: {
				String username;
				String password;
				System.out.print("User Name:");
				username = sc.next();
				System.out.print("Password:");
				password = sc.next();
				list.addUser(user.CreateUser(username, password));
				break;
			}
			case 2: {
				user.ResetPassword();
				break;
			}
			default:
			}
		}
		
	}
}

package model;

public class User {
	private String UserID;
	private String Password;
	private String Email;
	private String UserType;
	public User() {};
	public User(String userID, String password, String email, String userType) {
		UserID = userID;
		Password = password;
		Email = email;
		UserType = userType;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	public User CreateUser(String email, String password) {
		Email = email;
		Password = password;
		return new User("slfdlsflkgjkg", password, email, "tenant");
	}
	public void ResetPassword() {
		
	}
}

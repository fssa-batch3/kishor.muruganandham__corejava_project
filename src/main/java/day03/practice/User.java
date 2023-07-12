package day03.practice;

public class User {

	private String password;
    private String name;
    private String email;

	
	public User() {
		
	}
	
	public User(String name, String password, String email) {
		this.email = email;
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
	

}

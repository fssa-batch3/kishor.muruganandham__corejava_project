package day02.practice;

public class User {
    private int id;
    private String name;
    private String password;
    private String emailId;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmailId() {
        return emailId;
    }
    
    public static void main(String[] args) {
    	User user = new User();
    	user.setEmailId("kishor@gmail.com");
    	user.setId(5);
    	user.setName("Kishor");
    	user.setPassword("Password");
    	System.out.println(user.getEmailId());
    	System.out.println(user.getId());
    	System.out.println(user.getName());
    	System.out.println(user.getPassword());
    }
}


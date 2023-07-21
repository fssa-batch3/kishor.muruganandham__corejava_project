package day10.practice;

import java.util.ArrayList;

public class ValidateUser {

    int id;
    String name;
    String emailId;
    private ArrayList<ValidateUser> userList;

    public ValidateUser(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }

    public ValidateUser() {
        this.userList = new ArrayList<>();
    }

    public void register(ValidateUser user) throws UserAlreadyExistsException {

        for (ValidateUser i : userList) {
            if (i.emailId.equals(user.emailId)) {
                throw new UserAlreadyExistsException("User already exists");
            }
        }

        userList.add(user);
    }


}

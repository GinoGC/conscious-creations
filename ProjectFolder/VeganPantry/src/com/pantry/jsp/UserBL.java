package com.pantry.jsp;
import org.apache.tomcat.jni.User;

public class UserBL {
	String hashPassword(String password) {
        //method to hash the password for security purposes
        //for simplicity, just returning the same String
        return password;
    }

    public User validateUser(User user) {
        UserDAO userDao = new UserDAO();
        //password should not be stored in plainText
        //so let's hash it
        String password = hashPassword(user.getPassword());
        return userDao.getUserFromCredentials(user.getUsername(), password);
    }
}

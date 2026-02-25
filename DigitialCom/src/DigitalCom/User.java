package DigitalCom;

import java.util.HashMap;
import java.util.Map;

public class User implements IValidate {

  
    private Map<String, String> userDB = new HashMap<>();

    
    public void addUser(String username, String password) {

        if (userDB.containsKey(username)) {
            System.out.println("User already exists!");
        } else {
            userDB.put(username, password);
            System.out.println("User registered successfully.");
        }
    }

    
  
    public boolean isAuthenticated(String username, String password) {

        if (!userDB.containsKey(username)&& userDB.get(username).isEmpty() && userDB.get(password).isEmpty()) {
            return false;
        }

        return userDB.get(username).equals(password);
    }
}
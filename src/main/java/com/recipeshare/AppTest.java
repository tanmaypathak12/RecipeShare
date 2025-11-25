package com.recipeshare;

import com.recipeshare.dao.UserDAO;
import com.recipeshare.model.User;

public class AppTest {
    public static void main(String[] args) {
        try {
            UserDAO dao = new UserDAO();
            User u = new User("CLI User", "cliuser@example.com", "password123", "user");
            dao.save(u);
            System.out.println("Saved user id = " + u.getId());
            User loaded = dao.findByEmail("cliuser@example.com");
            System.out.println("Loaded user: " + loaded);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

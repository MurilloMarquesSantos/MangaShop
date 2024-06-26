package test;

import domain.InvalidLoginException;
import domain.User;

public class UserTest01 {
    public static void main(String[] args) throws InvalidLoginException {
        User.createNewUser("murillomarques@gmail.com", "Murillo Marques", "1234");
        User.login("murillomarques@gmail.com", "1234");
        User.showAllUsers();
    }
}

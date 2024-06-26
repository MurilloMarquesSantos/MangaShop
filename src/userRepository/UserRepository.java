package userRepository;

import domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    protected static List<User> users = new ArrayList<>();

    protected static void addUser(User user){
        users.add(user);
    }

    protected static List<User> getUsers() {
        return users;
    }


}

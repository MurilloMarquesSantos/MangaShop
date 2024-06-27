package domain;

import userRepository.UserRepository;


import java.util.Objects;

public class User extends UserRepository{
    private String email;
    private String name;
    private String password;

    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void createNewUser(String email, String name, String password) {
        User newUser = new User(email, name, password);
        UserRepository.addUser(newUser);
    }

    public static void login(String email, String password) throws InvalidLoginException {
        for (User user : UserRepository.users) {
            if (user.email.equals(email) && user.password.equals(password)) {
                System.out.println("User logged successfully. \nWelcome: " + user.getName());
                System.out.println("-------------------------");
                return;
            }
        }
        throw new InvalidLoginException();
    }

    public static void showAllUsers(){
        System.out.println(UserRepository.users);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(email);
        result = 31 * result + Objects.hashCode(password);
        return result;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

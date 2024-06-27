package userHistoric;

import domain.Manga;
import domain.NoUserFoundException;
import domain.User;
import userRepository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UserHistoric extends UserRepository {
    private static List<String> userHistoric = new ArrayList<>();

    public static void addHistoric(Manga manga) {
        userHistoric.add(manga.getTitle());
    }

    public static void showHistoric(String email) throws NoUserFoundException {
        for (User user : UserRepository.users) {
            if (user.getEmail().equals(email)) {
                String name = user.getName();
                System.out.println(name + " rent historic: ");
                for (String s : userHistoric) {
                    System.out.println("-" + s);
                }
                return;
            }
            throw new NoUserFoundException();


        }
    }
}

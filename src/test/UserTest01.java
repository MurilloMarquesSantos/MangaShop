package test;

import domain.AlreadyExistsException;
import domain.InvalidLoginException;
import domain.Manga;
import domain.User;
import mangaRent.RentalService;
import userHistoric.UserHistoric;

public class UserTest01 {
    public static void main(String[] args) throws InvalidLoginException, AlreadyExistsException {
        User.createNewUser("murillomarques@gmail.com", "Murillo Marques", "1234");
        User.login("murillomarques@gmail.com", "1234");
        Manga.orderByTitle();
        Manga.consultMangas();
        RentalService.rentManga(1, 2);
        UserHistoric.showHistoric("murillomarques@gmail.com");

    }
}

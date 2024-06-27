package test;

import domain.AlreadyExists;
import domain.InvalidLoginException;
import domain.Manga;
import domain.User;
import mangaRent.RentalService;
import mangaRepository.MangaRepository;

public class UserTest01 {
    public static void main(String[] args) throws InvalidLoginException, AlreadyExists {
        User.createNewUser("murillomarques@gmail.com", "Murillo Marques", "1234");
        User.login("murillomarques@gmail.com", "1234");
        Manga.orderByTitle();
        Manga.consultMangas();
        RentalService.rentManga(1, 2);

    }
}

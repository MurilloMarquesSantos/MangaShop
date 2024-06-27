package test;

import domain.*;
import mangaRent.RentalService;
import payment.PaymentMethod;
import userHistoric.UserHistoric;

public class UserTest01 {
    public static void main(String[] args) throws InvalidLoginException, AlreadyExistsException, NoUserFoundException {
        User.createNewUser("murillomarques@gmail.com", "Murillo Marques", "1234");
        User.login("murillomarques@gmail.com", "1234");
        Manga.orderByTitle();
        Manga.consultMangas();
        RentalService.rentManga(1, 2);
        PaymentMethod.CREDIT.interest();
        UserHistoric.showHistoric("murillomarques@gmail.com");

    }
}

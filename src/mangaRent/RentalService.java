package mangaRent;

import domain.Manga;
import domain.User;
import mangaRepository.MangaRepository;
import userHistoric.UserHistoric;
import userRepository.UserRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RentalService extends MangaRepository {

    public static List<Manga> mangaPrice = new ArrayList<>();

    public static void rentManga(Integer id) {
        LocalDateTime rentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM");
        LocalDateTime rentExpire = rentTime.plusDays(30);
        List<Manga> rentedManga = MangaRepository.mangas.stream()
                .filter(rm -> rm.getId().equals(id))
                .toList();
        mangaPrice.addAll(rentedManga);
        System.out.println("Chosen manga: ");
        for (Manga manga : rentedManga) {
            System.out.println("-" + manga.getTitle());
            System.out.println("Manga price: " + manga.getPrice());
            UserHistoric.addHistoric(manga);
        }
        System.out.println("Manga rented in: "+ rentTime.format(formatter));
        System.out.println("This manga will be able to read until" + rentExpire.format(formatter));
    }

    public static void rentManga(Integer id, Integer id2) {
        LocalDateTime rentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM");
        LocalDateTime rentExpire = rentTime.plusDays(30);
        List<Manga> chosenManga = MangaRepository.mangas.stream()
                .filter(rm -> rm.getId().equals(id))
                .toList();
        List<Manga> chosenManga2 = MangaRepository.mangas.stream()
                .filter(rm -> rm.getId().equals(id2))
                .toList();
        List<Manga> rentedManga = new ArrayList<>();
        rentedManga.addAll(chosenManga);
        rentedManga.addAll(chosenManga2);
        mangaPrice.addAll(rentedManga);
        System.out.println("Chosen mangas: ");
        for (Manga manga : rentedManga) {
            System.out.println("-" + manga.getTitle());
            System.out.println("Manga price: " + manga.getPrice());
            System.out.println("-");
            UserHistoric.addHistoric(manga);


        }
        System.out.println("Mangas rented in: "+ rentTime.format(formatter));
        System.out.println("These mangas will be able to read until: " + rentExpire.format(formatter));
        System.out.println("-------------------------");

    }


}



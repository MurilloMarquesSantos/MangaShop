package mangaRent;

import domain.Manga;
import domain.User;
import mangaRepository.MangaRepository;
import userHistoric.UserHistoric;
import userRepository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class RentalService extends MangaRepository {

    public static List<Manga> mangaPrice = new ArrayList<>();

    public static void rentManga(Integer id) {
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
    }

    public static void rentManga(Integer id, Integer id2) {
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
        System.out.println("-------------------------");

    }


}



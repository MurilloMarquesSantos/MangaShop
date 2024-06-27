package mangaRepository;

import domain.Manga;

import java.util.ArrayList;
import java.util.List;

public class MangaRepository {
    protected static List<Manga> mangas = new ArrayList<>(List.of(
            new Manga(1, "Boku no hero", 390, 35.55),
            new Manga(2, "One piece", 1080, 60.99),
            new Manga(3, "Bleach", 698, 43.80),
            new Manga(4, "Naruto", 700, 20.70),
            new Manga(5, "Berserk", 374, 15.20),
            new Manga(6, "Vinland Saga", 200, 25.00),
            new Manga(7, "Fire force", 304, 32.50),
            new Manga(8, "Dragon ball Z", 325, 12.80)
    ));


}

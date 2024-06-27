package domain;

import mangaRepository.MangaRepository;

import java.util.Comparator;


public class Manga extends MangaRepository {
    private Integer id;
    private String title;
    private int chapters;
    private Double price;

    public Manga(Integer id, String title, int chapters, Double price) {
        this.id = id;
        this.title = title;
        this.chapters = chapters;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", chapters=" + chapters +
                ", price=" + price +
                '}';
    }



    public static void consultMangas(){
        System.out.println("Available mangas to rent: ");
        for (Manga manga : MangaRepository.mangas) {
            System.out.println(manga);
        }
        System.out.println("-------------------------");
    }

    public static void orderByTitle(){
        System.out.println("Mangas ordered by title");
        MangaRepository.mangas.sort(Comparator.comparing(Manga::getTitle));
    }
    public static void orderByPrice(){
        System.out.println("Mangas ordered by price");
        MangaRepository.mangas.sort(Comparator.comparing(Manga::getPrice));
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getId() {
        return id;
    }

}

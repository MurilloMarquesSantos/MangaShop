package payment;

import domain.Manga;
import mangaRent.RentalService;

public enum PaymentMethod {
    DEBIT {
        @Override
        public void interest() {
            for (Manga manga : RentalService.mangaPrice) {
                System.out.println(manga.getTitle() + " price: " + manga.getPrice());
                System.out.println("-------------------------");

            }
        }

    },
    CREDIT {
        @Override
        public void interest() {
            System.out.println("Credits purchases have 10% interest included");
            for (Manga manga : RentalService.mangaPrice) {
                double newPrice = manga.getPrice() + (manga.getPrice() * 0.1);
                String newPriceFormatted = String.format("%.2f", newPrice);
                System.out.println(manga.getTitle() + " new price is: " + newPriceFormatted);
            }
            System.out.println("-------------------------");

        }
    };

    public abstract void interest();

}





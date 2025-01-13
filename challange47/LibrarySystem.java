package challange47;

public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book(101, "gita", "acharyaPrashant", "111");
        magazine magazine = new magazine(102, "conjuring", "jamesBon", 5);
        DVD dvd = new DVD(103, "HarryPorter", "NileshRathod", 120);

        System.out.println("\nBook isbn : " + book.getIsbn());
        book.checkOut();
        book.returnItem();
        book.displayBookDetails();

        System.out.println("\nMagazine issue Number : " + magazine.getIssueNumber());
        magazine.checkOut();
        magazine.returnItem();
        magazine.displayMagazineDetails();

        System.out.println("\nDVD duration : " + dvd.getDuration() + " minutes");
        dvd.checkOut();
        dvd.returnItem();
        dvd.displayDVDDetails();
    }
}
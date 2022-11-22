package lab_2_3;

public class BookTest {

    public static void main(String[] args) {
        Book book = new Book("Human name", "Human book title", "15.11.2022", true);
        System.out.println("Book title: " + book.getTitle());
        System.out.println("Book author: " + book.getAuthor());
        System.out.println("Book release date: " + book.getReleaseDate());
        System.out.println("Is this book cool? " + book.isCool());
    }
}

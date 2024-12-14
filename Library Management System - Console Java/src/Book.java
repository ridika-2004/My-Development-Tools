public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int publicationYear;

    public Book(String title, String author, String ISBN, int publicationYear) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }
}

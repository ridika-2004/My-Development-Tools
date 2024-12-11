import java.util.ArrayList;
import java.util.List;

public abstract class User {
    protected String name;
    protected String userId;
    protected int borrowingLimit;
    protected List<Book> borrowedBooks;

    public User() {
        borrowedBooks = new ArrayList<>();
    }

    public boolean canBorrow() {
        return borrowedBooks.size() < borrowingLimit;
    }

    public void borrowBook(Book book) {
        if (canBorrow()) {
            borrowedBooks.add(book);
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println(name + " cannot borrow more books (Limit: " + borrowingLimit + ").");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " was not borrowed by " + name + ".");
        }
    }
}
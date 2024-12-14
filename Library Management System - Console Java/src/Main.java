public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "12345", 1925);
        Book book2 = new Book("1984", "George Orwell", "67890", 1949);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "11223", 1960);


        User student = new Student("Alice");
        User faculty = new Faculty("Dr. Smith");


        student.borrowBook(book1);
        student.borrowBook(book2);
        student.borrowBook(book3);
        student.borrowBook(new Book("Brave New World", "Aldous Huxley", "44556", 1932));
        student.borrowBook(new Book("Fahrenheit 451", "Ray Bradbury", "77889", 1953));
        student.borrowBook(new Book("Animal Farm", "George Orwell", "99001", 1945)); // Exceeds limit

        faculty.borrowBook(book1);
        faculty.borrowBook(book2);

        // Return a book
        student.returnBook(book2);
        student.borrowBook(new Book("Animal Farm", "George Orwell", "99001", 1945)); // Now allowed

        // Check borrowing logic
        System.out.println("Student borrowed books: " + student.borrowedBooks.size());
        System.out.println("Faculty borrowed books: " + faculty.borrowedBooks.size());
    }
}
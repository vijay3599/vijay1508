import java.util.*;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is currently not available.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book was not borrowed.");
        }
    }

    public void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Availability: " + (available ? "Available" : "Borrowed"));
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn));
        System.out.println("Book added successfully!");
    }

    public Book searchBook(String query) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getAuthor().equalsIgnoreCase(query)) {
                book.getDetails();
                return book;
            }
        }
        System.out.println("Book not found.");
        return null;
    }

    public void borrowBook(String query) {
        Book book = searchBook(query);
        if (book != null) {
            book.borrowBook();
        }
    }

    public void returnBook(String query) {
        Book book = searchBook(query);
        if (book != null) {
            book.returnBook();
        }
    }

    public void listAvailableBooks() {
        System.out.println("\nAvailable Books:");
        boolean found = false;
        for (Book book : books) {
            if (book.isAvailable()) {
                book.getDetails();
                System.out.println("--------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books available.");
        }
    }
}

public class libraryMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. List Available Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter book author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String isbn = sc.nextLine();
                    library.addBook(title, author, isbn);
                    break;
                case 2:
                    System.out.print("Enter book title or author: ");
                    String querySearch = sc.nextLine();
                    library.searchBook(querySearch);
                    break;
                case 3:
                    System.out.print("Enter book title or author to borrow: ");
                    String queryBorrow = sc.nextLine();
                    library.borrowBook(queryBorrow);
                    break;
                case 4:
                    System.out.print("Enter book title or author to return: ");
                    String queryReturn = sc.nextLine();
                    library.returnBook(queryReturn);
                    break;
                case 5:
                    library.listAvailableBooks();
                    break;
                case 6:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}

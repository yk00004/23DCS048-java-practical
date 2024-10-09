


import java.util.*;

class Book 
{
    String title;
    String author;
    boolean isAvailable;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
}

class Library 
{

    List<Book> books = new ArrayList<>();

    void addBook(String title, String author) {

        books.add(new Book(title, author));
        System.out.println("Book added: " + title);
    }

    void searchBook(String title) {

        for (Book book : books) 
        {
            if (book.title.equalsIgnoreCase(title))
            {
                System.out.println("Found: " + book.title + " by " + book.author + " | Available: " + book.isAvailable);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void borrowBook(String title) {

        for (Book book : books) 
        {
            if (book.title.equalsIgnoreCase(title)) 
            {
                if (book.isAvailable) 
                {
                    book.isAvailable = false;
                    System.out.println("You have borrowed: " + book.title);
                } 
                else
                {
                    System.out.println("Sorry, this book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void returnBook(String title) {

        for (Book book : books) 
        {
            if (book.title.equalsIgnoreCase(title)) 
            {
                if (!book.isAvailable) 
                {
                    book.isAvailable = true;
                    System.out.println("You have returned: " + book.title);
                }
                else 
                {
                    System.out.println("This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void displayBooks() {

        System.out.println("\nAvailable Books:");

        for (Book book : books) 
        {
            System.out.println(book.title + " by " + book.author + " | Available: " + book.isAvailable);
        }
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(title, author);
                    break;

                case 2:
                    System.out.print("Enter book title to search: ");
                    title = scanner.nextLine();
                    library.searchBook(title);
                    break;

                case 3:
                    System.out.print("Enter book title to borrow: ");
                    title = scanner.nextLine();
                    library.borrowBook(title);
                    break;

                case 4:
                    System.out.print("Enter book title to return: ");
                    title = scanner.nextLine();
                    library.returnBook(title);
                    break;

                case 5:
                    library.displayBooks();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}

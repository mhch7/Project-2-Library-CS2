import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Library lib = new Library();
    Scanner sc = new Scanner(System.in);
    boolean menu = false;

    while (!menu) {
    System.out.println("1. Add a Book");
    System.out.println("2. List All Books");
    System.out.println("3. Find book (by title)");
    System.out.println("4. Find all books (by author)");
    System.out.println("5. Quit");

int option = sc.nextInt();

      if (option == 1) {
        System.out.println("Enter book title");
        sc.nextLine();
        String title = sc.nextLine();

        System.out.println("Enter author");
        String author = sc.nextLine();

        System.out.println("Enter publication year");
        int year = sc.nextInt();

        lib.add(new Book(title, author, year));
      
      } else if (option == 2) {
        lib.listAllBooks();
      
      } else if (option == 3) {
        System.out.println("Enter book's title");
        sc.nextLine();
        String findTitle = sc.nextLine();
        lib.findBookByTitle(findTitle);
      
      } else if (option == 4) {
        System.out.println("Enter book's author");
        sc.nextLine();
        String findAuthor = sc.nextLine();
        lib.findAllBooksByAuthor(findAuthor);

      } else if (option == 5) {
        System.out.println("Bye");
        menu = true;
        System.exit(1);
      
      } else {
        System.out.println("Invalid input");
      }
  }
}
}
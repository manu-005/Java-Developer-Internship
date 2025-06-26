import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n1.Add Book\n2.Add User\n3.Show Books\n4.Show Users\n5.Issue Book\n6.Return Book\n7.Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String t = sc.nextLine();
                    System.out.print("Author: ");
                    String a = sc.nextLine();
                    System.out.print("ISBN: ");
                    String i = sc.nextLine();
                    lib.addBook(new Book(t, a, i));
                    break;
                case 2:
                    System.out.print("Name: ");
                    String n = sc.nextLine();
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    lib.addUser(new User(n, id));
                    break;
                case 3: lib.showBooks(); break;
                case 4: lib.showUsers(); break;
                case 5:
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("User ID: ");
                    int uid = sc.nextInt();
                    lib.issueBook(isbn, uid);
                    break;
                case 6:
                    System.out.print("Enter ISBN: ");
                    String retIsbn = sc.nextLine();
                    lib.returnBook(retIsbn);
                    break;
                case 7:
                    System.out.println("Bye!");
                    return;
            }
        }
    }
}

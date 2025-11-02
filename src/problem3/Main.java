package problem3;
import java.util.Scanner;

public class Main {
     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of documents (n): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Library library = new Library(n);

        int choice;
        do {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add Document");
            System.out.println("2. Display All Documents");
            System.out.println("3. Display Authors");
            System.out.println("4. Delete Document");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    addDocument(library);
                    break;
                case 2:
                    library.displayDocuments();
                    break;
                case 3:
                    library.displayAuthors();
                    break;
                case 4:
                    deleteDocument(library);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);
        scanner.close();

    }

    private static void addDocument(Library library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select type of document to add:");
        System.out.println("1. Book");
        System.out.println("2. Novel");
        System.out.println("3. Textbook");
        System.out.println("4. Magazine");
        System.out.println("5. Dictionary");
        System.out.print("Your choice: ");
        int type = scanner.nextInt();
        scanner.nextLine();

        switch (type) {
            case 1:
                System.out.print("Enter title: ");
                String bTitle = scanner.nextLine();
                System.out.print("Enter author: ");
                String bAuthor = scanner.nextLine();
                System.out.print("Enter number of pages: ");
                int pages = scanner.nextInt();
                scanner.nextLine();
                library.add(new Book(bTitle, bAuthor, pages));
                break;

            case 2:
                System.out.print("Enter title: ");
                String nTitle = scanner.nextLine();
                System.out.print("Enter author: ");
                String nAuthor = scanner.nextLine();
                System.out.print("Enter number of pages: ");
                int nPages = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                library.add(new Novel(nTitle, nAuthor, nPages, price));
                break;

            case 3:
                System.out.print("Enter title: ");
                String tTitle = scanner.nextLine();
                System.out.print("Enter author: ");
                String tAuthor = scanner.nextLine();
                System.out.print("Enter number of pages: ");
                int tPages = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter level: ");
                String level = scanner.nextLine();
                library.add(new Textbook(tTitle, tAuthor, tPages, level));
                break;

            case 4:
                System.out.print("Enter title: ");
                String mTitle = scanner.nextLine();
                System.out.print("Enter month: ");
                String month = scanner.nextLine();
                System.out.print("Enter year: ");
                int year = scanner.nextInt();
                scanner.nextLine();
                library.add(new Magazine(mTitle, month, year));
                break;

            case 5:
                System.out.print("Enter title: ");
                String dTitle = scanner.nextLine();
                System.out.print("Enter language: ");
                String language = scanner.nextLine();
                library.add(new Dictionary(dTitle, language));
                break;

            default:
                System.out.println("Invalid type.");
        }
        scanner.close();
    }

    private static void deleteDocument(Library library){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the record of the document to delete: ");
        int record = scanner.nextInt();
        Document doc = library.document(record);
        if (doc == null) {
            System.out.println("Document not found.");
            scanner.close();
            return;
        }

        boolean deleted = library.delete(doc);

        if (deleted) {
            System.out.println("Document deleted successfully.");
        } else {
            System.out.println("Document not found.");
        }
        scanner.close();
    }
}

package cp_11_12;

import java.util.Scanner;

public class BookInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title, author, publisher, publicationDate;
        String eTitle, eAuthor, ePublisher, ePublicationDate, edition;
        int numVolumes;

        title = scanner.nextLine();
        author = scanner.nextLine();
        publisher = scanner.nextLine();
        publicationDate = scanner.nextLine();

        eTitle = scanner.nextLine();
        eAuthor = scanner.nextLine();
        ePublisher = scanner.nextLine();
        ePublicationDate = scanner.nextLine();
        edition = scanner.nextLine();
        numVolumes = scanner.nextInt();

        Book myBook = new Book(title, author, publisher, publicationDate);
        Encyclopedia myEncyclopedia = new Encyclopedia(eTitle, eAuthor, ePublisher, ePublicationDate, edition, numVolumes);

        System.out.println(myBook);
        System.out.println(myEncyclopedia);
    }
}

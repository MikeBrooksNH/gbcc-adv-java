package cp_11_12;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private String publicationDate;

    private String bookInfo() {
        return new StringBuilder()
                .append("\n   Title: ").append(title)
                .append("\n   Author: ").append(author)
                .append("\n   Publisher: ").append(publisher)
                .append("\n   Publication Date: ").append(publicationDate)
                .toString();
    }

    //Constructors
    public Book() {
        this(null, null, null, null);
    }

    public Book(String title, String author, String publisher, String publicationDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
    }

    //Accessor and mutator methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getBookInfo() {
        return bookInfo();
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Book Information: ")
                .append(bookInfo()).append('\n').toString();
    }
}

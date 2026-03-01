package Constructor;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("The Secret", "Rodhoan Rymn");
        Book book3 = new Book("Rich Dad Poor Dad", "Robert", 200);
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPrice());
        System.out.println(book2.getTitle());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getPrice());
        System.out.println(book3.getTitle());
        System.out.println(book3.getAuthor());
        System.out.println(book3.getPrice());
    }
}

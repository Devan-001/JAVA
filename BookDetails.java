class LibraryItem{
    public String title;
    protected String author;
    private double price;

    LibraryItem(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
class  Book extends LibraryItem{
    String publisher;
    int edition;

    Book(String title,String author,double price,String publisher,int edition){
        super(title,author,price);
        this.publisher = publisher;
        this.edition = edition;
    }
    void displayDetails(){
        System.out.println("Book Details");
        System.out.println("--------------");
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Publisher : "+publisher);
        System.out.println("Edition : "+edition);
        System.out.println("Price : "+getPrice());
    }
}
public class BookDetails {
    public static void main(String[] args){
        Book b  = new Book("Java Programming","Herbert Schildt",650,"McGraw Hill",12);
        b.displayDetails();
    }
}
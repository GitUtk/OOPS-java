class Book{
    final static  String libraryName="Sunrise Public Library";
    static int bookCount=0;
    private String title;
    private String author;
    private Double price;
    private String isbn; 
    Book(String title,String author,Double price,String isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        bookCount++;
    }
    //getter
    
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return  author;
    }
    public Double getPrice(){
        return  price;
    }

    //setter
    public void setPrice(double p){
        this.price = p;
    }
    public void setTitle(String t){
        this.title = t;
    }
    public void setPrice(String a){
        this.author = a;
    }
};

public class LibraryTest {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "J. Author", 350.0, "ISBN001");
        Book b2 = new Book("OOP Concepts", "K. Writer", 420.0, "ISBN002");
        System.out.println(b1.getTitle() + " by " + b1.getAuthor());
        System.out.println("Price: " + b2.getPrice());
        System.out.println("Library: " + Book.libraryName);
        System.out.println("Total books added: " + Book.bookCount);
    }
}
package Week8;

public class Book {

    // 2. You are developing a library management system and need to implement a
    // Book class. The Book class should have private instance variables for the
    // book title, author name, and publication year. Implement appropriate getter
    // and setter methods to ensure encapsulation. Additionally, include a private
    // variable to track the availability of the book (e.g., true if available,
    // false if borrowed), and provide a public method to borrow the book, updating
    // its availability status.

    private String title;
    private String author_name;
    private int published_year;
    private boolean availability;

    public boolean isAvailability() {
        return availability;
    }

    Book(String title,String author_name,int published_year){
        this.title = title;
        this.author_name = author_name;
        this.published_year = published_year;
        this.availability = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public int getPublished_year() {
        return published_year;
    }

    public void setPublished_year(int published_year) {
        this.published_year = published_year;
    }

    public void borrow(String title){
        if(title == this.title){
            System.out.println("Book borrowed");
            this.availability = false;
        } else {
            System.out.println("Book not avaivalable");
        }
    }

}

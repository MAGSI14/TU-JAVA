public class Books extends Products{
    private String author;
    private String title;

    public Books(double price, int prodNumber, String author, String title) {
        super(price, prodNumber);
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double checkPromo() {
        return getPrice()*0.85;
    }
}

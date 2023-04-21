public class Book extends Product {
    private String author;
    private int pages;

    public Book(int id, String name, double price, int quantity, String author, int pages,String section) {
        super(id, name, price, quantity,section);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return super.toString() + "Author: " + author + "\nPages: " + pages+"\n";
    }   
}


// Implementation for Book media, representing a book in the media library
public class Book implements Media {
    private String title;     // Title of the book
    private String author;    // Author of the book
    private double price;     // Price of the book

    // Constructor to initialize book attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to update the price of the book
    @Override
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    // Method to retrieve the current price of the book
    @Override
    public double getPrice() {
        return price;
    }

    // Method to retrieve the title of the book
    @Override
    public String getTitle() {
        return title;
    }

    // Method to represent the book as a string
    @Override
    public String toString() {
        return "Book: " + title + " by " + author + ", Price: $" + price;
    }
}
